package model;

import org.openqa.selenium.By;

public class LoginLocators {

    public static By cdropedown = By.xpath("//mat-select[@name='language']");
    public static By selectenglish = By.xpath("//span[normalize-space()='Englisch']");
    public static By email = By.xpath("//input[@data-placeholder='Email']");
    public static By nextbutton = By.xpath("//button[contains(normalize-space(),'Next')]");
    public static By password = By.xpath("//input[@name='password']");
    public static By clickbutton = By.xpath("//button[@aria-label='LOGIN']");
}
