package hayrullah.cagil.coffee.shop.application;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class testCoffeeShop {
	Coffee[] menu;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		Coffee espresso = new Espresso();
		Coffee doubleEspresso = new DoubleEspresso();
		Coffee cappucino = new Cappucino();
		Coffee caffeeLatte = new CaffeeLatte();
		Coffee mocha = new Mocha();
		Coffee americano = new Americano();
		Coffee hotWater = new HotWater();
		this.menu = new Coffee[]{espresso,doubleEspresso,cappucino,caffeeLatte,mocha,americano,hotWater};
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		String menuString = "1. Espresso (7₺)\n2. Double Espresso (12₺)\n3. Cappucino (12₺)\n4. Caffee Latte (12₺)\n5. Mocha (13₺)\n6. Americano (10₺)\n7. Hot Water (3₺)\n";

		assertEquals(CoffeeShop.printMenu(menu), menuString);

	}

}
