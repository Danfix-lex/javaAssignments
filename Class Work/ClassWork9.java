import java.util.Scanner;

  public class ClassWork9 {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      System.out.println("Choose from the bellow type of shape you wish to calculate: ");
      System.out.println("1. Circle");
      System.out.println("2. Rectangle");
      System.out.println("3. Triangle");
        
      int shapes = input.nextInt();
      
      switch (shapes) {  
      
        case 1 ->
          {System.out.println("Please enter the radius of the circle: ");
          float radius = input.nextFloat();
    
          float circle_area = radius / 360;
          System.out.println("The area of your circle is: " + circle_area);}

        case 2 ->
          {System.out.println("Please enter the length of the rectangle: ");
          float length = input.nextFloat();
          System.out.println("Please enter the breadth of the rectangle: ");
          float breadth = input.nextFloat();
    
          float rectangle_area = length * breadth;
          System.out.println("The area of a rectangle is: " + rectangle_area);}

        case 3 ->
          {System.out.println("Please enter the base of the triangle: ");
          float base = input.nextFloat();
          System.out.println("Please enter the height of the triangle: ");
          float height = input.nextFloat();
          
          float triangle_area = base * height;
          System.out.println("The area of a triangle is: " + triangle_area);}
    }
  }
}

          
