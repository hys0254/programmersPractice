package PP_LV1.PP_sortingMyway;
import java.util.*;

public class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = {};
        ArrayList<String> strArr = new ArrayList<>(Arrays.asList(strings));
        Collections.sort(strArr, new StringComparator(n));
        answer=strArr.toArray(new String[strArr.size()]);
        return answer;
    }
}
class StringComparator implements Comparator<String>{
    int pos;
    public StringComparator(int n) {
        this.pos=n;
    }
    @Override
    public int compare(String o1, String o2) {
         if(o1.charAt(pos)>o2.charAt(pos)){
            return 1;
        }else if(o1.charAt(pos)<o2.charAt(pos)){
            return -1;
        }else if(o1.charAt(pos)==o2.charAt(pos)){
           return o1.compareTo(o2);
        }
        return 0;
    }

}