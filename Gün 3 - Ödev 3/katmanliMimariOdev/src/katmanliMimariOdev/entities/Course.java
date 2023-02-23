package katmanliMimariOdev.entities;

public class Course {
	private int id;
	private String name;
	private int price;
	
	// Constructor without parameters
	public Course() {
	}

	// Constructor with parameters
	public Course(int id, String name, int price) {
		this.id = id;
		this.name = name;
		this.price = price;
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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
