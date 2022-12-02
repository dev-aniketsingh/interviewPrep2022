import java.util.*;

class Program {
  public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
    // Write your code here.
    int index = 0;
    for(int i = 0; i < array.size(); i++) {
      if(array.get(i) == sequence.get(index)) {
        index++;
      }
      if(index == sequence.size()) {
        break;
      }
    }
    return index == sequence.size();
  }
}
