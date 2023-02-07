class Solution {
    public String interpret(String command) {
      int len = command.length();
      String result = "";
      for(int i = 0; i < len; i++) {
          if(command.charAt(i) == 'G')
            result += "G";
          else if(command.charAt(i) =='(' && command.charAt(i+1) == ')') {
              result += "o";
              i++;
          }
          else if(command.charAt(i)    ==  '('  && 
                  command.charAt(i+1)  ==  'a'  && 
                  command.charAt(i+2)  ==  'l'  && 
                  command.charAt(i+3)  ==  ')'
                ) {
               result += "al"; 
               i = i+3;    
           }
      }  
      return result;
    }
}