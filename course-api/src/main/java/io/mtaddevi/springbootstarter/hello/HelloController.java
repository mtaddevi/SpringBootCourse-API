package io.mtaddevi.springbootstarter.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	//add request mapping
	
	@RequestMapping("/hello")
	public String sayHi() {
		return "hi";
	}
	
}
