package aspirationtest;


import org.junit.jupiter.api.Test;
import aspiration.AspirationHomepage;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class AspirationHomepageTest {

    @Test
    public void TestSpendAndSave(){
        AspirationHomepage homepage = new AspirationHomepage();
        homepage.home();
        String newUrl = homepage.spendAndSave();
        assertEquals(newUrl, "https://www.aspiration.com/our-products");
    }

}