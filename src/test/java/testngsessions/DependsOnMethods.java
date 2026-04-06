package testngsessions;

import org.testng.annotations.Test;

public class DependsOnMethods {

	// 1==========>Here first login test will run and then search test will run
//	@Test
//	public void loginTest() {
//		System.out.println("Login test");
//	}
//	
//	@Test(dependsOnMethods ="loginTest")
//	public void searchTest() {
//		System.out.println("Search test");
//	}
	
	//Search test is dependent on Login test...if login test fails searh test alo fals
	//Default test
   // Tests run: 2, Failures: 1, Skips: 1
	
//	@Test
//	public void loginTest() {
//		System.out.println("Login test");
//		int i=9/0;
//	}
//	
//	@Test(dependsOnMethods ="loginTest")
//	public void searchTest() {
//		System.out.println("Search test");
//	}
	
	//Here  first testng will go with alphabetical order , first addToCartTest will be checked since its dependent on searchTest,
	//It'llgo to search test...since thhis is dependent on loginTest...fiirst loginTest will be exeuted then searchTest
	//Login tes Search test Add to cart test
	@Test
	public void loginTest() {
		System.out.println("Login test");
		//int i=9/3;
		int j=9/0;           //Here none of the test cases will be exeuted as the first dependence will fail.
	}
	
	//@Test(dependsOnMethods ="loginTest")
	@Test
	public void searchTest() {
		System.out.println("Search test");
		//int i=9/0;
	}
	
	@Test(dependsOnMethods = {"searchTest","loginTest"})   //Hree addToCartTest will be executed only if bothe the test pass
														//Even if one test fails the addToCartTest will be skipped
	public void addToCartTest() {
		System.out.println("Add to cart test");
	
}}
