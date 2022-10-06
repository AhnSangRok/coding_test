import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class caracter_location {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0,0};

        for (String key : keyinput){
            switch (key){
                case "right":
                    answer[0]++;
                    if (board[0]/2 < Math.abs(answer[0])){
                        answer[0]--;
                    }
                    break;
                case "left":
                    answer[0]--;
                    if (board[0]/2 < Math.abs(answer[0])){
                        answer[0]++;
                    }
                    break;
                case "up":
                    answer[1]++;
                    if (board[1]/2 < Math.abs(answer[1])){
                        answer[1]--;
                    }
                    break;
                case "down":
                    answer[1]--;
                    if (board[1]/2 < Math.abs(answer[1])){
                        answer[1]++;
                    }
                    break;
            }
            double num = 7/3*1000;
            int an = (int) num;

        }

        System.out.println(Arrays.toString(answer));
        return answer;
    }

    public static void main(String[] args) {
        caracter_location sol = new caracter_location();
        String[] keyinput = {"left", "right", "up", "right", "right"};
        int[] board = {11, 11};
        System.out.print(sol.solution(keyinput, board));
    }
}
