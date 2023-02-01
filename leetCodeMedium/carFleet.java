class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        // If there is only one car, it is considered a fleet by itself
        if (position.length == 1) return 1;

        int result = 0;
        int[] positionAndSpeed = new int[target];

        // Fill the positionAndSpeed array with the speed of each car at its position
        for (int i = 0; i < speed.length; i++) {
            positionAndSpeed[position[i]] = speed[i];
        }

        double minTime = 0;
        // Loop through the positionAndSpeed array backwards
        for (int i = target - 1; i >= 0; i--) {
            // Skip this position if it doesn't represent a car (i.e., its value is 0)
            if (positionAndSpeed[i] == 0) continue; 

            // Calculate the time it will take for this car to reach the target distance
            double time = (target - i + 0.0) / positionAndSpeed[i];

            // If the time it will take for this car to reach the target is greater than the minimum time it took for the previous cars to reach the target,
            // then this car belongs to a new fleet
            if (time > minTime) {
                minTime = time;
                result++;
            }
        }

        return result;
    }
}