package controllers;

import play.libs.streams.ActorFlow;
import play.mvc.*;

import javax.inject.Inject;

import actor.MyWebSocketActor;
import akka.actor.ActorSystem;
import akka.stream.Materializer;
import akka.stream.javadsl.*;

/**
 * This controller contains an action to handle HTTP requests to the
 * application's home page.
 */
public class HomeController extends Controller {
	private final ActorSystem actorSystem;
	private final Materializer materializer;

	@Inject
	public HomeController(ActorSystem actorSystem, Materializer materializer) {
		this.actorSystem = actorSystem;
		this.materializer = materializer;
	}

	// JSON Socket
	public WebSocket jsonSocket() {
		  return WebSocket.Json.accept(
		      request -> ActorFlow.actorRef(MyWebSocketActor::props, actorSystem, materializer));
		}

	// String socket
	public WebSocket socket() {
		return WebSocket.Text.accept(request -> {
			// log the message to stdout and send response back to client
			return Flow.<String>create().map(msg -> {
				System.out.println(msg);
				return "I received your message: " + msg;
			});
		});
	}

	/**
	 * An action that renders an HTML page with a welcome message. The configuration
	 * in the <code>routes</code> file means that this method will be called when
	 * the application receives a <code>GET</code> request with a path of
	 * <code>/</code>.
	 */

	public Result hello(String name) {
		return ok(views.html.hello.render(name));
	}

	public Result index() {
		return ok(views.html.index.render());
	}

	public Result explore() {
		return ok(views.html.explore.render());
	}

	public Result tutorial() {
		return ok(views.html.tutorial.render());
	}
}
