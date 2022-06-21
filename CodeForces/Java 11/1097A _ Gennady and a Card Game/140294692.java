import java.io.*;
import java.util.*;
 
public class A_Gennady_and_a_Card_Game {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));
 
        String table_c = sc.next();
        Boolean flag = true;
 
        for(int i=0;i<5;i++)
        {
            String temp = sc.next();
            if(temp.charAt(0) == table_c.charAt(0) || temp.charAt(1)==table_c.charAt(1))
            {
                flag = false;
                break;
            }
        }
        if(flag) out.println("NO");
        else out.println("YES");
 
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
}