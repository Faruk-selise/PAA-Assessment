package model;
import org.openqa.selenium.By;
public class SiteCreateLocators {
    public static By sName = By.xpath("//input[@name='SiteName']");
    public static By saddress = By.xpath("//input[@id='google-autoComplete']");
    public static By street = By.xpath("//input[@id='StreetName']");
    public static By sno = By.xpath("//input[@id='StreetNo']");
    public static By zip = By.xpath("//input[@id='Zip']");
    public static By cName = By.xpath("//input[@id='ContactPersonName']");
    public static By cEmail = By.xpath("//input[@id='ContactPersonEmail']");
    public static By cPhone = By.xpath("//input[@id='ContactPersonPhone']");


    public static By sDateb = By.xpath("//mat-form-field[1]//div[1]//div[1]//div[2]//mat-datepicker-toggle[1]//button[1]//span[1]");
    public static By sDatem = By.xpath("//button[@aria-label='Choose month and year']");
//    public static By sYears = By.xpath("//div[text()=' 2023 ']");
    public static By sYears = By.xpath("//div[normalize-space()='2023']");
    public static By sMonths = By.xpath("//div[contains(text(),'JUL')]");
    public static By sDates = By.xpath("//div[normalize-space()='12']");
    public static By eDateb = By.xpath("//mat-form-field[2]//div[1]//div[1]//div[2]//mat-datepicker-toggle[1]//button[1]//span[1]");
    public static By eYears = By.xpath("//div[normalize-space()='2025']");
    public static By eMonths = By.xpath("//div[normalize-space()='NOV']");
    public static By eDates = By.xpath("//div[normalize-space()='12']");


    public static By siteNotice = By.xpath("//textarea[@id='Notice']");
    public static By uncheck= By.xpath("//span[@class='mat-checkbox-label']");
    public static By savebtn = By.xpath("//span[normalize-space()='SAVE']");

}
