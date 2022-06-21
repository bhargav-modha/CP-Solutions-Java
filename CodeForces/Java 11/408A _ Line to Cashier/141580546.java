import java.io.*;
import java.util.*;
 
public class A_Line_to_Cashier {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));
 
        int cashier = sc.nextInt(), min = Integer.MAX_VALUE;
        int people[] = new int[cashier];
        for (int i = 0; i < cashier; i++)
            people[i] = sc.nextInt();
 
        for (int i = 0; i < cashier; i++) {
            int sum = 0;
            for (int j = 0; j < people[i]; j++)
                sum += sc.nextInt() * 5;
 
            sum += 15 * people[i];
            min = min(min, sum);
        }
        out.println(min);
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
 
    static int min(int a, int b) {
        return a < b ? a : b;
    }
}