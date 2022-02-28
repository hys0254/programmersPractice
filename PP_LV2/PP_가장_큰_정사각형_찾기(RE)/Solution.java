package PP_LV2.PP_가장_큰_정사각형_찾기;

class Solution {
    static int maxLength = 0;

    public int solution(int[][] board) {
        int answer = 1234;
        maxLength = Math.min(board.length, board[0].length);
        Boolean flag = false;
        while (!flag) {
            
            if(maxLength<0) break;
            for (int i = 0; i < board.length - maxLength; i++) {
                for (int j = 0; j < board[0].length - maxLength; j++) {

                    flag = isPossible(i, j, board);
                    if (flag) {
                        return maxLength * maxLength;
                    }

                }

            }
            maxLength--;
        }

        answer = maxLength * maxLength;
        return answer;

    }

    public Boolean isPossible(int row, int column, int[][] board) {

        for (int i = row; i <= row + maxLength; i++) {

            for (int j = column; j <= column + maxLength; j++) {

                if (board[i][j] == 0) {
                    return false;
                }
            }
        }

        return true;
    }
}
