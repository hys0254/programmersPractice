package PP_LV1.PP_caesarPassword;

import java.util.ArrayList;

public class Solution {
    public String solution(String s, int n) {
        String answer = "";
        String[] pwArr = s.split("");
        
        for(int i=0;i<pwArr.length;i++){
            int ichar=(int)pwArr[i].charAt(0);
            if(ichar==32){
                answer+=" ";
            }else if(ichar<=122 &&ichar>=97){
                if(ichar+n>122){
                    answer+= (char)(ichar+n-122+96);
                }else{
                answer+= (char)(ichar+n);
                }
            }else{
                if(ichar+n>90){
                    answer+= (char)(ichar+n-90+64);
                }else{
                answer+= (char)(ichar+n);
                }
            }
        }

        return answer;
    }
}
//a =97
//z =122
//A=65
//Z=90