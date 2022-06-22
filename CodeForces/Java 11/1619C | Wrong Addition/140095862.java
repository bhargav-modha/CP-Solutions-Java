import java.io.*;
import java.util.*;
 
public class C_Wrong_Addition {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));
 
        int t = sc.nextInt();
        while (t-- > 0) {
            String[] st = sc.nextLine().split(" ");
            long a = Long.parseLong(st[0]);
            long s = Long.parseLong(st[1]);
            long ans = 0L;
            long pow = 1L;
            boolean flag = true;
 
            while (a > 0L && s > 0L) {
                long d1 = a % 10;
                long d2 = s % 10;
                if (d2 < d1) {
                    d2 = s % 100;
                    s = s / 100;
                } else {
                    s = s / 10;
                }
                a = a / 10;
                if ((d2 < d1) || (d2 - d1 > 9L) || (d2 == 0L && d1 != 0L) || d2 > 18L) {
                    flag = false;
                    break;
                }
                ans = (d2 - d1) * pow + ans;
                pow *= 10L;
            }
            if (s > 0L) {
                ans = s * pow + ans;
            }
            if (a > 0L || !flag) {
                out.println(-1);
            } else
                out.println(ans);
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