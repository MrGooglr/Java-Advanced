package tests.aniket.springboot.testspringboot;

public class GreetingsWithName {
//resource representation class
	private long id;
	private String name;
	
	public GreetingsWithName(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	//Accessing Fields
	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}	
	
}
