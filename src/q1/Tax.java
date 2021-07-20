package q1;

import java.util.Scanner;

public class Tax {
	public void tax1(int gender, double income) {
		Scanner sc = new Scanner(System.in);
		System.out.println("If gender is male Enter 1 and for female Enter 2");
		gender = sc.nextInt();
		if (gender==1){
			System.out.println("Enter your Income");
			income = sc.nextInt();
			if (income >= 0 && income <= 180000) {
				System.out.println("NO Tax");}
			else if (income >= 180001 && income <= 500000) {
				System.out.println("Tax is :" + income * 0.1);}
			else if (income >= 500001 && income <= 800000) {
				System.out.println("Tax is :" + income * 0.2);}
			else if (income > 800000) {
				System.out.println("Tax is :" + income * 0.3);}
			else {
			System.out.println("Invalide Amount");}
		}
		else if (gender==2) {
			System.out.println("Enter your Income");
			income = sc.nextInt();
			if (income >= 0 && income <= 190000) {
				System.out.println("NO Tax");}
			else if (income >= 190001 && income <= 500000) {
				System.out.println("Tax is :" + income * 0.1);}
			else if (income >= 500001 && income <= 800000) {
				System.out.println("Tax is :" + income * 0.2);}
			else if (income > 800000) {
				System.out.println("Tax is :" + income * 0.3);}
			else {
				System.out.println("Invalide Amount");
			}
			sc.close();
		}
		else {
			System.out.println("Invalide Gender Input");}
		}
	
	public static void main(String[] args) {
			Tax d=new Tax();
			d.tax1(0, 0);
	}

}