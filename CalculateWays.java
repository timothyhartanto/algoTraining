public class CalculateWays {
  public int calculateWays(int n) {
    if(n == 0)
      return 1;
    if(n < 0)
      return 0;
    int sum = 0;
    for(int i = 1; i <= 6; i++){
      sum += calculateWays(n - i);
    }
    return sum;
  }
}
