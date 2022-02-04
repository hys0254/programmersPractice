package PP_LV1.PP_ternaryFlip;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String ternary="";
        while(n>0){
            ternary=n%3+ternary;
            n=n/3;
        }
        StringBuilder sb =new StringBuilder(ternary);
        ternary=sb.reverse().toString();
        for(int i=ternary.length()-1;i>0;i--){
            int temp=ternary.charAt(i)-'0';
            answer=answer+temp*((int)Math.pow(3, i));
        }
        
        return answer;
    }
}
