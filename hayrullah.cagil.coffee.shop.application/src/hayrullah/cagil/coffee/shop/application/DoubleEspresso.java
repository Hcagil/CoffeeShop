package hayrullah.cagil.coffee.shop.application;

public class DoubleEspresso extends Coffee{
	
	public DoubleEspresso() {
		super("Double Espresso", 12);
	}
	
	@Override
	public String getRecipe() {
		return "2 doz espresso";
	}
	
}
