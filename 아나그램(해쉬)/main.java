// 해쉬 안 쓰고 순차정렬 후 equal 메소드 사용해서 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str1 = br.readLine();
        String str2 = br.readLine();

        String result_str1 = " ";
        String result_str2 = " ";

        char[] ch1 = str1.toCharArray();
        for (int i = 0; i < ch1.length; i++) {
            ch1[i] = str1.charAt(i);
        }

        Arrays.sort(ch1);
        for (int i = 0; i < ch1.length; i++) {
            result_str1 += String.valueOf(ch1[i]);
        }

        char[] ch2 = str2.toCharArray();
        for (int i = 0; i < ch2.length; i++) {
            ch2[i] = str2.charAt(i);
        }

        Arrays.sort(ch2);
        for (int i = 0; i < ch1.length; i++) {
            result_str2 += String.valueOf(ch2[i]);
        }

        if (result_str1.equals(result_str2)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
