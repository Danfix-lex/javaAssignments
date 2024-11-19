  public class AverageArray {
    public static void main(String[] args) {
    
    int average = 0;
    int num = 0;
    
    int [] numbers = {7, 70, 5, 7, 32, 45, 67};
    
      for (int i = 0; i < numbers.length; i ++) {
        System.out.print(numbers[i]);
        
        
          num+= numbers [i];
      average = num / numbers [i];
      }
    System.out.println("Average is: " + average);
    }
    }
