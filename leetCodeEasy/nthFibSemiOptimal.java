import java.util.*;

//O(n) time and O(n) space

class Program {
  public static int getNthFib(int n) {
    // Write your code here.

    Map<Integer, Integer> cache = new HashMap<Integer, Integer>();
    cache.put(1,0);
    cache.put(2,1);
    return getNthFib(n, cache);
  }

  public static int getNthFib(int n, Map<Integer, Integer> cache) {
    if(cache.containsKey(n)) 
      return cache.get(n);
    else {
      cache.put(n, getNthFib(n-1, cache) + getNthFib(n-2, cache));
      return cache.get(n);
    }
  }

  
}
