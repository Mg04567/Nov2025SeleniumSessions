package seleniumsessions;

public class OpenCartTest {

	public static void main(String[] args) {
		BrowserUtil brUtil=new BrowserUtil();   //Driver variable cannot be accessed here...here once we call driver initially the
												//driver will be null and NPE will be givem
		brUtil.initDriver("chrome");         //thhis line will launch the browser
		
		//brUtil.enterURL(null);
		
		//brUtil.enterURL("naveenautomationlabs.com/");
		
		brUtil.enterURL("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		String acttitle=brUtil.getPageTitle();
		
		if (acttitle.equals("OrangeHRM")) {
			System.out.println("title is correct");
		}
		else {
			System.out.println("title is wrong");
		}
		
		String actUrl=brUtil.getPageUrl();
		if (actUrl.contains("orange")) {
			System.out.println("Login Page URL is Correct----PASS");
		}
		else {
			System.out.println("Login Page URL is not Correct----FAIL");
		}
	}

}
