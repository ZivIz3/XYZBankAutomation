import org.junit.Assert;
import org.junit.Test;

public class test_XYZ_Ziv {
    @Test
    public void depositTest() throws InterruptedException {
        docObjectModel selenium = new docObjectModel();

        //setting the Strings
        String url = "https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login";
        String customerLoginSelector = "body > div > div > div.ng-scope > div > div.borderM.box.padT20 > div:nth-child(1) > button";
        String accountSelector = "#userSelect";
        String selectUserSelector = "#userSelect > option:nth-child(4)";
        String loginSelector = "body > div > div > div.ng-scope > div > form > button";
        String depositSelector = "body > div > div > div.ng-scope > div > div:nth-child(5) > button:nth-child(2)";
        String depositAmountSelector = "body > div > div > div.ng-scope > div > div.container-fluid.mainBox.ng-scope > div > form > div > input";
        String amountToDeposit = "250";
        String depositButton = "body > div > div > div.ng-scope > div > div.container-fluid.mainBox.ng-scope > div > form > button";
        String expectedValue = "250";

        //Launch site
        selenium.driver.get(url);

        //select the customer login option and login to a certain account
        Thread.sleep(1000);
        selenium.getElement(customerLoginSelector).click();
        Thread.sleep(500);
        selenium.getElement(accountSelector).click();
        Thread.sleep(1200);
        selenium.getElement(selectUserSelector).click();
        Thread.sleep(500);
        selenium.getElement(loginSelector).click();

        //select depositing option and deposit 250
        Thread.sleep(500);
        selenium.getElement(depositSelector).click();
        Thread.sleep(1200);
        selenium.getElement(depositAmountSelector).sendKeys(amountToDeposit);
        Thread.sleep(500);
        selenium.getElement(depositButton).click();
        Thread.sleep(1000);

        //check both values to see if test is positive or negative
        String actualValue = selenium.getElement("body > div > div > div.ng-scope > div > div:nth-child(3) > strong:nth-child(2)").getText();
        Assert.assertEquals(expectedValue, actualValue);

        //Quit
        selenium.driver.quit();
    }

    @Test
    public void transactionTest() throws InterruptedException {
        docObjectModel selenium = new docObjectModel();

        //setting the Strings
        String url = "https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login";
        String customerLoginSelector = "body > div > div > div.ng-scope > div > div.borderM.box.padT20 > div:nth-child(1) > button";
        String accountSelector = "#userSelect";
        String selectUserSelector = "#userSelect > option:nth-child(5)";
        String loginSelector = "body > div > div > div.ng-scope > div > form > button";
        String depositSelector = "body > div > div > div.ng-scope > div > div:nth-child(5) > button:nth-child(2)";
        String depositAmountSelector = "body > div > div > div.ng-scope > div > div.container-fluid.mainBox.ng-scope > div > form > div > input";
        String amountToDeposit = "1500";
        String depositButton = "body > div > div > div.ng-scope > div > div.container-fluid.mainBox.ng-scope > div > form > button";
        String transactionBtSelector = "body > div > div > div.ng-scope > div > div:nth-child(5) > button:nth-child(1)";
        String expectedValue = "1500";

        //Launch site
        selenium.driver.get(url);

        //select the customer login option and login to a certain account
        Thread.sleep(1000);
        selenium.getElement(customerLoginSelector).click();
        Thread.sleep(500);
        selenium.getElement(accountSelector).click();
        Thread.sleep(1200);
        selenium.getElement(selectUserSelector).click();
        Thread.sleep(500);
        selenium.getElement(loginSelector).click();

        //select depositing option and deposit 1500
        Thread.sleep(500);
        selenium.getElement(depositSelector).click();
        Thread.sleep(1200);
        selenium.getElement(depositAmountSelector).sendKeys(amountToDeposit);
        Thread.sleep(500);
        selenium.getElement(depositButton).click();
        Thread.sleep(1000);
        selenium.getElement(transactionBtSelector).click();
        Thread.sleep(500);

        //check both values to see if test is positive or negative
        String actualValue = selenium.getElement("#anchor0 > td:nth-child(2)").getText();
        Assert.assertEquals(expectedValue, actualValue);

        //debuging
        String transactionDate = selenium.getElement("#anchor0 > td:nth-child(1)").getText();
        System.out.println("THE TRANSACTION DATE IS: " + transactionDate);
        System.out.println("THE TRANSACTION AMOUNT IS: " + actualValue);

        //Quit
        selenium.driver.quit();


    }

}
