package hayrullah.cagil.coffee.shop.application;

public class Main {

	public static void main(String[] args) {
		CoffeeShop shop = new CoffeeShop();
		System.out.print(shop.printMenu());
		int orderNum = shop.getOrder();
		System.out.println(shop.prepareOrder());
		System.out.println(shop.serveOrder(orderNum));
		}

}
