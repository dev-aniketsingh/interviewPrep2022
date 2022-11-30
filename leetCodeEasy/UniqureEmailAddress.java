class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<String>();
        int count=0;
        for(String email: emails) {
            String[] parts = email.split("\\@");
            String[] local = parts[0].split("\\+");
            set.add(local[0].replace(".","")+"@"+(parts[1]));
        }
        return set.size();
    }
}