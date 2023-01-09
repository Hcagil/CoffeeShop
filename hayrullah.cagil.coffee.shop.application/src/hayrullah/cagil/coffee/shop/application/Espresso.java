package hayrullah.cagil.coffee.shop.application;

public class Espresso extends Coffee{	
	
	public Espresso() {
		
		super("Espresso",7);
	}
	
	@Override
	public String getRecipe() {
		return "1 doz espresso";
	}
}
