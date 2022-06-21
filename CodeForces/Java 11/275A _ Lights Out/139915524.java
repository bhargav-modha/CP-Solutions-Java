import java.io.*;
import java.util.*;
 
public class A_Lights_Out {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));
 
        int inp[][] = new int[3][3];
        int mat[][] = new int[3][3];
 
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                inp[i][j] = sc.nextInt();
 
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (inp[i][j] != 0) {
                    mat[i][j] += inp[i][j];
                    if (i < 2)
                        mat[i + 1][j] += inp[i][j];
                    if (j < 2)
                        mat[i][j + 1] += inp[i][j];
                    if (i > 0)
                        mat[i - 1][j] += inp[i][j];
                    if (j > 0)
                        mat[i][j - 1] += inp[i][j];
                }
            }
        }
 
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (mat[i][j] % 2 == 0) out.print(1);
                else    out.print(0);
            }
            out.println();
        }
        out.close();
    }
 
    public static PrintWriter out;
 
    public static class MyScanner {
 
        BufferedReader br;
        StringTokenizer st;
 
        public MyScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
 
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        int nextInt() {
            return Integer.parseInt(next());
        }
 
        long nextLong() {
            return Long.parseLong(next());
        }
 
        double nextDouble() {
            return Double.parseDouble(next());
        }
 
        int[] readArray(int n) {
            int a[] = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }
 
        long[] readLongArray(int n) {
            long a[] = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = nextLong();
            return a;
        }
 
        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}