import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XYZAutomation {
    public static void main(String[] args)throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\PC\\Desktop\\Selenium\\Drivers\\/chromedriver.exe");
        //https://www.globalsqa.com/angularJs-protractor/BankingProject/#/
        WebDriver driver = new ChromeDriver();

        //opens the XYZ bank site
        driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");

        Thread.sleep(500);

        WebElement customerLogin = driver.findElement(By.cssSelector("body > div > div > div.ng-scope > div > div.borderM.box.padT20 > div:nth-child(1) > button"));
        customerLogin.click();

        Thread.sleep(500);

        WebElement customerSelection = driver.findElement(By.cssSelector("#userSelect"));
        customerSelection.click();

        Thread.sleep(500);

        WebElement selectCustomer = driver.findElement(By.cssSelector("#userSelect > option:nth-child(4)"));
        selectCustomer.click();

        Thread.sleep(500);

        WebElement login = driver.findElement(By.cssSelector("body > div > div > div.ng-scope > div > form > button"));
        login.click();

        Thread.sleep(500);

        WebElement deposit = driver.findElement(By.cssSelector("body > div > div > div.ng-scope > div > div:nth-child(5) > button:nth-child(2)"));
        deposit.click();

        Thread.sleep(500);

        WebElement depositAmount = driver.findElement(By.cssSelector("body > div > div > div.ng-scope > div > div.container-fluid.mainBox.ng-scope > div > form > div > input"));
        depositAmount.sendKeys("250");

        Thread.sleep(500);

        WebElement depositButton = driver.findElement(By.cssSelector("body > div > div > div.ng-scope > div > div.container-fluid.mainBox.ng-scope > div > form > button"));
        depositButton.click();

        Thread.sleep(500);

        //driver.get("https://www.google.com");
        //        Thread.sleep(3000);
        //WebElement searchBox = driver.findElement(By.cssSelector("<input class=\"gLFyf\" jsaction=\"paste:puy29d;\" maxlength=\"2048\" name=\"q\" type=\"text\" aria-autocomplete=\"both\" aria-haspopup=\"false\" autocapitalize=\"off\" autocomplete=\"off\" autocorrect=\"off\" autofocus=\"\" role=\"combobox\" spellcheck=\"false\" title=\"חיפוש\" value=\"\" aria-label=\"חיפוש\" data-ved=\"0ahUKEwjd7aKmkeP7AhWAaqQEHWE5AWYQ39UDCAQ\">"));
        //searchBox.sendKeys("Testing?");
        //searchBox.sendKeys(Keys.ENTER);
    }
}
