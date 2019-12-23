package tyagiabhinav.hackerrank;

import java.util.Scanner;

public class FactoryPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//creating the factory
		FoodFactory foodFactory = new FoodFactory();

		//factory instantiates an object
		Food food = foodFactory.getFood(sc.nextLine());

		
		System.out.println("The factory returned "+food.getClass());
		System.out.println(food.getType());
	}

}

interface Food {
	public String getType();
}

class Pizza implements Food {
	public String getType() {
		return "Someone ordered a Fast Food!";
	}
}

class Cake implements Food {

	public String getType() {
		return "Someone ordered a Dessert!";
	}
}

class FoodFactory {
	public Food getFood(String order) {
		switch (order.toLowerCase()) {
		case "pizza":
			return new Pizza();

		case "cake":
			return new Cake();

		default:
			return null;
		}

	}

}
