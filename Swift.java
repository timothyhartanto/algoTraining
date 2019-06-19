import java.util.Arrays; 

public class Swift {
  public void swift(int[] arr) {
    int[] temp = Arrays.copyOf(arr, arr.length);
    int j = 0;

    for(int i = 0; i < arr.length; i++) {
      arr[i] = temp[j];
      if(temp[j] == 0 && i < arr.length - 1) {
        arr[i + 1] = 0;
        i++;
      }
      j++;
    }
  }
}
