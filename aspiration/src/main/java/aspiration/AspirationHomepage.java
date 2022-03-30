package aspiration;


import org.openqa.selenium.By;


public class AspirationHomepage extends AspirationBase {

    public void home(){
        driver.get("https://www.aspiration.com/");
    }

    //Use AFTER home()
    public String spendAndSave(){
        driver.get(driver.getCurrentUrl());
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/header/ul[1]/li[1]/a")).click();
        return driver.getCurrentUrl();
    }

}


