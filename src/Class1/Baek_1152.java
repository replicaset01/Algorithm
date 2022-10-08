package Class1;

/* 단어의 개수 */

import java.io.*;
import java.util.StringTokenizer;

public class Baek_1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int count = st.countTokens();
        bw.write(String.valueOf(count));
    }
}
