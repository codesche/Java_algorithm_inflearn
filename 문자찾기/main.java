
// 문자 찾기
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        int count = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String strA = br.readLine();
        String strB = br.readLine();

        for (int i = 0; i < strA.length(); i++) {
            if (strB.toLowerCase().charAt(0) == strA.charAt(i)) {
                count++;
            } else if (strB.toUpperCase().charAt(0) == strA.charAt(i)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
