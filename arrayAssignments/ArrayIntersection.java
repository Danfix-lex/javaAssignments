  public class ArrayIntersection {
    public static void main(String[] args) {
    
    int [] arrays = {5, 5, 7, 3, 9};
    int [] array = {7, 8, 9, 4, 6};
    
    for (int number = 0; number < arrays.length; number ++) {
      int counter = 0;
    for (int count = number+1; count < array.length; count ++) {
      if (arrays [number] == array [count]) {
        counter ++;
      }
    }
      if (counter > 0);
      System.out.println(arrays[number]);
    }
    }
    }
