import java.io.*;
import java.util.*;
 
public class A_Exam {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));
 
        int n = sc.nextInt();
        if (n <= 3) {
            out.println(n != 1 ? n - 1 : n);
            for (int i = 0; i <= n; i++)
                if (i % 2 != 0)
                    out.print(i + " ");
        } else {
            out.println(n);
            if (n % 2 != 0) {
                for (int i = (n / 2) + 1, j = 1; i <= n && j <= (n / 2); i++, j++) {
                    out.print(i + " " + j + " ");
                    if (j == n / 2)
                        out.println(i + 1);
                }
            } else {
                for (int i = n / 2 + 1, j = 1; i <= n && j <= n / 2; i++, j++)
                    out.print(i + " " + j + " ");
            }
 
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