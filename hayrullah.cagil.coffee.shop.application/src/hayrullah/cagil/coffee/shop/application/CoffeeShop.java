package hayrullah.cagil.coffee.shop.application;

import java.util.InputMismatchException;
import java.util.Scanner;


public class CoffeeShop {
	public Coffee[] menu;
	
	public CoffeeShop() {
		Coffee espresso = new Espresso();
		Coffee doubleEspresso = new DoubleEspresso();
		Coffee cappucino = new Cappucino();
		Coffee caffeeLatte = new CaffeeLatte();
		Coffee mocha = new Mocha();
		Coffee americano = new Americano();
		Coffee hotWater = new HotWater();
		
		this.menu = new Coffee[]{espresso,doubleEspresso,cappucino,caffeeLatte,mocha,americano,hotWater};

	}
	// Print different coffees in shop menu
	public String printMenu() {
		String res = "";
		for (int i=0; i < menu.length; i++) {
			String coffeeName = menu[i].getName();
			int coffeePrice = menu[i].getPrice();
			res += (i+1)+". "+coffeeName+" ("+coffeePrice+"₺)\n";
		}
		return res;
	}
	
	// Take Coffee orders from user as an integer
	public int getOrder() {
		Scanner input = new Scanner(System.in);
		int coffeeNumber = -1;
		System.out.print("Lutfen icmek istediginiz kahvenin numarasini giriniz: ");
		if (input.hasNextInt()) {
			coffeeNumber = input.nextInt();			
		}
		while ( 0 > coffeeNumber || coffeeNumber >  this.menu.length) {
			System.out.print("Hatali tuslama yaptiniz lutfen tekrar deneyiniz: ");
			input.nextLine();
			if (input.hasNextInt()) {
				coffeeNumber = input.nextInt();
			}
		}
		input.close();
		return coffeeNumber;

	}
	
	// Prepare order and displaying
	public String prepareOrder() {
		return "Tesekkurler, Kahveniz hazirlaniyor.";
		
	}
	
	// Serve coffee order to user with ingredients
	public String serveOrder(int orderNumber) {
		return menu[orderNumber-1].getName()+" sectiniz, iceceginiz "+menu[orderNumber-1].getRecipe()+" icermektedir.\nAfiyet Olsun.";
	}
	
		
}
