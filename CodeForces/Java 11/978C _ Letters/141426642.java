import java.io.*;
import java.util.*;
 
public class C_Letters {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));
 
        long no_of_dom = sc.nextLong(), no_of_rooms = sc.nextLong();
        long dormitory[] = new long[(int) no_of_dom + 1], rooms[] = new long[(int) no_of_rooms];
        long sum = 0, t = 1;
 
        for (int i = 1; i <= no_of_dom; i++)
            dormitory[i] = sc.nextLong();
        for (int i = 0; i < no_of_rooms; i++) {
            rooms[i] = sc.nextLong();
            while (sum + dormitory[(int) t] < rooms[i])
                sum += dormitory[(int) t++];
            out.println(t + " " + (rooms[i] - sum));
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