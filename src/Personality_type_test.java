import java.util.*;

public class Personality_type_test {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        int[] check = {0,0,0,0};

        for(int i=0;i<survey.length;i++){
            switch (survey[i]){
                case "RT":
                    check[0] += checkPoint(choices[i]);
                    break;
                case "TR":
                    check[0] -= checkPoint(choices[i]);
                    break;
                case "CF":
                    check[1] += checkPoint(choices[i]);
                    break;
                case "FC":
                    check[1] -= checkPoint(choices[i]);
                    break;
                case "JM":
                    check[2] += checkPoint(choices[i]);
                    break;
                case "MJ":
                    check[2] -= checkPoint(choices[i]);
                    break;
                case "AN":
                    check[3] += checkPoint(choices[i]);
                    break;
                case "NA":
                    check[3] -= checkPoint(choices[i]);
                    break;
            }
        }

        int j = 0;
        switch(j){
            case 0:
                if(check[0] >= 0){
                    answer += "R";
                }else{
                    answer += "T";
                }
            case 1:
                if(check[0] >= 0){
                    answer += "C";
                }else{
                    answer += "F";
                }
            case 2:
                if(check[0] >= 0){
                    answer += "J";
                }else{
                    answer += "M";
                }
            case 3:
                if(check[0] >= 0){
                    answer += "A";
                }else{
                    answer += "N";
                }
                break;
        }

        return answer;
    }
    public int checkPoint(int num){
        switch(num){
            case 1:
                num = -3;
                break;
            case 2:
                num = -2;
                break;
            case 3:
                num = -1;
                break;
            case 4:
                num = 0;
                break;
            case 5:
                num = 1;
                break;
            case 6:
                num = 2;
                break;
            case 7:
                num = 3;
                break;
        }
        return num;
    }
    public static void main(String[] args) {
        Personality_type_test sol = new Personality_type_test();
        String[] survey = {"AN", "CF", "MJ", "RT", "NA"};
        int[] choice = {5, 3, 2, 7, 5};
        System.out.print(sol.solution(survey, choice));
    }
}
