import java.util.ArrayList;
import java.util.List;

public class dots {
    public int solution(int[][] dots) {
        int answer = 0;
        List<Double> check = new ArrayList<>();

        for (int i = 0; i < dots.length-1; i++) {
            for (int j = i+1; j < dots.length; j++) {
                double x = Math.abs(dots[i][0]-dots[j][0]);
                double y = Math.abs(dots[i][1]-dots[j][1]);

                if(x==0 && y!=0){
                    check.add((double) 0);
                    continue;
                }
                if(x!=0 && y==0){
                    check.add((double) -1);
                    continue;
                }

                check.add(x/y);

            }
        }
        System.out.println(check);
        for (int i = 0; i < check.size()-1; i++) {
            for (int j = i+1; j < check.size(); j++) {
                if (check.get(i).equals(check.get(j))){
                    System.out.println(check.get(i));
                    return answer = 1;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        dots sol = new dots();
        int[][] dots = {{3,5},{4,1},{2,4},{5,10}};
        System.out.print(sol.solution(dots));
    }
}
