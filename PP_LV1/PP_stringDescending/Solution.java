package PP_LV1.PP_stringDescending;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public String solution(String s) {
        String answer = "";
        char[] chArr= s.split("");
        ArrayList<Character> strArr = new ArrayList();
        Collections.sort(strArr);
        Collections.reverse(strArr);
        StringBuilder sb =new StringBuilder();
        for(Character ch : strArr){
            sb.append(ch);
        }
        answer=sb.toString();
        return answer;
    }
}
