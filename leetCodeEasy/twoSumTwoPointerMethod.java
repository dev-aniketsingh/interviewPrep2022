import java.util.*;

class Program {
  public static int[] twoNumberSum(int[] array, int targetSum) {
    // Write your code here.
    Arrays.sort(array);
    int left = 0;
    int right = array.length - 1;
    while(left < right) {
      int currentSum = array[left] + array[right];
      if(currentSum == targetSum) {
        return new int[] {array[left],array[right]};
      }
      else if(currentSum < targetSum) {
        left++;
      }
      else if(currentSum > targetSum) {
        right--;
      }
    }
    return new int[0];
  }
}
