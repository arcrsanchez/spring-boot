package guru.springframework.services;

public class HelloWorldFrench implements HelloWorldService{

	@Override
	public String getGteeting() {
		return "Salut Monde!!";
	}

}
