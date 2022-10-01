import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 대소문자 변환
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String output = "";

        for (int i = 0; i < str.length(); i++) {
            if ((65 <= str.charAt(i)) && str.charAt(i) <= 90) {
                output += str.toLowerCase().charAt(i);
            } else if (97 <= str.charAt(i) && str.charAt(i) <= 122) {
                output += str.toUpperCase().charAt(i);
            } else {
                output += str.charAt(i);
            }
        }
        System.out.println(output);
    }
}
