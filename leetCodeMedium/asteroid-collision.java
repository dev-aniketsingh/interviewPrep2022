class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        // Create a stack to hold the asteroids as they collide
        Stack<Integer> st = new Stack<>();
        
        // Iterate through each asteroid in the input array
        for (int val : asteroids) {
            // If the asteroid is moving to the left...
            if (val < 0) {
                // Keep popping asteroids off the stack until we either run out of asteroids
                // moving to the right or we encounter an asteroid that is larger than the
                // current asteroid
                while (!st.isEmpty() && st.peek() < -val && st.peek() > 0) {
                    st.pop();
                }
                
                // If the top asteroid on the stack is moving to the right and has the same
                // size as the current asteroid, they will collide and both be destroyed
                if (!st.isEmpty() && st.peek() == -val) {
                    st.pop();
                }
                // If the stack is empty or the top asteroid on the stack is moving to the left,
                // the current asteroid will survive and be pushed onto the stack
                else if (st.isEmpty() || st.peek() < 0) {
                    st.push(val);
                }
            }
            // If the asteroid is moving to the right, it will always survive and be pushed onto the stack
            else {
                st.add(val);
            }
        }
        
        // Construct the final array of surviving asteroids using the stack
        int arr[] = new int[st.size()];
        for (int i = st.size() - 1; i >= 0; i--) {
            arr[i] = st.pop();
        }
        return arr;
    }
}