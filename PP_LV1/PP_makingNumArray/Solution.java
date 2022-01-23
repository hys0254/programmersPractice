package PP_LV1.PP_makingNumArray;

public class Solution {
    static public int[] solution(long n) {
        String temp=Long.toString(n);
       
        int[] answer = new int[temp.length()];
        for(int i =temp.length()-1; i>=0;--i){
            
            
            answer[i-temp.length()-1]=temp.charAt(i)-'0';
           
        }
        return answer;
    }
 
}
