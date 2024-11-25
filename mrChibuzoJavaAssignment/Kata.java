public class Kata {
  public static void main(String[] args) {
  
  
  evenOrOdd(10);
  
  numberPrime(8);
  
  numberSubtraction(3, 7);
  
  numberDivision(4, 0);
  
  numberFactor(10);
  
  numberSquare(25);
  
  palindromeNumber(54145);
  
  factoriaNumber(5);
  
  squareOfNumber(25);
  
  
  
    }


  public static boolean evenOrOdd(int number) {

      if (number % 2 == 0) {
          return true;
      } else {
          return false;
      }
    }
    public static boolean numberPrime(int number) {
    if (number <= 1) {
        return false;
    }
    for (int i = 2; i < number; i++) {
        if (number % i == 0) {
            return false;
        }
    }
    return true;
  }
    public static int numberSubtraction(int firstNumber, int secondNumber) {
    if (firstNumber > secondNumber) {
        return firstNumber - secondNumber;
    } else {
        return firstNumber - secondNumber;
    }
  }
    public static float numberDivision(int firstNumber, int secondNumber) {
    if (secondNumber == 0) {
        return 0;
    }
    return (float) firstNumber / secondNumber;
  }
    public static int numberFactor(int number) {
      int count = 0; 
      for (int i = 1; i <= number; i++) {
        if (number % i == 0) {
            count++;
            }
        }
        return count;
  }
    public static boolean numberSquare(int number) {
    int sqrt = (int) Math.sqrt(number);
    if (sqrt * sqrt == number) {
        return true;
    } else {
        return false;
    }
  }
    public static boolean palindromeNumber(int number) {
    String str = String.valueOf(number);
    String reverse = new StringBuilder(str).reverse().toString(); 
    return str.equals(reverse); 
  }
    public static long factoriaNumber(int number) {
    long result = 1; 
    for (int i = 1; i <= number; i++) {
        result *= i; 
    }
    return result; 
  }
    public static long squareOfNumber(int number) {
    return (long) number * number; 
  }

}
