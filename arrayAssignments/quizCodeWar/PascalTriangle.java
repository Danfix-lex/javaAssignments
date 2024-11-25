public class PascalTriangle {

	public static void main(String... args) {
	
	for(int row = 1; row < 5; row++) {
		for(int column = 1; column <= 5 - row; column++) {
			System.out.print("");
		}
			int number = 1;
		for(int count = 0; count <= row; count++) {
			System.out.print(number + " ");
			number = number * (row - count) / (count + 1);
		}
			System.out.println();
	}
	
	}
}
