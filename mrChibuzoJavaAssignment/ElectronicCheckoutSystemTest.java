import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ElectronicCheckoutSystemTest {

    @Test
    public void testGenerateInvoice() {
        String customerName = "Daniel Ojo";
        String[] productNames = {"Parfait", "Rice"};
        int[] quantities = {2, 3};
        double[] prices = {10.0, 5.0};
        double discountPercent = 10;
        String cashierName = "Jenny";

        String expectedInvoice = "\nSEMICOLON STORES\n"
                + "MAIN BRANCH\n"
                + "LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.\n"
                + "TEL: 0329382343\n"
                + "Date: " + new SimpleDateFormat("dd-MMM-yyyy hh:mm:ss a").format(new Date()) + "\n"
                + "Cashier: Jenny\n"
                + "Customer Name: Daniel Ojo\n"
                + "===============================================\n"
                + String.format("%-15s %-5s %-10s %-10s\n", "ITEM", "QTY", "PRICE", "TOTAL(NGN)")
                + "===============================================\n"
                + String.format("%-15s %-5d %-10.2f %-10.2f\n", "Parfait", 2, 10.0, 20.0)
                + String.format("%-15s %-5d %-10.2f %-10.2f\n", "Rice", 3, 5.0, 15.0)
                + "===============================================\n"
                + String.format("Sub Total: %31.2f\n", 35.0)
                + String.format("Discount: %32.2f\n", 3.5)
                + String.format("VAT @ 7.5%%: %31.2f\n", 2.36)
                + "===============================================\n"
                + String.format("Bill Total: %30.2f\n", 33.86)
                + "===============================================\n"
                + "THIS IS NOT A RECEIPT. KINDLY PAY " + String.format("%.2f", 33.86) + "\n";

        String actualInvoice = ElectronicCheckoutSystem.generateInvoice(customerName, productNames, quantities, prices, discountPercent, cashierName);

        assertEquals(expectedInvoice, actualInvoice);
    }
}

