import java.util.*;

class Program {
  public static int[] findThreeLargestNumbers(int[] array) {
    
    Arrays.sort(array);
    int l = array.length-1;
    return new int[] {array[l-2],array[l-1],array[l]}; 
  }
}
