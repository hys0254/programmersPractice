package PP_LV2.PP_올바른_괄호;
import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        Stack<Character> tempStack = new Stack<>();
        if(s.charAt(0)!='('||s.charAt(s.length()-1)!=')'||s.length()%2!=0){
            answer=false;
            return answer;
        }
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        for(int i=0; i<s.length();i++){
            if(s.charAt(i)=='('){
                tempStack.push(s.charAt(i));
            }else if(s.charAt(i)==')'){
                try{
                tempStack.pop();
                }catch(Exception e){
                    
                    answer=false;
                    return answer;
                }
            }
        }
        if(tempStack.size()!=0){
            answer=false;
        }
        

        return answer;
    }
}