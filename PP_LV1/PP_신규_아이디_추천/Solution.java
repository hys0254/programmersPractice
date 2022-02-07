package PP_LV1.PP_신규_아이디_추천;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public String solution(String new_id) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        new_id = new_id.toLowerCase();
        char[] new_id_Arr = new_id.toCharArray();
        for (char c : new_id_Arr) {
            if ((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9') || c == '-' || c == '_' || c == '.') {
                sb.append(c);
            }
        }

        int answerLength = 0;
        new_id =sb.toString();
        answer += new_id.charAt(0);
        for (int i = 1; i < new_id.length(); i++) {
            if (new_id.charAt(i) == '.' && answer.charAt(answerLength) == '.') {
                continue;
            }
            answer = answer + new_id.charAt(i) + "";
            answerLength++;
        }

        if(answer.length()>0&&answer.charAt(0)=='.'){
            answer=answer.substring(1, answer.length());
        }

        if (answer.length()>0&&answer.charAt(answer.length()-1)=='.') {
            answer =answer.substring(0, answer.length()-1);
        }

        if(answer.length()==0){
            answer="a";
        }

        if (answer.length() >= 16) {
            answer = answer.substring(0, 15);
        }

        if (answer.charAt(answer.length() - 1) == '.') {
            answer = answer.substring(0, answer.length() - 1);
        }
        if (answer.length() <= 2) {

            while (!(answer.length() == 3)) {
                answer = answer + answer.charAt(answer.length() - 1);
            }
        }

        return answer;
    }
}
