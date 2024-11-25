import java.util.Scanner;

  public class ClassWork8 {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      System.out.println("Welcome to Daniel's Ice cream shop, kindly select the type of dessert you like: ");
      System.out.println("1. Ice cream");
      System.out.println("2. Sundae");
      System.out.println("3. Shake");
        
      int dessert = input.nextInt();
      
      switch (dessert) {  
      
        case 1 ->
          {System.out.println("You chose Ice cream please select the flavour you want it to be:");
          System.out.println("1. Chocolate");
          System.out.println("2. Vanilla");
          System.out.println("3. Strawberry");
          
          int flavour = input.nextInt();
    
          switch (flavour) {
          
            case 1 ->
              System.out.println("Please wait while your chocolate ice cream is getting ready...");

            case 2 ->
              System.out.println("Please wait while your vanilla ice cream is getting ready...");

            case 3 ->
              System.out.println("Please wait while your strawberry ice cream is getting ready...");}
                  
}
        
        case 2 ->
          {System.out.println("You chose Sundae please select the flavour you want it to be:");
          System.out.println("1. Chocolate");
          System.out.println("2. Vanilla");
          System.out.println("3. Strawberry");
          
          int flavour = input.nextInt();
    
          switch (flavour) {
          
            case 1 ->
              System.out.println("Please wait while your chocolate sundae is getting ready...");

            case 2 ->
              System.out.println("Please wait while your vanilla sundae is getting ready...");

            case 3 ->
              System.out.println("Please wait while your strawberry sundae is getting ready...");}
                  
}

        case 3 ->
          {System.out.println("You chose Shake please select the flavour you want it to be:");
          System.out.println("1. Chocolate");
          System.out.println("2. Vanilla");
          System.out.println("3. Strawberry");
          
          int flavour = input.nextInt();
    
          switch (flavour) {
          
            case 1 ->
              System.out.println("Please wait while your chocolate shake is getting ready...");

            case 2 ->
              System.out.println("Please wait while your vanilla shake is getting ready...");

            case 3 ->
              System.out.println("Please wait while your strawberry shake is getting ready...");}
                  
}

        default ->
          {System.out.println("Please select among those dessert that are highlighted above!!!");} 
    }
  }
}

