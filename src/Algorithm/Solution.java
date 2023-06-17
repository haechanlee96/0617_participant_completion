package Algorithm;
import java.util.*;

class Solution {
    boolean solution(String s) {

        boolean answer = true;
        char[] charArr = s.toCharArray();

        System.out.println(charArr[5]);

        return answer;

    }
}
class Main{
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "pPoooyY";

        System.out.println(solution.solution(s));

    }
}

