package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TableSearchBoxObjects {
	
		public TableSearchBoxObjects  (WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
	@FindBy(id="small-searchterms")
	public WebElement searchBox;
	
	
	
}
