public class PizzaAppPractice {
  public static void main (String[] args) {
       int guests = 15;
        String pizzaType = "Big Boys";

        int[] orderDetails = calculateOrder(guests, pizzaType);

        if (orderDetails[0] == 0) {
            System.out.println("Invalid pizza type!");
        } else {
            System.out.println("Boxes needed: " + orderDetails[0]);
            System.out.println("Leftover slices: " + orderDetails[1]);
            System.out.println("Total price: " + orderDetails[2]);
        }
    }   
    public static int[] calculateOrder(int guests, String pizzaType) {
        String[] pizzaTypes = {"Sapa", "Small Money", "Big Boys", "Odogwu"};
        int[] slicesPerBox = {4, 6, 8, 12};
        int[] pricesPerBox = {2500, 2900, 4000, 5200};

        int slices = 0;
        int price = 0;

        for (int i = 0; i < pizzaTypes.length; i++) {
            if (pizzaTypes[i].equalsIgnoreCase(pizzaType)) {
                slices = slicesPerBox[i];
                price = pricesPerBox[i];
                break;
            }
        }

        if (slices == 0 || price == 0) {
            return new int[]{0, 0, 0};
        }

        int boxesNeeded = (int) Math.ceil((double) guests / slices);
        int leftoverSlices = (boxesNeeded * slices) - guests;
        int totalPrice = boxesNeeded * price;

        return new int[]{boxesNeeded, leftoverSlices, totalPrice};
    }
}
