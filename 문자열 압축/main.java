import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문자열 압축
public class Main {
    public static String solution(String s) {
        String answer = "";
        
        // 비교 위해 비어있는 배열 요소 추가
        s = s + " ";

        int cnt = 1;

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                cnt++;
            } else {
                answer += s.charAt(i);

                if (cnt > 1) {
                    answer += String.valueOf(cnt);
                }
                cnt = 1;
            }
        }
        
        return answer;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        System.out.println(solution(str));
    }
}
