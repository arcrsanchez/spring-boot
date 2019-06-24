package guru.springframework.services;

public class HelloWorldGerman implements HelloWorldService{

	@Override
	public String getGteeting() {
		return "Hallo Welt!!";
	}

}
