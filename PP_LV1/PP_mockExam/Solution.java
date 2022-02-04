package PP_LV1.PP_mockExam;

import java.util.ArrayList;

public class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int[] supoja1Ans = { 5, 1, 2, 3, 4 };
        int[] supoja2Ans = { 5, 2, 1, 2, 3, 2, 4, 2 };
        int[] supoja3Ans = { 5, 3, 3, 1, 1, 2, 2, 4, 4, 5 };
        int[] supoja = { 0, 0, 0 };
        for (int i = 1; i <= answers.length; i++) {

            if (supoja1Ans[i % 5] == answers[i - 1]) {

                supoja[0] += 1;
            }
            if (supoja2Ans[i % 8] == answers[i - 1]) {
                supoja[1] += 1;
            }
            if (supoja3Ans[i % 10] == answers[i - 1]) {
                supoja[2] += 1;
            }
        }

        int max = Math.max(supoja[2], Math.max(supoja[0], supoja[1]));

        ArrayList<Integer> arList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            if (max == supoja[i]) {

                arList.add(i + 1);
            }
        }

        answer = new int[arList.size()];
        for (int i = 0; i < arList.size(); i++) {
            answer[i] = arList.get(i);
        }
        return answer;
    }
}
