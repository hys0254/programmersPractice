package PP_LV2.PP_최댓값과_최솟값;
import java.util.*;
public class Solution {
    public String solution(String s) {
        String answer = "";
        String[] strArr = s.split(" ");
        ArrayList<Integer> intAl = new ArrayList<>();
        for(String str : strArr){
            intAl.add(Integer.parseInt(str));
        }
        Collections.sort(intAl);
        return answer;
    }
}
