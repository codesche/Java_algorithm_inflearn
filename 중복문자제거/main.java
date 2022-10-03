import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 중복 문자 제거
public class Main {
    public static String solution (String str) {
        String answer = "";

        for (int i = 0; i < str.length(); i++) {
//            System.out.println(str.charAt(i) + " " + i + " " + str.indexOf(str.charAt(i)));
          // 첫 문자의 인덱스와 i가 같은 경우
            if (str.indexOf(str.charAt(i)) == i) {
                answer += str.charAt(i);
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str_input = br.readLine();

        System.out.print(solution(str_input));
    }
}
