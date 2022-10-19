package Class2;

/* 2798 블랙잭 */

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baek_2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 첫번째 Tokenizer 객체 = 첫번째 줄의 입력을 받음
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        // 카드의 개수 n
        int n = Integer.parseInt(st.nextToken());
        // 최대값 m
        int m = Integer.parseInt(st.nextToken());
        // 들고 있는 카드의 개수를 배열로 선언
        int[] card = new int[n];
        // 2번째 Tokenizer 객체 = 카드의 숫자를 담음
        st = new StringTokenizer(br.readLine(), " ");
        // 카드 3장의 숫자 합계
        int max = 0;
        // 입력받은 카드숫자를 카드 수만큼 배열의 요소에 넣기
        for (int i=0; i<n; i++) {
            card[i] = Integer.parseInt(st.nextToken());
        }
        // 배열 오름차순 정렬
        Arrays.sort(card);
        // 정렬된 배열에서 3번째로 큰수
        for (int i=0; i<card.length-2; i++) {
            // 정렬된 배열에서 2번째로 큰수
            for (int j=i+1; j<card.length-1; j++) {
                // 정렬된 배열에서 1번째로 큰수
                for (int k=j+1; k<card.length; k++) {
                    int sum=0;
                    // 3개의 요소를 순회하면서 더함
                    sum = sum+ card[i] + card[j] + card[k];
                    // 3개 값을 더한 합이 m에 가까워질때까지 3개의 i,j,k 요소들을 합함
                    if (sum <= m) {
                        // max,sum중 더 큰값을 max 변수에 저장
                        max = Math.max(max, sum);
                    }
                }
            }
        }
        bw.write(String.valueOf(max));
        br.close();
        bw.flush();
        bw.close();
    }
}