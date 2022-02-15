package PP_LV2.PP_JadenCase문자열만들기;

public class Solution {
    public String solution(String s) {
        String answer = "";
        s.toLowerCase();
        String[]strArr=s.split("");
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<strArr.length;i++){
            if(i==0||(i>0&&strArr[i-1]==" " ) {
                if(strArr[i].charAt(0)>'a'&&strArr[i].charAt(0)<'z'){
                    sb.append(strArr[i].toUpperCase());
                }
            }
        }

        
       
        return answer;
    }
}
