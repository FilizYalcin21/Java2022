package kodlama.io.Kodlama.io.Devs.entities.concretes;

public class ProgrammingLanguage {
	private int id;
	private String name;
	
	// Constructor without parameters
	public ProgrammingLanguage() {
		
	}
	
	// Constructor with parameters
	public ProgrammingLanguage(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	// Getters and setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
