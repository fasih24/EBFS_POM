package com.ebfs.qa.pages;

import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.ebfs.qa.base.TestBase;
import com.ebfs.qa.properties.WdressPageProperties;

public class WdressPage extends TestBase {
	 @FindBy(xpath= WdressPageProperties.loginBtn_xpath)
	    WebElement signIn;
	    @FindBy(xpath =WdressPageProperties.EmailAddressBox_xpath )
	    WebElement emailBox;
	    @FindBy(xpath = WdressPageProperties.PwdTexBox_xpath)
	    WebElement pwdBox;
	    @FindBy(xpath = WdressPageProperties.SignInBtn_xpath)
	    WebElement signInBtn;
	    @FindBy(xpath = WdressPageProperties.dress_xpath)
	    WebElement dress;

	    @FindBy(xpath = WdressPageProperties.womenTag_xpath)
	    WebElement women;
	    @FindBy(xpath = WdressPageProperties.sortSelect_xpath)
	    WebElement selection;
	    @FindBy(xpath = WdressPageProperties.SortSelectByZtoA_xpath)
	    WebElement selectionZtoA;
	    @FindBy(xpath = WdressPageProperties.quickView_xpath)
	    WebElement selectQuickView;
	    @FindBy(id = WdressPageProperties.whiteColor_id)
	    WebElement white;
	    @FindBy(xpath = WdressPageProperties.size_xpath)
	    WebElement size;
	    @FindBy(xpath = WdressPageProperties.addToCart)
	    WebElement addToCt;
	    @FindBy(xpath = WdressPageProperties.twitter_xpath)
	    WebElement twitter;
	    @FindBy(xpath = WdressPageProperties.tShirt_xpath)
	    WebElement tShirt;



	    public WdressPage() {
	        PageFactory.initElements(driver, this);
	    }
	    public void SignIn() {
	         signIn.click();
	    }

	    public void enterEmailToSignIn(String email) {
	        emailBox.sendKeys(email);
	    }
	    public void enterPasswdToSignIn(String pwd) {
	        pwdBox.sendKeys(pwd);
	        signInBtn.click();
	    }
	    public void womenSelection(){
	        women.click();
	    }
	    public void sortBy(){
	        selection.click();
	    }
	    public void sortByZtoA(){
	        selectionZtoA.click();
	    }
	    public void quickView(){
	        selectQuickView.click();
	     
	    }

	    public void TShirt(){
	        tShirt.click();
	    }
	    public void selectColor(){
	        white.click();
	    }

	    public void selectSize(){
	        size.click();

	    }

	    public void selectSize2() {
	        Select si = new Select(size);
	        si.selectByVisibleText("M");
	    }
	    public void addToCart(){
	        addToCt.click();
	    }
	    public void getTwitter(){
	        twitter.click();
	    }
	    public void clickDress(){
	        dress.click();
	    }

}
