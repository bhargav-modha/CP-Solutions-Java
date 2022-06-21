import java.io.*;
import java.util.*;
 
public class A_Collecting_Coins {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));
 
        int t = sc.nextInt();
        while(t-->0)
        {
            int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
            int poly = sc.nextInt();
 
            int max = max(a,b,c);
            
            poly -= ((max-a) + (max-b) + (max-c));
 
            if(poly < 0 || poly%3 != 0)
                out.println("NO");
            else if(poly%3 == 0)
                out.println("YES");
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
    static int max(int a, int b, int c) {
        return a > b ? (a > c ? a : c) : (b > c ? b : c);       
    }
}