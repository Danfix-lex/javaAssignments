public class ArrayReverse {
   public static void main(String[] args) {
   
  int [] numbers = {14, 23, 56, 78, 100};
  
  int reverse = numbers[0];
  
  for(int i = numbers.length - 1; i >=0; i--) {
  System.out.print(numbers[i] + ", ");
 
    }
  }
}
