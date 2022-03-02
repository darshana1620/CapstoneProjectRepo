package automationScripts;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomRepo.TC_ApparelAndShoesPage_001;

public class TC_002ApparelAndShoesTest extends BaseClass{
@Test
	
	public void apparelAndShoes1() {
		apparelshoeTab=new TC_ApparelAndShoesPage_001(driver);
		apparelshoeTab.getClickOnApparelAndShoesTab().click();
		
		
		//Sort by dropdown
		sortby4=new TC_ApparelAndShoesPage_001(driver);
		sortby4.getClickOnSortByDropdown().click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//click on one option
		optionZtoA4=new TC_ApparelAndShoesPage_001(driver);
		optionZtoA4.getClickOnZtoAOption().click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		           
        //click on display dropdown
		display4=new TC_ApparelAndShoesPage_001(driver);
		display4.getClickOnDisplayDropdown().click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//click on 12 option
		option4=new TC_ApparelAndShoesPage_001(driver);
		option4.getClickOn12Option().click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//click on view as dropdown
		viewas4=new TC_ApparelAndShoesPage_001(driver);
		viewas4.getClickOnViewAsDropdown().click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//click on list option
		listoption4=new TC_ApparelAndShoesPage_001(driver);
		listoption4.getClickOnListOption().click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	   //click on product
		product4=new TC_ApparelAndShoesPage_001(driver);
		product4.getClickOnProduct1().click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//click on add to cart
		addtocart4=new TC_ApparelAndShoesPage_001(driver);
		addtocart4.getClickOnAddToCart().click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//logout
		logout4=new TC_ApparelAndShoesPage_001(driver);
		logout4.getClickOnLogout().click();
}
}


