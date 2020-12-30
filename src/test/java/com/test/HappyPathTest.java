package com.test;

import com.pages.GMailPage;
import com.pages.HomePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

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

    @Order(1)
    @Test
    void test1() {
        HomePage homePage = HomePage.open(driver);
        assertEquals(homePage.expectedTitle(), driver.getTitle());

        userEmail = homePage.userEmail();

        //System.out.println(userEmail);

        homePage.createEmail();

        //System.out.println(homePage.getConfirmationText());
        assertTrue(homePage.getConfirmationText().contains(userEmail));

    }




	/*
	    @AfterEach
	    void tearDown()
	    {
	        driver.quit();
	    }

	 */


}
