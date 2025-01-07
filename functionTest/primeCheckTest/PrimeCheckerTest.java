    public void getPrimeNumbersBeforeInputTest(){
    //given (pre-conditions)
    IntToArrayFunction intToArrayFunction = new IntToArrayFunction();
    
    //action (the functionality being tested)
    int number = 19;
    int[] primeNumbersToArray = intToArrayFunction.primeNumbersToArray(number);
    
    //check
    int[] expected = {2, 3, 5, 7, 11, 13, 17};
    for (int index = 0; index < primeNumbers.length; index ++) {
      if (primeNumbers[index] != expected[index]) {
        System.out.printf("test fail \nexpected: %d\nactural: %d"expected[index], primeNumbers[index]);
        System.exit(1);
    }
  }
}
