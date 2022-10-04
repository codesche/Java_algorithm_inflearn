import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String tmp = new StringBuilder(str).reverse().toString();

        // 대소문자 구분없이 비교
        if (str.equalsIgnoreCase(tmp)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
