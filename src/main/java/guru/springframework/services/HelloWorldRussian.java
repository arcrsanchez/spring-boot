package guru.springframework.services;

public class HelloWorldRussian implements HelloWorldService{

	@Override
	public String getGteeting() {
		return "Привет мир!!";
	}

}
