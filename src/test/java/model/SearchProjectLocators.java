package model;
import org.openqa.selenium.By;

public class SearchProjectLocators {
    public static By pbtn = By.xpath("//span[normalize-space()='Projects']");
    public static By pinput = By.xpath("//input[@data-placeholder='Search by Project name or client name']");
    public static By pselect = By.xpath("//p[normalize-space()='PAA Training by AutoMATE']");
    public static By addBtn = By.xpath("//button[contains(@data-lang-key,'APP_PROJECTS.ADD')]");

}