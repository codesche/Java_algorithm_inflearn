import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        String T = br.readLine();

        HashMap<Character, Integer> count = new HashMap();
        HashMap<Character, Integer> countTmp = new HashMap();

        int result = 0;
        int left = 0;
        int Len = T.length() - 1;

        for (char x : T.toCharArray()) {
            countTmp.put(x, countTmp.getOrDefault(x, 0) + 1);
        }

        for (int i = 0; i < Len; i++) {
            count.put(S.charAt(i), count.getOrDefault(S.charAt(i), 0) + 1);
        }

        for (int right = Len; right < S.length(); right++) {
            count.put(S.charAt(right), count.getOrDefault(S.charAt(right), 0) + 1);

            if (count.equals(countTmp)) {
                result++;
            }
            count.put(S.charAt(left), count.get(S.charAt(left)) - 1);
            if (count.get(S.charAt(left)) == 0) {
                count.remove(S.charAt(left));
            }
            left++;
        }
        System.out.println(result);
    }
}
