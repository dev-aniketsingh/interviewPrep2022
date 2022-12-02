import java.util.*;

class Program {
  public static int[] twoNumberSum(int[] array, int targetSum) {
    int size = array.length;
    for(int i = 0; i < size - 1; i++) {
      int firstNum = array[i];
      for(int j = i+1; j < size; j++) {
        int secondNum = array[j];
        if(firstNum+secondNum == targetSum) {
           return new int[] {firstNum,secondNum};
        }
      }
    }
    return new int[0];
  }
}
