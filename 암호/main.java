
// ch01-12 암호

// 사례
// 1. 보낸 문자의 개수 입력
// 2. #, *, *, *, *, *, # 입력
// 3. 입력한 문자를 2진수로 변환
// 4. 2진수를 십진수로 변환
// 5. 십진수를 아스키코드 문자로 변환


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public String solution(String s, int n) {
        String answer = "";

        for (int i = 0; i < n; i++) {
            String tmp = s.substring(0, 7).replace('#', '1').replace('*', '0');
            int value = Integer.parseInt(tmp, 2);
            char ch = (char)value;
            answer += ch;

            // 이게 핵심
            s = s.substring(7);
        }

        return answer;
    }


    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();

        System.out.print(T.solution(str, n));
    }
}
