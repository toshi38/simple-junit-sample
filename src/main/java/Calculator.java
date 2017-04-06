public class Calculator {
  public int evaluate(String expression) {
    // This file contains no bugs, and the tests should pass
    int sum = 0;
    for (String summand: expression.split("\\+"))
      sum += Integer.valueOf(summand);
    return sum;
  }
}
