package guru.springframework.services;

public class HelloWorldFactory {

	public HelloWorldService createHelloWorldService(String languaje) {
		HelloWorldService service = null;

		switch (languaje) {
		case "en":
			service = new HelloWorldEnglish();
			break;
		case "es":
			service = new HelloWorldSpanish();
			break;
		case "fr":
			service = new HelloWorldFrench();
			break;
		case "de":
			service = new HelloWorldGerman();
			break;
		case "pl":
			service = new HelloWorldPolish();
			break;
		case "ru":
			service = new HelloWorldRussian();
			break;
		}
		return service;
	}

}
