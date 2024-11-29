package org.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;

    private By emailField= By.name("email");
    private By passwordfield = By.name("password");
    private By loginbtn = By.xpath("//input[@type='submit']");
    private By forgetpasslink = By.linkText("Forgotten Password")
    private By logoutlink = By.linkText("Logout");



    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enteremail(String email){
        driver.findElement(emailField).sendKeys(email);
    }
    public void enterpassword(String password){
        driver.findElement(passwordfield).sendKeys(password);
    }

    public void clickLoginbtn(){
        driver.findElement(loginbtn).click();
    }

    public boolean forgotlinkdisplayed(){
       return  driver.findElement(forgetpasslink).isDisplayed();
    }

    public void forgetpasslinkclick(){
        driver.findElement(forgetpasslink).click();
    }
    public boolean checklogoutlink(){
        return driver.findElement(logoutlink).isDisplayed();

    }
    public void logoutlinkcheck(){
        driver.findElement(logoutlink).click();
    }

    public void login(String username,String password){
        enteremail(username);
        enterpassword(password);
        clickLoginbtn();

    }

    public String getforgotpasslink(){
        String forgotlink=driver.getCurrentUrl();
        return forgotlink;
    }
}
