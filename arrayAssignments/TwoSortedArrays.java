  import java.util.Arrays;
  
  public class TwoSortedArrays {
    public static void main(String[] args) {
  
    int [] array = {2, 6, 7};
    int [] arrays = {6, 8, 2};
    int [] numbers = new int [array.length + arrays.length];
    
    for(int count = 0; count < numbers.length; count++) {
      if(count < array.length) {
      numbers [count] = arrays [count+array.length];
      }
    }
      int num = 0;
      for (int number = 0; number < numbers.length; number++) {
        for (int counter = number + 1; counter < numbers.length; counter++) {
          if (numbers  [counter] < numbers [number] ) {
              num = numbers[counter];
              numbers[counter] = numbers [number];
              numbers [number] = num;
          }
        }
      }
          System.out.println(Arrays.toString(numbers));
    }
  }
