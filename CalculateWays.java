public class CalculateWays {
  public int calculateWays(int n, int[] arr) {
    if(n == 0)
      return 1;
    if(n < 0)
      return 0;
    int sum = 0;
    for(int i = 1; i <= 6; i++){
      if(n - i >= 0 && arr[n - i] != 0){
        sum += arr[n -i];
      } else {
        if (n - i >= 0) { 
          arr[n -i] = calculateWays(n - i, arr);
    		  sum += arr[n -i];
        } else {
          sum += calculateWays(n - i, arr);
        }
      }
    }
    return sum;
  }
}
