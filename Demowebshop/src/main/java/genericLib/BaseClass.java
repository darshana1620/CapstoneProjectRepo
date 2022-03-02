package genericLib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import pomRepo.TC_ApparelAndShoesPage_001;


import pomRepo.TC_LoginPage_001;


/***
 * 
 * @author Darshana
 *
 */

public class BaseClass {
	
	public WebDriver driver;
	public ExcelLib elib=new ExcelLib();
	public WebDriverWait explicitWait;
	public TC_LoginPage_001 loginPage;
   
   
    public TC_ApparelAndShoesPage_001  apparelshoeTab;
    public TC_ApparelAndShoesPage_001 sortby3;
    public TC_ApparelAndShoesPage_001 optionZtoA3;
    public TC_ApparelAndShoesPage_001  display3;
    public TC_ApparelAndShoesPage_001  option3;
    public TC_ApparelAndShoesPage_001 viewas3;
    public TC_ApparelAndShoesPage_001  listoption3;
    public TC_ApparelAndShoesPage_001  product3;
    public TC_ApparelAndShoesPage_001 addtocart3;
    public TC_ApparelAndShoesPage_001  logout3;
    ///////////////////////////////////////////////////
    public TC_ApparelAndShoesPage_001 sortby4;
    public TC_ApparelAndShoesPage_001 optionZtoA4;
    public TC_ApparelAndShoesPage_001  display4;
    public TC_ApparelAndShoesPage_001  option4;
    public TC_ApparelAndShoesPage_001 viewas4;
    public TC_ApparelAndShoesPage_001  listoption4;
    public TC_ApparelAndShoesPage_001  product4;
    public TC_ApparelAndShoesPage_001 addtocart4;
    public TC_ApparelAndShoesPage_001  logout4;
   
   
    
    String firstname=ExcelLib.readStringData("Sheet1", 1, 0);
	String lastname=ExcelLib.readStringData("Sheet1", 1, 1);
	String email=ExcelLib.readStringData("Sheet1", 1, 2);
	String password=ExcelLib.readStringData("Sheet1", 1, 3);
	String confirmpassword=ExcelLib.readStringData("Sheet1", 1, 4);

	@Parameters("browserName")
	@BeforeClass(alwaysRun=true)
	public void beforeClass(@Optional("chrome") String bName) {
		if(bName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
			driver=new ChromeDriver();
		}else if(bName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./src/main/resources/geckodriver.exe");
			driver=new FirefoxDriver();
		}else {
			System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
			driver=new ChromeDriver();
		}
		Reporter.log("Browser is launched Successfully",true);
		driver.manage().window().maximize();
		Reporter.log("Browser is maximized Successfully",true);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		explicitWait=new WebDriverWait(driver,10);
	}
	@BeforeMethod(alwaysRun=true)
	public void beforeMethod() throws InterruptedException {
		//URL
		driver.get(elib.readStringData("Sheet1",0,0));
	
		Reporter.log("Login Page  displayed successfully",true);
		

		 
		loginPage=new TC_LoginPage_001(driver);
		loginPage.getClickOnLoginLink().click();
		loginPage.loginToApp(elib.readStringData("Sheet1",0,1),elib.readStringData("Sheet1",0,2));
	
	    Reporter.log("Successfully logged in to the application",true);
	    Thread.sleep(2000);
	}
		
		
		@AfterClass(alwaysRun=true)
		public void afterClass() {
			driver.quit();
			Reporter.log("Successfully closed the browser",true);
	}
				
		
	
}



