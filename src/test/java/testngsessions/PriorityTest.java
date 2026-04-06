package testngsessions;

import org.testng.annotations.Test;

public class PriorityTest {
	
	@Test(priority=1)
	public void loginTest() {
		System.out.println("Login Test");
			}
	
		
		@Test(priority=2)
		public void searchTest() {
			System.out.println("Search Test");
				}
		
		@Test(priority=3)
		public void addToCartTest() {
			System.out.println("Add to cart test");
				}
		
		@Test(priority=6)
		public void orderTest() {
			System.out.println("Order Test");
				}
		
		@Test(priority=4)
		public void productTest() {
			System.out.println("Product Test");
				}
		
		@Test(priority=5)
		public void forgotPwdTest() {
			System.out.println("Forgot Pwd Test");
				}
		
	}


