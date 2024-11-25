public class TriangleReturnFunction3 {
    public static void main(String[] args) {

        triangleAsteriks(1);
        triangleSpaces();
        
        triangleAsteriks(2);
        triangleSpaces();
        
        triangleAsteriks(3);
        triangleSpaces();
        
        triangleAsteriks(4);
        triangleSpaces();
        
        triangleAsteriks(4);
        triangleSpaces();
        
        triangleAsteriks(3);
        triangleSpaces();
        
        triangleAsteriks(2);
        triangleSpaces();
        
        triangleAsteriks(1);
        triangleSpaces();
    }
        public static void triangleAsteriks(int trangleAsteriksNumber) {
        for (int number = 0; number < trangleAsteriksNumber; number++) {
          System.out.print("* ");
        }
      }
        public static void triangleSpaces() {
          System.out.println();
        }
}
