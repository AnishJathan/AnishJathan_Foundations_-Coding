import java.util.*;

public class solution {
  public static void main(String[] args) {
    int[] arr = new int[] { 2,30,56 };
    // sorting logic
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        int tmp = 0;
        if (arr[i] < arr[j]) {
          tmp = arr[i];
          arr[i] = arr[j];
          arr[j] = tmp;
        }
      }
      // prints the sorted element of the array
      System.out.print(arr[i]);
    }
  }
}