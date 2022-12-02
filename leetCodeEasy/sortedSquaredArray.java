import java.util.*;

class Program {

  public int[] sortedSquaredArray(int[] array) {
    // Write your code here.
    int len = array.length;
    int[] sortedSquared = new int[len];
    for(int i = 0; i < len; i++) {
      sortedSquared[i] = array[i]*array[i];
    }    
    Arrays.sort(sortedSquared);
    return sortedSquared;
  }
}
