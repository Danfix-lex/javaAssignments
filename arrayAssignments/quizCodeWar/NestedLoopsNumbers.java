  public class NestedLoopsNumbers {
    public static void main(String[] args) {
      
      for(int j = 1; j <= 20; j = j + 1){
        
          for(int i = 1; i <= j; i = i + 1){
            System.out.print(j + "");
          }
          System.out.println();
    }
  }
}
