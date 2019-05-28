package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
@FindBy(id="txtUsername")
private WebElement untb;

@FindBy(id="txtPassword")
private WebElement pwtb;

@FindBy(id="btnLogin")
private WebElement loginbtn;


public void setUsername(String un) {	
	System.out.println("Entering Username "+un);
	untb.sendKeys(un);
}

public void setPassword(String pw) {
	System.out.println("Entering Password "+pw);
	pwtb.sendKeys(pw);
}
public void clickLogin() {
	loginbtn.click();
}

public LoginPage (WebDriver driver) {
	PageFactory.initElements(driver, this);
}

}
