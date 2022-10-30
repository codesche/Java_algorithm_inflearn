import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();
        char[] ch = str.toCharArray();

        for (int i = 0; i < N; i++) {
            ch[i] = str.charAt(i);
        }

        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;

        for (int i = 0; i < N; i++) {
            switch (ch[i]) {
                case 'A':
                    a++;
                    break;

                case 'B':
                    b++;
                    break;

                case 'C':
                    c++;
                    break;

                case 'D':
                    d++;
                    break;

                case 'E':
                    e++;
                    break;
            }
        }

        HashMap<Character, Integer> map = new HashMap<>();
        map.put('A', a);
        map.put('B', b);
        map.put('C', c);
        map.put('D', d);
        map.put('E', e);

        int maxValue = 0;
        char answer_key = ' ';
        
        // 최대값의 key 반환하기 위해 Map.Entry 사용
        for (Map.Entry<Character, Integer> pair : map.entrySet()) {
            if (maxValue < pair.getValue()) {
                maxValue = pair.getValue();
                answer_key = pair.getKey();
            }
        }
        System.out.println(answer_key);
    }
}
