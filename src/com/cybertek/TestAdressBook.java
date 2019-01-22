package com.cybertek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestAdressBook {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "/Users/shernaysawut/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
driver.manage().window().fullscreen();//mac
        //driver.manage().window().maximize();//windows
        driver.get("http://a.testaddressbook.com/");
        //finding the element from the page
        WebElement inputEmail=driver.findElement(By.id("session email"));
        //enter the username
        inputEmail.sendKeys("kexesobepu@zsero.com");
        //find the password input box
        WebElement inputpassword=driver.findElement(By.id("session password"));
        inputpassword.sendKeys("password");
        WebElement signbtn=driver.findElement(By.name("commit"));
        signbtn.click();
        System.out.println(driver.getTitle());
        WebElement username=driver.findElement(By.className("navbar-text"));
        String actualUsername=username.getText();
        System.out.println(actualUsername);
        if("kexesobepu@zsero.com".equals(actualUsername)) {
            System.out.println("pass");
        }else{
            System.out.println("fails");
        }
        //verify the title
        if(!driver.getTitle().contains("sign in")) {
            System.out.println("pass");
        }else{
            System.out.println("fail");
            System.out.println(driver.getTitle());
        }
    }
}