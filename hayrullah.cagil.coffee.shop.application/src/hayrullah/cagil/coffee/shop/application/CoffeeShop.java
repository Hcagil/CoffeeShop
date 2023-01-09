package hayrullah.cagil.coffee.shop.application;

public class CoffeeShop {

	public static void main(String[] args) {
		Coffee espresso = new Espresso();
		Coffee doubleEspresso = new DoubleEspresso();
		Coffee cappucino = new Cappucino();
		Coffee caffeeLatte = new CaffeeLatte();
		Coffee mocha = new Mocha();
		Coffee americano = new Americano();
		Coffee hotWater = new HotWater();
		
		Coffee[] menu = {espresso,doubleEspresso,cappucino,caffeeLatte,mocha,americano,hotWater};
		System.out.print(printMenu(menu));
	}
		
	public static String printMenu(Coffee[] menu) {
		String res = "";
		for (int i=0; i < menu.length; i++) {
			String coffeeName = menu[i].getName();
			int coffeePrice = menu[i].getPrice();
			res += (i+1)+". "+coffeeName+" ("+coffeePrice+"₺)\n";
		}
		return res;
	}
		
}
