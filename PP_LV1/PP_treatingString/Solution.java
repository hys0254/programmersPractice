package PP_LV1.PP_treatingString;

public class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        try {
            if(s.charAt(0)=='-'||s.charAt(0)=='+'){
                answer=false;
            }else if(s.length()!=4&&s.length()!=6){
                answer=false;
            }else{
                Integer.parseInt(s);
            }
        } catch (Exception e) {
            answer=false;    
        }
        
        return answer;
    }
}
