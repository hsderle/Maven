package com.abc.LoginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.abc.comonfunctionality.Browser;

public class Homepage extends LoginPage {
	
	
	private WebElement GamingLink;
	private WebElement MarketplaceLink;
	

	
	public WebElement getGamingLink() {
		 GamingLink = driver.findElement(By.xpath("//a[@href='/gaming/?ref=games_tab']" ));
		 GamingLink.click();
		return GamingLink;
	}
	public WebElement getMarketplaceLink() {
		 MarketplaceLink = driver.findElement(By.xpath("//a[@href='/marketplace/?ref=app_tab']" ));
		return MarketplaceLink;
	}
	
	

}
