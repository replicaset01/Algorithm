package Class1;

import java.io.*;
import java.util.Objects;

public class Baek_8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        String ox = br.readLine();
        int sum = 0;
        int count = 0;

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < ox.length(); j++) {
                if (ox.charAt(j) == 'O') {
                    count++;
                    sum = sum + count;
                } else {
                    count = 0;
                }
            }
        }
        bw.write(String.valueOf(sum) + "\n");
        br.close();
        bw.flush();
        bw.close();
    }
}
