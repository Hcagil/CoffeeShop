package hayrullah.cagil.coffee.shop.application;

public class HotWater extends Coffee{

	public HotWater() {
		super("Hot Water",3);
	}

	@Override
	public String getRecipe() {
		return "5 doz sicak su";
	}
}
