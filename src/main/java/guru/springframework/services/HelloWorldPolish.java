package guru.springframework.services;

public class HelloWorldPolish implements HelloWorldService{

	@Override
	public String getGteeting() {
		return "Witaj świecie!!";
	}

}
