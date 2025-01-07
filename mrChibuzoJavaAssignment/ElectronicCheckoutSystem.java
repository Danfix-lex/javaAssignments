import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ElectronicCheckoutSystem {

    public static String generateReceiptAndHandlePayment(String customerName, String[] productNames, int[] quantities, double[] prices, double discountPercent, String cashierName) {
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

        String invoice = "";
        invoice += "\nSEMICOLON STORES\n";
        invoice += "MAIN BRANCH\n";
        invoice += "LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.\n";
        invoice += "TEL: 0329382343\n";

        String currentDate = new SimpleDateFormat("dd-MMM-yyyy hh:mm:ss a").format(new Date());
        invoice += "Date: " + currentDate + "\n";
        invoice += "Cashier: " + cashierName + "\n";
        invoice += "Customer Name: " + customerName + "\n";
        invoice += "===============================================\n";
        invoice += String.format("%-15s %-5s %-10s %-10s\n", "ITEM", "QTY", "PRICE", "TOTAL(NGN)");
        invoice += "===============================================\n";

        for (int i = 0; i < itemCount; i++) {
            invoice += String.format("%-15s %-5d %-10.2f %-10.2f\n", productNames[i], quantities[i], prices[i], totals[i]);
        }

        invoice += "===============================================\n";
        invoice += String.format("Sub Total: %31.2f\n", subtotal);
        invoice += String.format("Discount: %32.2f\n", discount);
        invoice += String.format("VAT @ 7.5%%: %31.2f\n", vat);
        invoice += "===============================================\n";
        invoice += String.format("Bill Total: %30.2f\n", total);
        invoice += "===============================================\n";
        invoice += "THIS IS NOT A RECEIPT. KINDLY PAY " + String.format("%.2f", total) + "\n";

        System.out.println(invoice);

        Scanner scanner = new Scanner(System.in);
        double amountPaid;
        String finalReceipt = "";

        while (true) {
            System.out.print("\nHow much did the customer give to you? ");
            amountPaid = scanner.nextDouble();

            if (amountPaid < total) {
                System.out.println("Insufficient payment! The amount is less than the bill total.");
            } else {
                double change = amountPaid - total;

                finalReceipt += "\nSEMICOLON STORES\n";
                finalReceipt += "MAIN BRANCH\n";
                finalReceipt += "LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.\n";
                finalReceipt += "TEL: 0329382343\n";
                finalReceipt += "Date: " + currentDate + "\n";
                finalReceipt += "Cashier: " + cashierName + "\n";
                finalReceipt += "Customer Name: " + customerName + "\n";
                finalReceipt += "===============================================\n";
                finalReceipt += String.format("%-15s %-5s %-10s %-10s\n", "ITEM", "QTY", "PRICE", "TOTAL(NGN)");
                finalReceipt += "===============================================\n";

                for (int i = 0; i < itemCount; i++) {
                    finalReceipt += String.format("%-15s %-5d %-10.2f %-10.2f\n", productNames[i], quantities[i], prices[i], totals[i]);
                }

                finalReceipt += "===============================================\n";
                finalReceipt += String.format("Sub Total: %31.2f\n", subtotal);
                finalReceipt += String.format("Discount: %32.2f\n", discount);
                finalReceipt += String.format("VAT @ 7.5%%: %31.2f\n", vat);
                finalReceipt += "===============================================\n";
                finalReceipt += String.format("Bill Total: %30.2f\n", total);
                finalReceipt += String.format("Amount Paid: %28.2f\n", amountPaid);
                finalReceipt += String.format("Balance: %31.2f\n", change);
                finalReceipt += "===============================================\n";
                finalReceipt += "THANK YOU FOR YOUR PATRONAGE\n";

                break;
            }
        }

        return finalReceipt;
    }
}
