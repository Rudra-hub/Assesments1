package materials;

import stock.Inventor;

public class Laptops extends Inventor {
	int lowOrderLevelQuantity = 3;
	int quantity = 1000;
	String name;
	String processor;

	public Laptops(String name, String processor) {
		super();
		this.name = name;
		this.processor = processor;
	}

	public Laptops() {

	}

	@Override
	public String toString() {
		return "Laptops [name=" + name + ", processor=" + processor + " ]";
	}

	public void out(int q) {
		if (q < quantity && q > lowOrderLevelQuantity)
			System.out.println("Order is placing");
		else if (q < lowOrderLevelQuantity)
			System.out.println("Requesting For Material");
		else {
			System.out.println("Not available");
		}
	}

}