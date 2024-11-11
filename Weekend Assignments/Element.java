public class Element {
    public static void main(String[] args) {
        int[] originalArray = {10, 20, 30, 40, 50};

        int newNumber = 25;
        int position = 2;

        int[] newArray = new int[originalArray.length + 1];

        for (int i = 0; i < newArray.length; i++) {
            if (i < position) {
                newArray[i] = originalArray[i];
            } else if (i == position) {
                newArray[i] = newNumber;
            } else {
                newArray[i] = originalArray[i - 1];
            }
        }
        System.out.print("New array: ");
        for (int num : newArray) {
            System.out.print(num + " ");
        }
    }
}

