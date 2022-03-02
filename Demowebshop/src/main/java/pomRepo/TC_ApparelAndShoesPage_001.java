package pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC_ApparelAndShoesPage_001 {
	//Constructor
			public TC_ApparelAndShoesPage_001 (WebDriver driver) {
					PageFactory.initElements(driver,this);
				}
				
				@FindBy(partialLinkText="Apparel & Shoes") private WebElement clickOnApparelAndShoesTab;
				@FindBy(id="products-orderby") private WebElement clickOnSortByDropdown;
				@FindBy(xpath="//option[text()='Name: Z to A']") private WebElement clickOnZtoAOption;
				@FindBy(id="products-pagesize") private WebElement clickOnDisplayDropdown;
			    @FindBy(xpath="//option[text()='12']") private WebElement clickOn12Option;
				@FindBy(id="products-viewmode") private WebElement clickOnViewAsDropdown;
				@FindBy(xpath="//option[text()='List']") private WebElement clickOnListOption;
				@FindBy(xpath="//img[@src='http://demowebshop.tricentis.com/content/images/thumbs/0000018_50s-rockabilly-polka-dot-top-jr-plus-size_125.jpg']") private WebElement clickOnProduct;
				@FindBy(xpath="//img[@src='http://demowebshop.tricentis.com/content/images/thumbs/0000116_blue-and-green-sneaker_125.jpeg']") private WebElement clickOnProduct1;
				@FindBy(xpath="//input[@class='button-1 add-to-cart-button']") private WebElement clickOnAddToCart;
				@FindBy(xpath="//a[@class='ico-logout']") private WebElement clickOnLogout;
				
				
				public WebElement getClickOnApparelAndShoesTab() {
					return clickOnApparelAndShoesTab;
				}
				
				
				
				
				public WebElement getClickOnSortByDropdown() {
					return clickOnSortByDropdown;
				}
				
				
				
				public WebElement getClickOnZtoAOption() {
					return clickOnZtoAOption;
				}
				
				
				
				public WebElement getClickOnDisplayDropdown() {
					return clickOnDisplayDropdown;
				}
				
			  
				
				public WebElement getClickOn12Option() {
					return clickOn12Option;
				}
				
			
				
				public WebElement getClickOnViewAsDropdown() {
					return clickOnViewAsDropdown;
					
					
				
				}
				
				
					
					public WebElement getClickOnListOption() {
						return clickOnListOption;
						
						
					}
					
					
				public WebElement getClickOnProduct() {
							return clickOnProduct;
							
							
					}
				
				
				public WebElement getClickOnProduct1() {
							return clickOnProduct1;
							
							
					}
				public WebElement getClickOnAddToCart() {
					return clickOnAddToCart;
							
			}
				public WebElement getClickOnLogout() {
		
							return clickOnLogout;
								
								
						}		
	}


