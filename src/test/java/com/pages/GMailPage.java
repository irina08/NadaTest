package com.pages;

import com.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GMailPage extends Base {

    //testing gmail account
    private static String URL = "https://mail.google.com";
    private String gmailUserName = "lora.gg11@gmail.com";
    private String gmailPassword = "qqzz1122";

    @FindBy(xpath = "//input[@id='identifierId']")
    private WebElement email;

    @FindBy(xpath = "//div[@class='VfPpkd-Jh9lGc']")
    private WebElement buttonNext1;

    @FindBy(xpath = "//input[@type='password']")
    private WebElement password;

    @FindBy(xpath = "//div[@class='VfPpkd-RLmnJb']")
    private WebElement buttonNext2;

    @FindBy(xpath = "//div[@class='T-I T-I-KE L3']")
    private WebElement createNewEmailButton;


    // constructor
    public GMailPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public static GMailPage open(WebDriver driver)
    {
        driver.get(URL);
        driver.manage().window().maximize();
        return PageFactory.initElements(driver, GMailPage.class);
    }




}
