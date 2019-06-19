import java.util.Arrays; 

public class Swift {
  // add an additional 0 on the next index
  // ex: [1, 0, 1, 0, 5, 3, 4]
  // res: [1, 0, 0, 1, 0, 0, 5]
  // the paramater array has to be modified
  // if there are multiple 0, add additional 0 equals to number of consecutives 0
  // ex: [1, 0, 0, 0, 5, 3, 4]
  // res: [1, 0, 0, 0, 0, 0, 0]
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
