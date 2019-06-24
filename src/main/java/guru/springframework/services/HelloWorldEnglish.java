package guru.springframework.services;

public class HelloWorldEnglish implements HelloWorldService{

	@Override
	public String getGteeting() {
		return "Hello World!!";
	}

}
