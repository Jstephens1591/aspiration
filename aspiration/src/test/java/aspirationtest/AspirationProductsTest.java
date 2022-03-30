package aspirationtest;


import org.junit.jupiter.api.Test;
import aspiration.AspirationProducts;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AspirationProductsTest {
    @Test
    public void TestTwoProducts(){
        AspirationProducts products = new AspirationProducts();
        Boolean result = products.TwoProducts();
        assertTrue(result);
    }

    @Test
    public void TestClickGetAspiration(){
        AspirationProducts products = new AspirationProducts();
        Boolean result = products.ClickGetAspiration();
        assertTrue(result);
    }

    @Test
    public void ClickGetAspirationPlus(){
        AspirationProducts products = new AspirationProducts();
        Boolean result = products.ClickGetAspirationPlus();
        assertTrue(result);
    }

    @Test
    public void ClickPlusYearlyPrice(){
        AspirationProducts products = new AspirationProducts();
        String price = products.PlusYearlyPrice();
        assertEquals("$71.88", price);
    }

    @Test
    public void ClickPlusMonthlyPrice(){
        AspirationProducts products = new AspirationProducts();
        String price = products.PlusMonthlyPrice();
        assertEquals("$7.99", price);
    }
}