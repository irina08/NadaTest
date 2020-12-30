package com.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.TestMethodOrder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class HappyPathTest {

    private WebDriver driver;
    private String userEmail;
    private String catUrl = "http://aws.random.cat/meow";
    //private String dogUrl = "https://random.dog/woof.json";
    private String foxUrl = "http://randomfox.ca/floof/";


    @BeforeAll
    static void oneTimeSetUp()
    {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void setUp()
    {
        driver = new ChromeDriver();
    }


	/*
	    @AfterEach
	    void tearDown()
	    {
	        driver.quit();
	    }

	 */


}
