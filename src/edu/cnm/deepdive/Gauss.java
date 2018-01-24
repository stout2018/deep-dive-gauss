package edu.cnm.deepdive;

public class Gauss {

  private static final int DEFAULT_UPPER_LIMIT = 100;
  
  public static void main(String[] args) {    
    int upperLimit = (args.length > 0) ? Integer.parseInt(args[0]) : DEFAULT_UPPER_LIMIT;
    //long sumResult = sum(upperLimit;)
    System.out.printf("The sum from 1 to %,d is %,d%n", upperLimit, sum(upperLimit));
  }

  public static long sum(int limit) {
    long sum = 0;
    for (int i = 1; i <= limit; i++) {
      sum += i;
    }
    return sum;
  }
  public static long smartSum(int limit) {
    long sum = ((long) limit) * ((long) limit + 1) / 2;
    return sum;
  }
  
}
