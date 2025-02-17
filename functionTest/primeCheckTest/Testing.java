import java.util.stream.IntStream;

public class PrimeNumberTest{
	public int[] getPrimeNumbersBefore(int input);
	
	
	
	public int[] getPrimeNumbersBefore(int input) {
		IntStream.rangeClosed(1, number)
				.filter((number) -> isNumberPrime(number))
				.toArray(Integer[]::new);


		private boolean isNumberPrime ( int number){
			IntStream.rangeClosed(1, number)
					.filter((x) -> x % number == 0)
					.toList().isEmpty();

		}

	}