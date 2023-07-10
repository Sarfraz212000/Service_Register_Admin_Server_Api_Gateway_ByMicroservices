package in.saffu.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.saffu.fegin.FigenClientMsg;

@RestController
public class WelcomeMsg {
	
	@Autowired
	private FigenClientMsg feign;
	
	@GetMapping("/welcome")
	public String welcomeMsg() {
		String invokeGreetApi = feign.invokeGreetApi();
		return invokeGreetApi+",WELCOME TO INDIA";
	}

}
