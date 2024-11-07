public class SquaredTableNumbers {  
  public static void main(String[] args){
  
    System.out.println("N\tN2\tN3\tN4");
    int count = 1;
    while (count <= 5) {
    System.out.printf("%d\t%d\t%d\t%d%n", count, count * count, count*count*count, count*count*count*count);
    count++;
    }
  }
}
