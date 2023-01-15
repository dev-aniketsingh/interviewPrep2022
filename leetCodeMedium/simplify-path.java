class Solution {
    public String simplifyPath(String path) {
        
        Stack<String> s = new Stack<>();
        String[] parts = path.split("/");

        for(int i = 0; i < parts.length; i++) {
            if(parts[i].equals("..") && !s.isEmpty()) {                    
                s.pop();
            }
            else if(!parts[i].equals(".") && !parts[i].equals("") && !parts[i].equals("..")) {
                s.push(parts[i]);
            }
        }
        return "/" + String.join("/", s);
    }
}