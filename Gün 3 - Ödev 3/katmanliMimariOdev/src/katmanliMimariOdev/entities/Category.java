package katmanliMimariOdev.entities;

public class Category {
	private int id;
	private String name;
	
	// Constructor without parameters
	public Category() {
	}

	// Constructor with parameters
	public Category(int id, String name) {
		this.id = id;
		this.name = name;
	}

	// GETTERS AND SETTERS
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
