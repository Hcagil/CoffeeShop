package hayrullah.cagil.coffee.shop.application;

public class Mocha extends Coffee{

	public Mocha() {
		super("Mocha",13);
	}

	@Override
	public String getRecipe() {
		return "1 doz espresso, 1 doz sicak sut, 1 doz sut kopugu ve 2 doz sicak cikolata";
	}
}
