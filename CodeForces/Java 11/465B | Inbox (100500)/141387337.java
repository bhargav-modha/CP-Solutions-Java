import java.io.*;
import java.util.*;
 
public class Inbox {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));
 
        int previous = 0, unread_sum = 0, group = 0;
 
        int n = sc.nextInt();
        for (int i = 1; i <=n; i++) {
            int temp = sc.nextInt();
            if (temp == 1)
                unread_sum++;
            if (previous == 0 && temp == 1)
                group++;
            previous = temp;
        }
        out.println(unread_sum + Math.max(group-1, 0));
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