import java.util.*;

//O(n) time and O(1) space

class Program {
  public static int getNthFib(int n) {
    // Write your code here.
    int[] record = {0,1};
    int counter = 3;
    while(counter <= n) {
      int nextFib = record[0] + record[1];
      record[0] = record[1];
      record[1] = nextFib;
      counter++;
    }
    if(n>1) {
      return record[1];
    }
    return record[0];
  }
}
