class Solution {
    public String defangIPaddr(String address) {
        int len = address.length();
        String newS= "";
        for(int i = 0; i < len; i++) {
            if(address.charAt(i) == '.') {
                newS += "[.]";
            }
            else {
                newS += address.charAt(i);
            }
        }
        return newS;
    }
}