package PP_LV2.PP_양궁대회;

import java.util.*;

public class Solution {
    static int arrowLimit;
    static int[] apeachInfo;
    static int apeachPoint;

    public int[] solution(int n, int[] info) {
        arrowLimit=n;
        apeachInfo=info;
        int[] answer;
        int arrowCnt =0;
        ArrayList<Integer> ryanInfo = new ArrayList<>();

        for(int i=0;i<info.length;i++){
            apeachPoint+=info[i];
        }

        ryanInfo=findingWay(arrowCnt,10,0,ryanInfo);
        if(ryanInfo.contains(-1)){
            answer=new int[1];
            answer[0]=-1;
        }else{
            answer=new int[n];
            for(int i=0;i<n;i++){
                if(ryanInfo.size()-1<=i){
                    answer[i]=ryanInfo.get(i);
                }else{
                    answer[i]=0;
                }
            }
        }
        return answer;
    }
    
    ArrayList<Integer> findingWay (int arrowCnt, int currentPoint, int pointSum, ArrayList<Integer> info){
        ArrayList<Integer> noShot = new ArrayList<>();
        ArrayList<Integer> shot = new ArrayList<>();
        
        
        if(arrowLimit-arrowCnt >0 && arrowLimit-arrowCnt>apeachInfo[10-currentPoint]){
            //현재 점수에서 쏘는 경우
            arrowCnt += apeachInfo[10 - currentPoint] + 1;
            pointSum += currentPoint;
            info.add(apeachInfo[10-currentPoint]+1);
            if(arrowLimit -arrowCnt ==0 || currentPoint-1 ==0){
               // 현재 점수에서 쏘고 못 넘어가는 경우
               if(pointSum>apeachPoint){
                   shot=info;
               }else{
                   shot.add(-1);
               }
            }else if ( arrowLimit -arrowCnt>0 && currentPoint-1>0){
                //현재 점수에서 쏘고 넘어가는 경우
                shot = findingWay(arrowCnt, currentPoint-1, pointSum, info);
            }
        }else if (arrowLimit -arrowCnt<=apeachInfo[10-currentPoint]){
            //현재 점수에서 안쏘는 경우
            if(arrowLimit-arrowCnt>0&&currentPoint-1>0){
                //안쏘고 다음으로 넘어가는 경우
                info.add(0);
                noShot=findingWay(arrowCnt, currentPoint-1, pointSum, info);
            }else if (currentPoint-1==0){
                //안쏘고 다음으로 못 넘어가는 경우
                if(pointSum>apeachPoint){
                    info.add(arrowLimit-arrowCnt);
                    noShot=info;
                }else{
                    noShot.add(-1);
                }
            }

        }

        if((shot.contains(-1)&&noShot.contains(-1))||(!shot.contains(-1)&&noShot.contains(-1))||(shot.size()>noShot.size())){
            return shot;
        }else  {
            return noShot;
        }




        
        
        
    }
}
