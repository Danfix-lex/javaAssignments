public class TriangleReturnFunction4 {
    public static void main(String[] args) {

        triangleAsteriksFirst(1);
        triangleSpaces(4);
        triangleAsteriksSecond(1);
        
        triangleAsteriksFirst(2);
        triangleSpaces(3);
        triangleAsteriksSecond(2);
        
        triangleAsteriksFirst(3);
        triangleSpaces(2);
        triangleAsteriksSecond(3);
        
        triangleAsteriksFirst(4);
        triangleSpaces(1);
        triangleAsteriksSecond(4);
        
        triangleAsteriksFirst(4);
        triangleSpaces(1);
        triangleAsteriksSecond(4);
        
        triangleAsteriksFirst(3);
        triangleSpaces(2);
        triangleAsteriksSecond(3);
        
        triangleAsteriksFirst(2);
        triangleSpaces(3);
        triangleAsteriksSecond(2);
        
        triangleAsteriksFirst(1);
        triangleSpaces(4);
        triangleAsteriksSecond(1);
    }
        public static void triangleAsteriksFirst(int trangleAsteriksNumberFirst) {
        for (int number = 0; number < trangleAsteriksNumberFirst; number++) {
          System.out.print("* ");
        }
      }
        public static void triangleSpaces(int trangleSpacesNumber) {
        for (int number = 0; number < trangleSpacesNumber; number++) {
          System.out.print();
        }
      }
        public static void triangleAsteriksSecond(int trangleAsteriksNumberSecond) {
        for (int number = 0; number < trangleAsteriksNumberSecond; number++) {
          System.out.print(" *");
        }
      }
}
