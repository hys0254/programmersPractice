package PP_LV1.PP_minRectangle;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public int solution(int[][] sizes) {

        int answer = 0;
        boolean found = true;
        int maxWidth = 0;
        int maxVertical = 0;
        int pastMinSize=0;
        for(int i=0;i<sizes.length;i++){
            if(sizes[i][1]>sizes[i][0]){
                int temp;
                temp=sizes[i][0];
                sizes[i][0]=sizes[i][1];
                sizes[i][1]=temp;
            }
        }
        for(int i=0;i<sizes.length;i++){
            if (maxWidth < sizes[i][0])
            maxWidth = sizes[i][0];
            if (maxVertical < sizes[i][1])
            maxVertical = sizes[i][1];
        }
        answer=maxWidth*maxVertical;
        return answer;

    // int answer = 0;
    // int maxWidth = 0;
    // int maxVertical = 0;
    // int minSize = Integer.MAX_VALUE;
    // for (int i = 0; i <= sizes.length; i++) {
    // if (i != sizes.length) {
    // int temp = sizes[i][0];
    // sizes[i][0] = sizes[i][1];
    // sizes[i][1] = temp;
    // }
    // for (int j = 0; j < sizes.length; j++) {
    // if (maxWidth < sizes[j][0])
    // maxWidth = sizes[j][0];
    // if (maxVertical < sizes[j][1])
    // maxVertical = sizes[j][1];
    // }
    // if (minSize > maxWidth * maxVertical) {
    // minSize = maxVertical * maxVertical;
    // }
    // if (i != sizes.length) {
    // int temp = sizes[i][0];
    // sizes[i][0] = sizes[i][1];
    // sizes[i][1] = temp;
    // }
    // }
    // answer=minSize;
    // return answer;
}}
