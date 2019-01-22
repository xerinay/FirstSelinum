package com.cybertek;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicAuthenticationAddressBook {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "/Users/shernaysawut/Downloads/chromedriver");
WebDriver driver=new ChromeDriver();
driver.get("http://a.testaddressbook.com/sign_in");
//finding  A ELEMENT FROM PAGE
// findElement() --> this method comes from the webdriver class. it locates an element on the page.
WebElement inputemail=driver.findElement(By.id("session_email")) ;// returns an element whose id is session_email

        //enter the userNAME
        inputemail.sendKeys( "kexesobepu@zsero.com");
      //  WebElement = class that represents a specific element on the apge. we can do click, type .... operations on webelement

      //  In selenium all elements in the page are represented by webelement object

        WebElement inputPassword=driver.findElement(By.id("session_password"));
//enter the password
        inputPassword.sendKeys("password");
        //sendKeys()   --> method used to type on an element, takes a string as argument

        WebElement signinButton=driver.findElement(By.name("submit"));
        System.out.println(driver.getTitle());

        //click on the button
        signinButton.click();
        System.out.println(driver.getTitle());
        //located the uswrname element
WebElement username=driver.findElement(By.className("navbar_text"));
String actualUsername=username.getText();
//getText()  --> gets the text of an element. webelement is not
        System.out.println(actualUsername);
        if("kexesobepu@zsero.com".equals(actualUsername)){
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
            System.out.println("EXPECTED: kexesobepu@zsero.com");
            System.out.println("actualUsername = " + actualUsername);

        }

    }
}