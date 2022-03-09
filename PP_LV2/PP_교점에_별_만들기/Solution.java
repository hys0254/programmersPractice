package PP_LV2.PP_교점에_별_만들기;

import java.util.*;
class Solution {
    HashSet<ArrayList<Integer>> point;
    int xMin =Integer.MAX_VALUE;
    int xMax =Integer.MIN_VALUE;
    int yMin =Integer.MAX_VALUE;
    int yMax =Integer.MIN_VALUE;
   

    public String[] solution(int[][] line) {
        
        point = new HashSet<>();
        for(int i=0;i<line.length;i++){
            for(int j=i+1;j<line.length;j++){
                long ADBC = line[i][0]*line[j][1]-line[i][1]*line[j][0];
                if(ADBC==0) continue;
                if((line[i][1]*line[j][2]-line[i][2]*line[j][1])%ADBC!=0||
                (line[i][2]*line[j][0]-line[i][0]*line[j][2])%ADBC!=0) continue;
                ArrayList<Integer> tempPoint = new ArrayList<>();
                int x =(int)((line[i][1]*line[j][2]-line[i][2]*line[j][1])/ADBC);
                int y =(int)((line[i][2]*line[j][0]-line[i][0]*line[j][2])/ADBC);
                if(xMin>x){
                    xMin=x;
                }else if(xMax<x){
                    xMax=x;
                }
                if(yMin>y){
                    yMin=y;
                }else if(yMax<y){
                    yMax=y;
                }
                tempPoint.add(x);
                tempPoint.add(y);
                point.add(tempPoint);
            }
        }
        boolean[][] check = new boolean[xMax-xMin+1][yMax-yMin+1];
        for(ArrayList<Integer> list : point){
            check[list.get(0)-xMin][list.get(1)-yMin]=true;
        }
        String[] answer= new String[check.length];
        for(int i=0;i<check.length;i++){
            String temp ="";
            for(int j=0; j<check[0].length;j++){
                if(check[i][j]) temp+="*";
                else temp+=".";
            }
            answer[i]=temp;
        }
        return answer;
    }
}