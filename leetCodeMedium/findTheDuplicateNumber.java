class Solution {
    public int findDuplicate(int[] arr) {    
    int tortoise = arr[0];
    int hare = arr[0];
    // Loop till we find the
    // duplicate element
    while (true) {
        tortoise = arr[tortoise];
        // Hare moves with twice
        // the speed of tortoise
        hare = arr[arr[hare]];
        if (tortoise == hare)
            break;
    }
    tortoise = arr[0];
    // Loop to get start point
    // of the cycle as start
    // point will be the duplicate
    // element
    while (tortoise != hare) {
        tortoise = arr[tortoise];
        hare = arr[hare];
    }
        return hare;

    }
}