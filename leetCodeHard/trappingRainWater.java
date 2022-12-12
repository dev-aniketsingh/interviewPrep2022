 int n = height.length;
        
        // Calculate left maximum height
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i = 1; i < n; i++){
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }

        // Calculate right maximum height
        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1];
        for(int i = n - 2; i >= 0; i--){
            rightMax[i] = Math.max(rightMax[i +1],height[i]);
        }

        // If the water at current position computed as negative
        // do not add it to answer
        int water = 0;
        for(int i = 1; i < n - 1; i++){
            int currWater = Math.min(leftMax[i - 1],rightMax[i + 1]) - height[i];
            if(currWater > 0)
                water += currWater;
        }
        return water;