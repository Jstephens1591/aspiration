package aspiration;

import org.openqa.selenium.By;

public class AspirationProducts extends AspirationBase {

    //Verify that you can see two card products, Aspiration and Aspiration Plus
    public Boolean TwoProducts(){
        driver.get("https://www.aspiration.com/our-products");
        boolean aspiration = driver.findElement(By.xpath("//*[@id=\"content-area\"]/div/spend-save-plans/div/div/div[1]/div[2]/h2")).isDisplayed();
        boolean aspirationPlus = driver.findElement(By.xpath("//*[@id=\"content-area\"]/div/spend-save-plans/div/div/div[2]/div[2]/h2")).isDisplayed();
        if(aspiration && aspirationPlus){
            return true;
        } else {
            return false;
        }

    }

    //Verify that when you click Get Aspiration - A modal containing an input field for an email address to sign up appears.
    //  DO NOT need to sign up
    public Boolean ClickGetAspiration(){
        driver.get("https://www.aspiration.com/our-products");
        driver.findElement(By.xpath("//*[@id=\"content-area\"]/div/spend-save-plans/div/div/div[1]/div[2]/button")).click();
        return driver.findElement(By.xpath("/html/body/div[1]/div/div/div/form/fieldset/div[3]")).isDisplayed();
    }

    //Verify that when you click Get Aspiration Plus - A modal with monthly and yearly plans appears
    public Boolean ClickGetAspirationPlus(){
        driver.get("https://www.aspiration.com/our-products");
        driver.findElement(By.xpath("//*[@id=\"content-area\"]/div/spend-save-plans/div/div/div[2]/div[2]/button")).click();
        boolean monthlyPlan = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[1]/h3")).isDisplayed();
        boolean yearlyPlan = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/h3")).isDisplayed();
        if(monthlyPlan && yearlyPlan){
            return true;
        } else {
            return false;
        }

    }

    //Verify that yearly radio option is $71.88 paid once yearly
    public String PlusYearlyPrice(){
        ClickGetAspirationPlus();
        return driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[1]/p/b")).getText().toString();
    }

    //Verify that monthly radio option is $7.99 paid monthly
    public String PlusMonthlyPrice(){
        ClickGetAspirationPlus();
        return driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/p/b")).getText().toString();
    }

}