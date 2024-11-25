import java.util.Scanner;

  public class ClassWork6 {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      System.out.println("Welcome please Select your department in your working place: ");
      System.out.println("1. IT");
      System.out.println("2. HR");
      System.out.println("3. Finance");
        
      int department = input.nextInt();
      
      switch (department) {  
      
        case 1 ->
          {System.out.println("Welcome (IT Personnel) please Select your level in your department:");
          System.out.println("1. Manager");
          System.out.println("2. Analyst");
          System.out.println("3. Intern");
          
          int IT = input.nextInt();
    
          switch (IT) {
          
            case 1 ->
              System.out.println("Welcome Manager, so glad to have you");

            case 2 ->
              System.out.println("Welcome Analyst, so glad to have you");

            case 3 ->
              System.out.println("Welcome Intern, so glad to have you");}
                  
}
        
        case 2 ->
          {System.out.println("Welcome (HR Personnel) please Select your level in your department:");
          System.out.println("1. Manager");
          System.out.println("2. Analyst");
          System.out.println("3. Intern");

          int HR = input.nextInt();
    
          switch (HR) {
          
            case 1 ->
              System.out.println("Welcome Manager, so glad to have you");

            case 2 ->
              System.out.println("Welcome Analyst, so glad to have you");

            case 3 ->
              System.out.println("Welcome Intern, so glad to have you");}
}

        case 3 ->
          {System.out.println("Welcome (Finance Personnel) please Select your level in your department:");
          System.out.println("1. Manager");
          System.out.println("2. Analyst");
          System.out.println("3. Intern");

          int Finance = input.nextInt();
    
          switch (Finance) {
          
            case 1 ->
              System.out.println("Welcome Manager, so glad to have you");

            case 2 ->
              System.out.println("Welcome Analyst, so glad to have you");

            case 3 ->
              System.out.println("Welcome Intern, so glad to have you");}

}

        default ->
          {System.out.println("Please select among those department that are highlighted above!!!");} 
    }
  }
}

