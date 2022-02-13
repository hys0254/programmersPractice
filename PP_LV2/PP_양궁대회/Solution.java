package PP_LV2.PP_양궁대회;

import java.util.*;

public class Solution {
   // 최대 사용가능 화살수
   static int arrowLimit;
   // 어피치 적중 정보
   static int[] apeachInfo;
   // 최적의 라이언 적중 정보
   static int[] bestRyanInfo = new int[11];
   // 최적의 경우의 점수차(최고 점수 차)
   static int scoreDiff = Integer.MIN_VALUE;
   // 라이언이 이기는 경우가 있는지 없는지
   static boolean isPossible = false;

   public int[] solution(int n, int[] info) {
       // 라이언 적중 정보(임시)
       int[] tempRyanInfo = new int[11];
       int[] answer;
       arrowLimit = n;
       apeachInfo = info;
       findingRoute(tempRyanInfo, 10, 0, 0, 0);
       // 라이언이 이기는 경우가 있으면
       if (isPossible) {
           answer = bestRyanInfo;
       } else {
           answer = new int[1];
           answer[0] = -1;
       }

       return answer;
   }

   // 라이언 적중 정보, 현재 검색할 점수, 현재까지 쏜 화살 갯수
   void findingRoute(int[] ryanInfo, int currentPoint, int arrowCnt, int ryanPoint, int apeachPoint) {
       // currentPoint가 0점일때(어피치 점수는 0점까지 확인 후 알 수 있음 완전탐색)
       if (currentPoint == 0) {
           
           // 화살이 남아있으면 모두 소진
           if (arrowLimit - arrowCnt > 0) {
               ryanInfo[10 - currentPoint] = arrowLimit - arrowCnt;
               arrowCnt=arrowLimit;
           }else{
               ryanInfo[10-currentPoint]=0;
           }
           // 라이언 점수가 어피치 점수보다 크고
           if (ryanPoint > apeachPoint) {
               isPossible = true;
               int tempDiff = ryanPoint - apeachPoint;
               // 현재 케이스가 기존 케이스들보다 점수차가 크거나 같을때
               if (tempDiff >= scoreDiff) {
                   // 만약 점수차가 같으면
                   if (tempDiff == scoreDiff) {
                       // 0점부터 화살수가 더 많은 경우를 확인 현재 라이언 정보가
                       // 낮은점수에서 맞춘 화살수가 더 적으면 아무것도 하지 않고 이전단계로 돌아감
                       if (!isChangeable(ryanInfo)) {
                           return;
                       }
                   }
                   // 만약 0점부터 화살수를 비교하여 더 적은 점수에서 맞춘 화살수가 많으면
                   // 또 라이언과 어피치 점수차가 더 큰 경우 현재의 정보로 최고경우와 점수차를 교체

                    bestRyanInfo=ryanInfo.clone();
                   scoreDiff = tempDiff;
               }
           }

           return;
       }
       // currentPoint가 0점이 아닐때
       // 화살을 쏘지 않는 경우(어피치를 이길수 있으나 그냥 안쏨, 화살이 없음, 어피치를 이길만큼 충분한 화살이 없음)
       // 어피치가 한발이라도 쐈을 경우 어피치 점수 증가
       if (apeachInfo[10 - currentPoint] > 0) {
           apeachPoint += currentPoint;
       }
       ryanInfo[10 - currentPoint] = 0;
       findingRoute(ryanInfo, currentPoint - 1, arrowCnt, ryanPoint, apeachPoint);

       // 화살을 쏘는 경우(어피치를 이길만큼 충분한 화살이 있음)
       // 가지고 있는 화살이 어피치가 맞춘 화살수보다 많을 경우에만 쏨
       if (arrowLimit - arrowCnt > apeachInfo[10 - currentPoint]) {

           if (apeachInfo[10 - currentPoint] > 0) {
               apeachPoint -= currentPoint;
           }
           // 어피치보다 1발만 더 쏘면 점수를 가져감
           ryanInfo[10 - currentPoint] = apeachInfo[10 - currentPoint] + 1;
           int nextRyanPoint= ryanPoint+currentPoint;
           int nextArrowCnt = arrowCnt+apeachInfo[10-currentPoint]+1;
           
           findingRoute(ryanInfo, currentPoint - 1, nextArrowCnt, nextRyanPoint, apeachPoint);
       }
       
       return;

   }

   boolean isChangeable(int[] tempInfo) {
       for (int i = 10; i >= 0; i--) {
           if (tempInfo[i] > bestRyanInfo[i]) {
               return true;
           } else if (tempInfo[i] < bestRyanInfo[i]) {
               return false;
           }
       }
       return true;
   }

}
