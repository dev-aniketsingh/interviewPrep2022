class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        int len = queries.length;
        int[] res = new int[len];
        for(int i = 0; i < len; i++) {
            for(int j = 0; j < points.length; j++) {
                int xCircle = queries[i][0];
                int yCircle = queries[i][1];
                int radius = queries[i][2];
                int xPoint = points[j][0];
                int yPoint = points[j][1];
                xPoint = xPoint - xCircle;
                yPoint = yPoint - yCircle;
                double d = Math.sqrt(xPoint * xPoint + yPoint * yPoint);
                if (d <= radius) {
                    res[i] += 1;
                }
            }
        }
        return res;
    }
}