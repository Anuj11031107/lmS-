package pageobject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Login{
public WebDriver driver;


public Login(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

@FindBy(id="username")
WebElement userName;

@FindBy(id="password")
WebElement password;

@FindBy(id="loginbtn")
WebElement loginbtn;

@FindBy(xpath="//span[text()=' Hello ! Mona']")
WebElement welcomeMsg;

public void enterName(String name) {
	userName.click();
	userName.sendKeys(name);
}

public void enterPassword(String passwrd) {
	password.click();
	password.sendKeys(passwrd);
}

public void clickLogin() {
	loginbtn.click();
}

public String checkWelcomeMsg() {
	return welcomeMsg.getText();
}

}