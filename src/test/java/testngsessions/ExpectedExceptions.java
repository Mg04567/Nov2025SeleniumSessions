package testngsessions;

import java.util.NoSuchElementException;

import org.testng.annotations.Test;

public class ExpectedExceptions {

	//The below test method gives the Arithmeti exception only...so the test will be passed because the Excepted exception
	//is ArithmeticException...if the test methohd gives anoter Exception the test case will be failed
//	@Test(expectedExceptions=ArithmeticException.class)
	
	@Test(expectedExceptions=Exception.class)    //Here all the test cases will be passed even if there are exceptions
		public void loginTest() {					//These features is mainly used for negative testing when we are 
			System.out.println("Login test");		//expecting certiain Exceptions
			int j=9/0;          
			System.out.println("Byeee");     //Anything after the exception will not be executed.Only if it is in the try
											//catch blok it wll be executed
	}
	
	//This test will fail as the expected Exception is NoSuchElementException but we got Aritmetic Exception
//			@Test(expectedExceptions=NoSuchElementException.class) 
//			public void loginTestNew() {
//				System.out.println("Login test new");
//				int j=9/0;   		
			
	@Test(expectedExceptions=Exception.class)
	public void searchTest() {
		System.out.println("Search test");
		int j=9/0;          
		
	}
		
		
		//We can include multiple Exceptions also
	
	@Test(expectedExceptions= {ArithmeticException.class,NullPointerException.class})
	
	//@Test(expectedExceptions= Exception.class)
		public void addToCartTest() {
			System.out.println("Add to cart test");
			int j=9/0;          
			}
	
	
		}

	


