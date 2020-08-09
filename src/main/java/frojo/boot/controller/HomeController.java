package frojo.boot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	
	private static final Logger log = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping("/home")
	public String index() {
		log.info("hello");
		return "Hello from home!";
	}
}
