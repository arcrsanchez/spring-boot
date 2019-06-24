package guru.springframework.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import guru.springframework.services.HelloWorldFactory;
import guru.springframework.services.HelloWorldService;

@Configuration
public class HelloConfig {
	
	@Bean
	public HelloWorldFactory helloWorldFactory() {
		return new HelloWorldFactory();
	}
	
	@Bean
	@Profile("english")
	@Primary
	public HelloWorldService helloWorldEnglish(HelloWorldFactory factory) {
		return factory.createHelloWorldService("en");
	}
	
	@Bean
	@Profile("spanish")
	@Primary
	public HelloWorldService helloWorldSpanish(HelloWorldFactory factory) {
		return factory.createHelloWorldService("es");
	}
	
	@Bean(name = "french")
	public HelloWorldService helloWorldFrench(HelloWorldFactory factory) {
		return factory.createHelloWorldService("fr");
	}
	
	@Bean
	public HelloWorldService helloWorldGerman(HelloWorldFactory factory) {
		return factory.createHelloWorldService("de");
	}
	
	@Bean
	public HelloWorldService helloWorldPolish(HelloWorldFactory factory) {
		return factory.createHelloWorldService("pl");
	}
	
	@Bean
	public HelloWorldService helloWorldRussian(HelloWorldFactory factory) {
		return factory.createHelloWorldService("ru");
	}
	
}
