import java.util.Objects;

public class babbling {
    public int solution(String[] babbling) {
        int answer = 0;

        for(String bab : babbling){
            bab = bab.replace("aya","1");
            bab = bab.replace("ye","2");
            bab = bab.replace("woo","3");
            bab = bab.replace("ma","4");

            if (bab.matches("[1-4]+")){
                for (int i = 0; i < bab.length()-1; i++) {
                    if (bab.charAt(i) == bab.charAt(i+1)){
                        answer--;
                        break;
                    }
                }
                answer ++;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        babbling sol = new babbling();
        String[] babbling = {"ayayea", "uuu", "yewooayaye", "yemawoo", "ayaayaa"};
        System.out.print(sol.solution(babbling));
    }
}
