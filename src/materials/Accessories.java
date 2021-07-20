package materials;

import stock.Inventor;

public class Accessories extends Inventor {
	int lowOrderLevelQuantity = 3;
	int quantity = 1000;
	String accesoryName;
	int cost;

	public Accessories(String accesoryName, int cost) {
		super();
		this.cost = cost;
		this.accesoryName = accesoryName;
	}

	public Accessories() {

	}

	@Override
	public String toString() {
		return "Accessories [accesoryName=" + accesoryName + ",cost=" + cost + "]";
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

	public int getLowOrderLevelQuantity() {
		return lowOrderLevelQuantity;
	}

	public void setLowOrderLevelQuantity(int lowOrderLevelQuantity) {
		this.lowOrderLevelQuantity = lowOrderLevelQuantity;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getAccesoryName() {
		return accesoryName;
	}

	public void setAccesoryName(String accesoryName) {
		this.accesoryName = accesoryName;
	}

}