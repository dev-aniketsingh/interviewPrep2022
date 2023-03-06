public class Solution {
    /*
     * @param strs: a list of strings
     * @return: encodes a list of strings to a single string.
     */
    public String encode(List<String> strs) {
        // write your code here
        StringBuilder s = new StringBuilder(""); ;
        for(int i = 0; i < strs.size(); i++) {
            s.append(strs.get(i));
            s.append(":;");
        }
        return s.toString();
    }

    /*
     * @param str: A string
     * @return: dcodes a single string to a list of strings
     */
    public List<String> decode(String str) {
        // write your code here
        List<String> string = new ArrayList<>();
        StringBuilder s = new StringBuilder(""); ;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ':' && str.charAt(i+1) == ';') {
                i++;
                string.add(s.toString());
                s.setLength(0);
            }
            else
                s.append(str.charAt(i));

        }

        return string;

    }
}