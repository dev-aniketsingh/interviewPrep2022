import java.util.*;

class Program {
  public static int[] twoNumberSum(int[] array, int targetSum) {
    // Write your code here.
    Set<Integer> nums = new HashSet<>();
    for(int num : array) {
     int potentialMatch = targetSum- num;
      if(nums.contains(potentialMatch)) {
        return new int[] {potentialMatch, num};
      }
      else {
        nums.add(num);
      }
    }
    
    return new int[0];
  }
}
