package tests.aniket.springboot.testspringboot;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import tests.aniket.springboot.testspringboot.beans.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	private static final String messTemp = "Hello %s"; 
	private final AtomicLong idGen = new AtomicLong();
	
	/*
	 * This code uses Spring @RestController annotation, which marks the class as a
	 * controller where every method returns a domain object instead of a view. It
	 * is shorthand for including both @Controller and @ResponseBody.
	 */
	//provide Object of the Representation on each hit
	@GetMapping("/unsecuredV2")
	public List<EligibilityInputs> getGreetingsObj(
			//@RequestParam(value = "name",defaultValue = "append \"?name=something\"")
			//String name
			) {
		//return new GreetingsWithName(idGen.incrementAndGet(), String.format(messTemp, name));
		return EligibilityWorker.getInstance().getEligRecords();
	}
	
	
	
}
