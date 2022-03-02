package automationScripts;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomRepo.TC_ApparelAndShoesPage_001;


public class TC_001ApparelAndShoesTest extends BaseClass{
@Test
	
	public void apparelAndShoes() {
		apparelshoeTab=new TC_ApparelAndShoesPage_001(driver);
		apparelshoeTab.getClickOnApparelAndShoesTab().click();
		
		
		//Sort by dropdown
		sortby3=new TC_ApparelAndShoesPage_001(driver);
		sortby3.getClickOnSortByDropdown().click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//click on one option
		optionZtoA3=new TC_ApparelAndShoesPage_001(driver);
		optionZtoA3.getClickOnZtoAOption().click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		           
        //click on display dropdown
		display3=new TC_ApparelAndShoesPage_001(driver);
		display3.getClickOnDisplayDropdown().click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//click on 12 option
		option3=new TC_ApparelAndShoesPage_001(driver);
		option3.getClickOn12Option().click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//click on view as dropdown
		viewas3=new TC_ApparelAndShoesPage_001(driver);
		viewas3.getClickOnViewAsDropdown().click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//click on list option
		listoption3=new TC_ApparelAndShoesPage_001(driver);
		listoption3.getClickOnListOption().click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	   //click on product
		product3=new TC_ApparelAndShoesPage_001(driver);
		product3.getClickOnProduct().click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//click on add to cart
		addtocart3=new TC_ApparelAndShoesPage_001(driver);
		addtocart3.getClickOnAddToCart().click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//logout
		logout3=new TC_ApparelAndShoesPage_001(driver);
		logout3.getClickOnLogout().click();
}
}



