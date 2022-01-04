package pageobject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;



public class MyProfile{
	public WebDriver driver;
	public MyProfile (WebDriver driver)
	{
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//body[1]/header[1]/div[1]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[1]/a[1]")
	WebElement dropdownUserName;
	
	@FindBy(xpath="//body[1]/header[1]/div[1]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]")
	WebElement myProfile;
	
	@FindBy(xpath="//body/div[@id='page']/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/section[1]/ul[1]/li[1]/span[1]/a[1]")
	WebElement editProfile;
	
	@FindBy(id="id_firstname")
	WebElement frstName;
	
	@FindBy(id="id_lastname")
	WebElement lastName;
	
	@FindBy(xpath="//input[@id='id_profile_field_DOB']")
	WebElement dob;
	
	@FindBy(id="id_submitbutton")
	WebElement btnUpdateProfile;
	
	public void clickDropDownUserName() {
		dropdownUserName.click();
	}
	
	public void clickMyProfile() {
		myProfile.click();
	}
	
	public void clickEditProfile() {
		editProfile.click();
	}
	
	public void enterFirstName(String firstName) {
		frstName.clear();
		frstName.sendKeys(firstName);
		
	}
	
	public void enterLastName(String lastname) {
		lastName.clear();
		lastName.sendKeys(lastname);
		
	}
	
	public void enterDOB(String DOB) {
		dob.clear();
		dob.sendKeys(DOB);
	}
	
	public void clickUpdateProfile() {
		btnUpdateProfile.click();
	}

}