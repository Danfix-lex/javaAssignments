import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PizzaAppTest {
    @Test
    void testCalculateOrder() {
        int[] result = PizzaApp.calculateOrder(45, "Odogwu");
        int[] expected = {4, 3, 20800};
        assertArrayEquals(expected, result);

        result = PizzaApp.calculateOrder(20, "Small Money");
        expected = new int[]{4, 4, 11600};
        assertArrayEquals(expected, result);

        result = PizzaApp.calculateOrder(10, "Unknown");
        expected = new int[]{0, 0, 0};
        assertArrayEquals(expected, result);
    }
}

