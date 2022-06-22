import java.io.*;
import java.util.*;
 
public class A_Haiku {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));
 
        String line1 = sc.nextLine();
        String line2 = sc.nextLine();
        String line3 = sc.nextLine();
        int count = 0;
 
        line1 = line1.replaceAll(" ", "").trim();
        line2 = line2.replaceAll(" ", "").trim();
        line3 = line3.replaceAll(" ", "").trim();
 
        for (int i = 0; i < line1.length(); i++) {
            if (line1.charAt(i) == 'a' || line1.charAt(i) == 'e' || line1.charAt(i) == 'i' || line1.charAt(i) == 'o'
                    || line1.charAt(i) == 'u')
                count++;
        }
        if (count != 5)
            out.println("NO");
        else {
            count = 0;
            for (int i = 0; i < line2.length(); i++) {
                if (line2.charAt(i) == 'a' || line2.charAt(i) == 'e' || line2.charAt(i) == 'i' || line2.charAt(i) == 'o'
                        || line2.charAt(i) == 'u')
                    count++;
            }
            if (count != 7)
                out.println("NO");
            else {
                count = 0;
                for (int i = 0; i < line3.length(); i++) {
                    if (line3.charAt(i) == 'a' || line3.charAt(i) == 'e' || line3.charAt(i) == 'i'
                            || line3.charAt(i) == 'o'
                            || line3.charAt(i) == 'u')
                        count++;
                }
                if (count != 5)
                    out.println("NO");
                else
                    out.println("YES");
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