import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문자열 역순으로 출력
public class Main {

    public static void Solution(String[] strArray) {

        // StringBuilder 객체 생성
        StringBuilder sb = new StringBuilder();

        // StringBuilder 객체에 String을 추가 - append() 함수 사용
        for (String s: strArray) {
            System.out.println(sb.append(s).reverse());
            sb.delete(0, s.length());     // 초기화
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String[] strArray = new String[N];

        for (int i = 0; i < strArray.length; i++) {
            strArray[i] = br.readLine();
        }
        Solution(strArray);
    }
}
