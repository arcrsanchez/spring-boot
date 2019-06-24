package guru.springframework.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import guru.springframework.services.HelloWorldService;

@Controller
public class GreetingController {
	
	private HelloWorldService helloWorldService;
	
	private HelloWorldService helloWorldServiceGerman;
	
	private HelloWorldService helloWorldSeriveFrench;
	
	@Autowired
	@Qualifier("french")
	public void setHelloWorldSeriveFrench(HelloWorldService helloWorldSeriveFrench) {
		this.helloWorldSeriveFrench = helloWorldSeriveFrench;
	}

	@Autowired
	public void setHelloWorldService(HelloWorldService helloWorldService) {
		this.helloWorldService = helloWorldService;
	}
	
	@Autowired
	@Qualifier("helloWorldGerman")
	public void setHelloWorldServiceGerman(HelloWorldService helloWorldServiceGerman) {
		this.helloWorldServiceGerman = helloWorldServiceGerman;
	}
	
	public String sayHello() {
		String greeting = helloWorldService.getGteeting();
		
		System.out.println(greeting
				+"\n"+helloWorldServiceGerman.getGteeting()
				+"\n"+helloWorldSeriveFrench.getGteeting());
		
		return greeting;
	}
	
}
