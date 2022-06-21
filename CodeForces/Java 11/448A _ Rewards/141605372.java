import java.io.*;
import java.util.*;
 
public class A_Rewards {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));
 
        int cups = 0, medals = 0, shelves;
        for (int i = 0; i < 3; i++)
            cups += sc.nextInt();
        for (int i = 0; i < 3; i++)
            medals += sc.nextInt();
 
        shelves = sc.nextInt();
 
        if (shelves < 2 && medals>0 && cups>0)
            out.println("NO");
        else if (cups > 5 || medals > 10) {
            int c_count = 1, m_count = 1;
            while (cups > 5) {
                c_count++;
                cups -= 5;
            }
            while (medals > 10) {
                m_count++;
                medals -= 10;
            }
            if (shelves < (m_count + c_count))
                out.println("NO");
            else
                out.println("YES");
        } else
            out.println("YES");
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