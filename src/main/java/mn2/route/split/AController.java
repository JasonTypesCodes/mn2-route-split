package mn2.route.split;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;

@Controller("/hello")
public class AController {

	@Get("/{name}")
	@Produces(MediaType.TEXT_PLAIN)
	public String sayHello(String name) {
		return "Hello " + name;
	}

	@Get("/Tom")
	@Produces(MediaType.TEXT_PLAIN)
	public String sayHelloToTom() {
		return "Hey Tom!  It's been a long time.  How have you been?";
	}

}
