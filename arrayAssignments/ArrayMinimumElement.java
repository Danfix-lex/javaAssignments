public class ArrayMinimumElement {
   public static void main(String[] args) {
      
     int [] numbers = {2, 4, 6, 8, 10, 12, 14};
      
     int minimum = numbers[0];
      
     for(int i : numbers) {
       if (i < minimum) {
         minimum = i;
       }
     }
      
     System.out.println(minimum);
      
      
      }
    }
