import java.io.*;
import java.util.*;
 
public class A_Ilya_and_Bank_Account {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));
        long num = sc.nextLong();
 
        if (num >= 0)
            out.println(num);
        else if (String.valueOf(num).length() == 3)
            out.println(Math.max(num / 10, num % 10));
        else if (String.valueOf(num).length() > 2)
        {
            long temp1 = Integer.parseInt(String.valueOf(num).substring(0, String.valueOf(num).length() - 1));
            long temp2 = Integer.parseInt(String.valueOf(num).substring(0, String.valueOf(num).length() - 2)
            + String.valueOf(num).substring(String.valueOf(num).length()-1));
            out.println(Math.max(temp1, temp2));
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