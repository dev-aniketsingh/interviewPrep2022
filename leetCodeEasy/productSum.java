import java.util.*;

class Program {
  // Tip: You can use `element instanceof ArrayList` to check whether an item
  // is an array or an integer.
  public static int productSum(List<Object> array) {
    // Write your code here.
    return productSum(array,1);
  }

  public static int productSum(List<Object> array, int depth) {
    int sum  = 0;
    for(Object element: array) {
      sum += element instanceof ArrayList ? productSum((ArrayList<Object>)element , depth+1) : (int) element;
    }
  return sum * depth;
  }
}
