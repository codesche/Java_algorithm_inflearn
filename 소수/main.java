// 에라토스테네스의 체
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;

        int N = Integer.parseInt(br.readLine());

        ArrayList<Boolean> primeList = new ArrayList<>(N + 1);

        // 0, 1은 소수
        primeList.add(false);
        primeList.add(false);

        // 2 ~ n까지 소수로 설정
        for (int i = 2; i <= N; i++) {
            primeList.add(i, true);
        }

        /*
            2부터 i * i <= n 까지는
            각각의 배수를 나타내므로 지워줌
         */
        for (int i = 2; (i * i) <= N; i++) {
            if (primeList.get(i)) {
                for (int j = i * i; j <= N; j += i) {
                    primeList.set(j, false);
                }
            }
        }

        for (int i = 0; i <= N; i++) {
            if (primeList.get(i)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
