import java.io.*;
import java.util.*;
 
public class A_Squats {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));
 
        int num = sc.nextInt(), seating = 0,standing = 0;
        String str = sc.next();
 
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='x')  seating++;
            else    standing++;
        }
 
        if(seating == standing)
        {
            out.println(0);
            out.println(str);
        }
        else
        {
            if(standing>seating)
            {
                out.println(standing-num/2);
                while(standing != seating)
                {
                    str = str.replaceFirst("X", "x");
                    standing--;
                    seating++;
                }
            }
            else
            {
                out.println(seating-num/2);
                while(standing != seating)
                {
                    str = str.replaceFirst("x", "X");
                    standing++;
                    seating--;
                }
            }
            out.println(str);
            
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
}