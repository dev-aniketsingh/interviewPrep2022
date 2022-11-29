class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(numRows <= 0) 
            return res;
        List<Integer> firstRow = new ArrayList<Integer>();
        firstRow.add(1);
	    res.add(firstRow);
        for(int i = 1; i < numRows; i++) {
            List<Integer> prev = res.get(i-1);
            List<Integer> currrent = new ArrayList<Integer>();
            currrent.add(1);
            for (int j = 1; j < i ; j++) {
			    currrent.add(prev.get(j-1) + prev.get(j));   
		    }
            currrent.add(1);
            res.add(currrent);
        }

        
        return res;
    }
}