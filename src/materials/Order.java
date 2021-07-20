package materials;

import java.util.Scanner;

public class Order {

	public static void main(String[] args) {
		Laptops l1 = new Laptops("Acer", "i3");
		Laptops l2 = new Laptops("Lenovo", "i5");
		Laptops l3 = new Laptops("Dell", "i11");
		Laptops l4 = new Laptops("HP", "i10");
		Laptops l5 = new Laptops("Apple", "i4");
		
		
		
		Accessories a1 = new Accessories("iPhone", 40000);
		Accessories a2 = new Accessories("SmartWatch", 10000);
		Accessories a3 = new Accessories("Samsung 4G", 14000);
		Accessories a4 = new Accessories("iPad", 20000);
		Accessories a5 = new Accessories("Realme", 11000);
		Accessories a6 = new Accessories("Sunglasses", 400);
		Accessories a7 = new Accessories("necklace", 40000);
		Accessories a8 = new Accessories("Purse", 40000);
		Accessories a9 = new Accessories("Bangles", 40000);
		Accessories a10 = new Accessories("Shoes", 40000);

		System.out.println("What do you want?\n1.Laptops\n2.Accessories");
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		System.out.println("How many do you want ?");
		int quantity = sc.nextInt();
		switch (option) {
		case 1:
			Laptops order = new Laptops();
			order.out(quantity);
			break;
		case 2:
			Accessories order1 = new Accessories();
			order1.out(quantity);
			break;
		default:
			System.out.println("Enter either 1 or 2");
			break;
		}

	}

}

