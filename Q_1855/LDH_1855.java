package BOJ_1855;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int col = Integer.parseInt(br.readLine());
        String str = br.readLine();

        String[] a = str.split("");
        int row = str.length() / col;
        StringBuilder sb = new StringBuilder();

        String[][] s = new String[row][col];
     

        for (int i = 0; i < row; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < col; j++) {
                    s[i][j] = a[i * col + j];
                }
            } else {
                for (int j = col - 1; j >= 0; j--) {
                    s[i][col - 1 - j] = a[i * col + j];
                }
            }
        }

        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.println(s[j][i]);
            }
        }

        System.out.println(sb);

}
