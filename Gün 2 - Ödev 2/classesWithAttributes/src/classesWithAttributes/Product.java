package classesWithAttributes;

public class Product {

	public Product(int id, String name, String description, double price, int stockAmount, String color) {
		System.out.println("Yapıcı blok çalıştı");
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.stockAmount = stockAmount;
		this.color = color;
	}

	// overloading - aynı isim farklı parametre
	public Product() {

	}

	// attribute | field
	// bir şey yazmazsak default olarak public
	private int id;
	private String name;
	private String description;
	private double price;
	private int stockAmount;
	private String color;
	private String code;

	// read-only yapmak istediğinde sadece getter yazarsın
	// write-only için ise sadece setter yazarsın ;)
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStockAmount() {
		return stockAmount;
	}

	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getCode() {
		return this.name.substring(0, 1) + id;
	}

	// code setter'ını silince kullanıcıyı engellemiş olduk (encapsulation)

}
