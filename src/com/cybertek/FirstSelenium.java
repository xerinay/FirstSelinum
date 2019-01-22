package com.cybertek;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
public class FirstSelenium {
    public static void main(String[]args){
        System.setProperty("webdriver.chrome.driver",
                "/Users/shernaysawut/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
             driver.get("https://google.com");
             //verify the title
        //expected title ; googele
        String actualTitle=driver.getTitle();
        System.out.println("actualtitle="+actualTitle);
        String expctedTitle="Google";
        if(expctedTitle.equals(actualTitle)) {
            System.out.println("pass");
        }else{
            System.out.println("fail");
            System.out.println("expected"+expctedTitle);
            System.out.println("actual"+actualTitle);
        }

    }

}


