package PP_LV1.PP_divisor;
import java.util.*;
public class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        ArrayList<Integer> intArr = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]%divisor==0){
            intArr.add(arr[i]);
            }
        }
        if(intArr.size()==0){
            intArr.add(-1);
        }
        Collections.sort(intArr);
        answer =new int[intArr.size()];
        for(int i =0; i<intArr.size();i++){
            answer[i]=intArr.get(i);
        }
        return answer;
    }
}
