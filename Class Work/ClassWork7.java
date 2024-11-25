import java.util.Scanner;

  public class ClassWork7 {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      System.out.println("Welcome please Select your chosen course: ");
      System.out.println("1. Math");
      System.out.println("2. Science");
      System.out.println("3. History");
        
      int course = input.nextInt();
      
      switch (course) {  
      
        case 1 ->
          {System.out.println("Welcome Math student please select your grade level:");
          System.out.println("1. Freshman");
          System.out.println("2. Sophomore");
          System.out.println("3. Junior");
          System.out.println("4. Senior");
          
          int grade_level = input.nextInt();
    
          switch (grade_level) {
          
            case 1 ->
              System.out.println("Welcome Freshman, your course instructor is Miss Jenifer");

            case 2 ->
              System.out.println("Welcome Sophomore, your course instructor is Master Alfred");

            case 3 ->
              System.out.println("Welcome Junior, your course instructor is Mr. S.K");

            case 4 ->
              System.out.println("Welcome Senior, your course instructor is Mr. Chibuzor");}
                  
}
        
        case 2 ->
          {System.out.println("Welcome Science student please select your grade level:");
          System.out.println("1. Freshman");
          System.out.println("2. Sophomore");
          System.out.println("3. Junior");
          System.out.println("4. Senior");
          
          int grade_level = input.nextInt();
    
          switch (grade_level) {
          
            case 1 ->
              System.out.println("Welcome Freshman, your course instructor is Miss Kim");

            case 2 ->
              System.out.println("Welcome Sophomore, your course instructor is Master Alfred");

            case 3 ->
              System.out.println("Welcome Junior, your course instructor is Mr. Femi");

            case 4 ->
              System.out.println("Welcome Senior, your course instructor is Mr. Fransis");}
                  
}

        case 3 ->
          {System.out.println("Welcome History student please select your grade level:");
          System.out.println("1. Freshman");
          System.out.println("2. Sophomore");
          System.out.println("3. Junior");
          System.out.println("4. Senior");
          
          int grade_level = input.nextInt();
    
          switch (grade_level) {
          
            case 1 ->
              System.out.println("Welcome Freshman, your course instructor is Miss Jenifer");

            case 2 ->
              System.out.println("Welcome Sophomore, your course instructor is Master Alfred");

            case 3 ->
              System.out.println("Welcome Junior, your course instructor is Mr. Fransis");

            case 4 ->
              System.out.println("Welcome Senior, your course instructor is Mr. Chibuzor");}
                  
}

        default ->
          {System.out.println("Please select among those course that are highlighted above!!!");} 
    }
  }
}

