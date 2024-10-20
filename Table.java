public class Table {
    public static void main(String[] args) {
        System.out.println("a\tb\tpow(a, b)");
        for (int a = 1; a < 6; a++) {
            int b = a + 1;
            int result = (int) Math.pow(a, b);
            System.out.println(a + "\t" + b + "\t" + result);
        }
    }

