package PP_LV1.PP_sumBtwTwoInt;

public class solution {
    public long solution(int a, int b) {
        long answer=((long)(a + b) * (Math.abs(a - b) + 1)) / 2;
        //(long)(a+b) long 왜 붙임?
        return answer;
    }
}
