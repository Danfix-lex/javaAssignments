import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.text.SimpleDateFormat;
import java.util.Date;

class ElectronicCheckoutSystemTest {

    @Test
    public void testGenerateInvoice() {
        String customerName = "Daniel Ojo";
        String[] productNames = {"Parfait", "Rice"};
        int[] quantities = {2, 2};
        double[] prices = {2100.00, 550.00};
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
                + String.format("%-15s %-5d %-10.2f %-10.2f\n", "Parfait", 2, 2100.00, 4200.00)
                + String.format("%-15s %-5d %-10.2f %-10.2f\n", "Rice", 2, 550.00, 1100.00)
                + "===============================================\n"
                + String.format("Sub Total: %31.2f\n", 5300.00)
                + String.format("Discount: %32.2f\n", 424.00)
                + String.format("VAT @ 7.5%%: %31.2f\n", 927.75)
                + "===============================================\n"
                + String.format("Bill Total: %30.2f\n", 5883.75)
                + "===============================================\n"
                + "THIS IS NOT A RECEIPT. KINDLY PAY " + String.format("%.2f", 5883.75) + "\n";

        String actualInvoice = ElectronicCheckoutSystem.generateReceiptAndHandlePayment(customerName, productNames, quantities, prices, discountPercent, cashierName);

        String dynamicDatePattern = new SimpleDateFormat("dd-MMM-yyyy hh:mm:ss a").format(new Date());
        String actualInvoiceWithoutDate = actualInvoice.replace(dynamicDatePattern, "Date: 18-Dec-22 08:57:31 pm");

        assertEquals(expectedInvoice, actualInvoiceWithoutDate);
    }
}

