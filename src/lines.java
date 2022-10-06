import java.util.*;

public class lines {
    public int solution(int[][] lines) {
        int answer = 0;
        List<int[]> areas = new ArrayList<>();
        Set<Integer> check = new HashSet<>();

        for (int i = 0; i < 2; i++) {
            for (int j = i+1; j < 3; j++) {
                int x1;
                int x2;
                int[] area = new int[2];
                if (lines[i][0] >= lines[j][0] && lines[i][1] <= lines[j][1]){
                    x1 = lines[i][0];
                    x2 = lines[i][1];
                    area[0] = x1;
                    area[1] = x2;
                    if (x1 < x2){
                        areas.add(area);
                    }
                    continue;
                }
                if(lines[i][0] <= lines[j][0] && lines[i][1] >= lines[j][1]){
                    x1 = lines[j][0];
                    x2 = lines[j][1];
                    area[0] = x1;
                    area[1] = x2;
                    if (x1 < x2){
                        areas.add(area);
                    }
                    continue;
                }
                if(lines[i][0] >= lines[j][0] && lines[i][1] >= lines[j][1]){
                    x1 = lines[i][0];
                    x2 = lines[j][1];
                    area[0] = x1;
                    area[1] = x2;
                    if (x1 < x2){
                        areas.add(area);
                    }
                    continue;
                }
                if(lines[i][0] <= lines[j][0] && lines[i][1] <= lines[j][1]){
                    x1 = lines[j][0];
                    x2 = lines[i][1];
                    area[0] = x1;
                    area[1] = x2;
                    if (x1 < x2){
                        areas.add(area);
                    }
                }
            }
        }
        if (areas.size() >= 1) {
            for (int[] area : areas) {
                for (int i = area[0]; i <= area[1]; i++) {
                    check.add(i);
                }
            }
            answer = check.size()-1;
        }
        return answer;
    }

    public static void main(String[] args) {
        lines sol = new lines();
        int[][] lines =  {{0,5},{3,9},{1,10}};
        System.out.print(sol.solution(lines));
    }
}
