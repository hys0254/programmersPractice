package PP_LV1.PP_stringToInteger;

public class Solution {
    public int solution(String s) {
        int answer;
        StringBuilder sb = new StringBuilder(s.substring(1, s.length()));
       if(s.charAt(0)=='-'){
            answer=-Integer.parseInt(sb.toString());
       }else if(s.charAt(0)=='+'){
            answer=+Integer.parseInt(sb.toString());
       }else{
           answer=Integer.parseInt(s);
       }
       return answer;
    }
}
