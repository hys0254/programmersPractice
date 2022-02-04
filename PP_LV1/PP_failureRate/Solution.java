package PP_LV1.PP_failureRate;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = {};
        double[][] temp = new double[N][2];

        for (int i = 0; i < N; i++) {
            double player = 0;
            double fail = 0;
            for (int j = 0; j < stages.length; j++) {
                if (stages[j] > i + 1) {
                    player += 1;
                } else if (stages[j] == i + 1) {
                    player += 1;
                    fail += 1;
                }

            }
             temp[i][0] = i + 1;
            if(player==0&&fail==0){
                temp[i][1]=0;
                continue;
            }
            temp[i][1] = fail / player;
        }
        
        Arrays.sort(temp, new Comparator<double[]>() {
            @Override
            public int compare(double[] o1, double[] o2) {
                if (o1[1] == o2[1]) {
                    return Double.compare(o1[0] , o2[0]);
                } else {
                    return -Double.compare(o1[1] , o2[1]);
                }
            }

        });
      
        answer = new int[temp.length];
        for (int i = 0; i < temp.length; i++) {
            answer[i] = (int) temp[i][0];
        }

        return answer;
    }
}
