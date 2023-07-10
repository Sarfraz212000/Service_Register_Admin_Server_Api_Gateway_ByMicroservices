package in.saffu.fegin;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("Greet-Api")
public interface FigenClientMsg {
	
	@GetMapping("/greet")
	public String invokeGreetApi();

}
