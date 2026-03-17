import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ShoppingCartTest {


    @Test
    void testSingleItem() {
        double result = ShoppingCart.calculateTotalCost(10.0, 3);
        assertEquals(30.0, result);
    }

    @Test
    void testZeroQuantity() {
        double result = ShoppingCart.calculateTotalCost(10.0, 0);
        assertEquals(0.0, result);
    }

    @Test
    void testDecimalPrice() {
        double result = ShoppingCart.calculateTotalCost(2, 5);
        assertEquals(10.0, result);
    }
}