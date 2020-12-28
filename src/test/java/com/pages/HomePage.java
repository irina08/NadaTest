package com.pages;

import com.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class HomePage extends Base
{
    private String title = "nada - Disposable Temp Email";
    private static String URL = "https://getnada.com/";
    private String domainName = "@getnada.com";

    // elements
    @FindBy(xpath = "//button[contains(text(), 'Add inboxe')]")
    private WebElement addInboxe;

    @FindBy(xpath = "//input[@id='grid-first-name']")
    //input[#'grid-first-name'] input#grid-first-name //input[#'grid-first-name']
    private WebElement userName;

    //@FindBy(className = ".appearance-none.bg-white.block.border.border-gray-400.leading-tight.pr-8.px-2.py-2.rounded.shadow.w-full")
    @FindBy(xpath = "//select")
    private WebElement dropDownDomainName;

    @FindBy(xpath = "//button[contains(text(), 'Add now!')]")
    private WebElement generate_email;

    @FindBy(xpath = "//p[@class='p-3']")
    private WebElement confirmationText;

    // constructor
    public HomePage(WebDriver driver)
    {
        this.driver = driver;
    }

    public static HomePage open(WebDriver driver)
    {
        driver.get(URL);
        driver.manage().window().maximize();
        return PageFactory.initElements(driver, HomePage.class);
    }

    public String expectedTitle() {
        return title;
    }

    public String userEmail() {
        clickElement(addInboxe);
        return userName.getAttribute("value") + domainName;
    }

    public void createEmail() {
        Select s = new Select(dropDownDomainName);
        s.selectByVisibleText(domainName);
        generate_email.click();
    }

    public String getConfirmationText() {
        return confirmationText.getText();
    }

}