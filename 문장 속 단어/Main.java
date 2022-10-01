import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public String solution(String str) {
        String answer = "";
        String[] s = str.split(" ");
        int m = Integer.MIN_VALUE;
        
        // 비교
        for (String x : s) {
            if (x.length() > m) {
                m = x.length();
                answer = x;
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        System.out.println(T.solution(str));
    }
}
