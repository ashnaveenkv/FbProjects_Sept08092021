package TestPackagesFb;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.flipkartbase.ProjectBasePackagesflipkart;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class flipkartelements extends ProjectBasePackagesflipkart {
	
	
	 public flipkartelements() {
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	} {

	}	
	
	@FindBy(xpath="//button[text()='✕']")
	private WebElement closelogin;
	
	@FindBy(name="q")
	private WebElement fksearch;
	
	@FindBy(xpath="//div[text()='APPLE iPhone SE (Black, 128 GB)']")
	private WebElement Iphone;
	
	@FindBy(xpath="//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")
	private WebElement addtocart;

	public WebElement getCloselogin() {
		return closelogin;
	}

	public WebElement getFksearch() {
		return fksearch;
	}
	
	public WebElement getIphone() {
		return Iphone;
	}
	
	public WebElement getaddtocart() {
		return addtocart;
	}

}
