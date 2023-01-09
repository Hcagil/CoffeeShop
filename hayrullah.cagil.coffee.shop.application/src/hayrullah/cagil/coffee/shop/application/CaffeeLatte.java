package hayrullah.cagil.coffee.shop.application;

public class CaffeeLatte extends Coffee{

	public CaffeeLatte() {
		super("Caffee Latte",12);
	}

	@Override
	public String getRecipe() {
		return "1 doz espresso, 3 doz sicak sut ve 1 doz sut kopugu";
	}
}
