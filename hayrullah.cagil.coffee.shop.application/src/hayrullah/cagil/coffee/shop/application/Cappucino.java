package hayrullah.cagil.coffee.shop.application;

public class Cappucino extends Coffee{

	public Cappucino() {
		super("Cappucino",12);
	}
	
	@Override
	public String getRecipe() {
		return "1 doz espresso, 2 doz sicak sut ve 2 doz sut kopugu";
	}

}
