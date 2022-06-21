import java.io.*;
import java.util.*;
 
public class A_Lunch_Rush {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));
 
        int no_of_res = sc.nextInt(), k_time = sc.nextInt();
        int f[] = new int[no_of_res], t[] = new int[no_of_res];
 
        for (int i = 0; i < no_of_res; i++) {
            f[i] = sc.nextInt();
            t[i] = sc.nextInt();
 
            if (t[i] > k_time)
                f[i] = f[i] - (t[i] - k_time);
        }
        Arrays.sort(f);
        out.println(f[no_of_res - 1]);
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