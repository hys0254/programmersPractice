package PP_LV1.PP_KthNum;

import java.util.Arrays;

public class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for (int i = 0; i < commands.length; i++) {
           
            int[] intArr = new int[commands[i][1] - commands[i][0] + 1];
            for (int j = commands[i][0] - 1; j <= commands[i][1] - 1; j++) {
                intArr[j - (commands[i][0] - 1)] = array[j];
            }
            Arrays.sort(intArr);
            answer[i] = intArr[commands[i][2] - 1];
        }
        return answer;
    }
}
