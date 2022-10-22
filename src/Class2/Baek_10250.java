package Class2;
/* 10250 ACM 호텔 */
import java.io.*;
import java.util.StringTokenizer;

public class Baek_10250 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine()); // 테스트 케이스 개수

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken()); // n번째 손님
            int y; // 층에 해당하는 결과값을 넣을 변수
            int x; // 호에 해당하는 결과값을 넣을 변수
            int result; // 결과값
            /*
            층수 = n번째손님 % 건물의 총 총수
            호수 = n번째손님 / 층수
             */
            if (n % h == 0) {
            // 층수 = n%h==0 <- 꼭대기 층에 있으므로 층변화 X
                    y = h * 100;
            // 호수 = n번째 손님 / 층수
                    x = n / h;
            } else {
            //  층수 = n번째손님 % 건물의 총 층수
                    y = (n % h) * 100;
            // 층은 1층부터 시작하므로 +1
                    x = (n / h) + 1;
            }
            result = x + y;
            bw.write(String.valueOf(result)+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}