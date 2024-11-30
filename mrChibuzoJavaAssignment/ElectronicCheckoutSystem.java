import java.text.SimpleDateFormat;
import java.util.Date;

public class ElectronicCheckoutSystem {

    public static String generateInvoice(String customerName, String[] productNames, int[] quantities, double[] prices, double discountPercent, String cashierName) {
        double subtotal = 0, total, vat, discount = 0;
        int itemCount = productNames.length;

        double[] totals = new double[itemCount];
        for (int i = 0; i < itemCount; i++) {
            double itemTotal = quantities[i] * prices[i];
            totals[i] = itemTotal;
            subtotal += itemTotal;
        }

        discount = discountPercent / 100 * subtotal;
        vat = 0.075 * (subtotal - discount);
        total = subtotal - discount + vat;

        StringBuilder invoice = new StringBuilder();

        invoice.append("\nSEMICOLON STORES\n");
        invoice.append("MAIN BRANCH\n");
        invoice.append("LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.\n");
        invoice.append("TEL: 0329382343\n");

        String currentDate = new SimpleDateFormat("dd-MMM-yyyy hh:mm:ss a").format(new Date());
        invoice.append("Date: ").append(currentDate).append("\n");
        invoice.append("Cashier: ").append(cashierName).append("\n");
        invoice.append("Customer Name: ").append(customerName).append("\n");
        invoice.append("===============================================\n");
        invoice.append(String.format("%-15s %-5s %-10s %-10s\n", "ITEM", "QTY", "PRICE", "TOTAL(NGN)"));
        invoice.append("===============================================\n");

        for (int i = 0; i < itemCount; i++) {
            invoice.append(String.format("%-15s %-5d %-10.2f %-10.2f\n", productNames[i], quantities[i], prices[i], totals[i]));
        }

        invoice.append("===============================================\n");
        invoice.append(String.format("Sub Total: %31.2f\n", subtotal));
        invoice.append(String.format("Discount: %32.2f\n", discount));
        invoice.append(String.format("VAT @ 7.5%%: %31.2f\n", vat));
        invoice.append("===============================================\n");
        invoice.append(String.format("Bill Total: %30.2f\n", total));
        invoice.append("===============================================\n");
        invoice.append("THIS IS NOT A RECEIPT. KINDLY PAY ").append(String.format("%.2f", total)).append("\n");

        return invoice.toString();
    }
}

