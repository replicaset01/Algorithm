package Codeup;

import java.io.*;

public class Codeup84 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] num = br.readLine().split(" ");

        int r = Integer.parseInt(num[0]);
        int g = Integer.parseInt(num[1]);
        int b = Integer.parseInt(num[2]);
        int c = 0;

        for (int i=0; i<r; i++) {
            for (int j=0; j<g; j++) {
                for (int k=0; k<b; k++) {
                    bw.write(String.format("%d, %d, %d", i, j, k));
                    bw.newLine();
                    c++;
                }
            }
        }
        bw.write(String.format("%d", c));
        br.close();
        bw.close();
    }
}
