import java.io.*;
import java.util.*;
 
public class A_Most_Unstable_Array {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));
 
        long t = sc.nextLong();
        while(t-->0)
        {
            long n = sc.nextLong();
            long m = sc.nextLong();
 
            if(n == 1)
                out.println(0);
            else if(n == 2)
                out.println(m);
            else
                out.println(m*2);
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
            for (int i = 0; i < n; i++) a[i] = nextInt();
            return a;
        }
        long[] readLongArray(int n) {
            long a[] = new long[n];
            for (int i = 0; i < n; i++) a[i] = nextLong();
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
    static int abs(int a) {
        return a > 0 ? a : -a;
    }
    
}