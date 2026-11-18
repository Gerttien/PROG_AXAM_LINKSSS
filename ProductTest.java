import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductTest {
    @Test
    public void GetTotalProductSales_WithValidData_ReturnsCorrectValue() {
        int[][] sales = {{25, 18, 20}, {15, 10, 12}, {18, 15, 20}};
        String[] products = {"Cozy Nights Monarch", "Restonic Barbados", "Sealy Phuket"};
        Product product = new Product(sales, products);
        assertEquals(153, product.GetTotalProductSold());
    }

    @Test
    public void GetAverageSales_WithValidData_ReturnsCorrectValue() {
        int[][] sales = {{25, 18, 20}, {15, 10, 12}, {18, 15, 20}};
        String[] products = {"Cozy Nights Monarch", "Restonic Barbados", "Sealy Phuket"};
        Product product = new Product(sales, products);
        assertEquals(17.0, product.GetAverageProductSold(), 0.01);
    }
}