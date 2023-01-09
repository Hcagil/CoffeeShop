package hayrullah.cagil.coffee.shop.application;

public class Americano extends Coffee{

	public Americano() {
		super("Americano",10);
	}
	
	@Override
	public String getRecipe() {
		return "1 doz espresso ve 4 doz sicak su";
	}
}
