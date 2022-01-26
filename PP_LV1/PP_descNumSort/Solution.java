package PP_LV1.PP_descNumSort;

import java.util.Arrays;
import java.util.Collections;
import java.util.Arrays;

public class Solution {
    public long solution(long n) {
        long answer = 0;
        String temp=Long.toString(n);
        Integer numArray[] =new Integer[temp.length()];
        for(int i =0;i<temp.length();i++){
            numArray[i]=temp.charAt(i)-'0';
        }
        Arrays.sort(numArray,Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();
        for(int i =0; i<temp.length();i++){
            sb.append(numArray[i]);
        }
        answer=Long.parseLong(sb.toString());
        return answer;
    }
}
// long long solution(long long n) {
//     long long answer = 0;
//     string str = to_string(n);
//     sort(str.begin(), str.end(), greater<char>());
//     answer = stoll(str);
//     return answer;
// }