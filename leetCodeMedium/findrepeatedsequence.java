class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
       List<String> ans = new ArrayList<>();
        Map<String,Integer> hm = new HashMap<>();
        for(int i=0;i+10<=s.length();i++){
            String t = s.substring(i,i+10);
            int count = hm.getOrDefault(t,0);
            if(count==1) ans.add(t);
            hm.put(t,count+1);
        }   
        return ans; 
    }
}