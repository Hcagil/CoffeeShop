package hayrullah.cagil.coffee.shop.application;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class testCoffeeShop {
	CoffeeShop shop;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {		
		this.shop = new CoffeeShop();
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testPrintMenu() {
		String menuString = "1. Espresso (7₺)\n2. Double Espresso (12₺)\n3. Cappucino (12₺)\n4. Caffee Latte (12₺)\n5. Mocha (13₺)\n6. Americano (10₺)\n7. Hot Water (3₺)\n";

		assertEquals(this.shop.printMenu(), menuString);

	}
	
	@Test
	public void testPrepareOrder() {
		assertEquals("Tesekkurler, Kahveniz hazirlaniyor.", shop.prepareOrder());
	}
	

}
