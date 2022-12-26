package com.abc.LoginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.abc.comonfunctionality.Browser;

	public class LoginPage extends Browser {
		
		private WebElement UsernameTxt;
		private WebElement PasswordTxt;
		private WebElement LoginBtn; 
		
		public WebElement getUsernameTxt() {
			UsernameTxt = driver.findElement(By.xpath("//input[@id='email']" ));
			return UsernameTxt;
		}
		
		public WebElement getPasswordTxt() {
			PasswordTxt = driver.findElement(By.xpath("//input[@id='pass']" ));
			return PasswordTxt;
		}
		
		public WebElement getLoginBtn() {
			LoginBtn = driver.findElement(By.xpath("//button[@name='login']" ));
			return LoginBtn;
		}
		
		public void LoginFunctionality(String username, String password) {
			
			getUsernameTxt().sendKeys(username);
			getPasswordTxt().sendKeys(password);
			getLoginBtn().click();
		}
}
	
	
