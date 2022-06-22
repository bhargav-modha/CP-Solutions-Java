import java.io.*;
import java.util.*;
import java.util.concurrent.CountDownLatch;
 
public class A_Stable_Arrangement_of_Rooks {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));
 
        int t = sc.nextInt();
        while (t-- > 0) {
            int size = sc.nextInt();
            int rook = sc.nextInt(), count = rook, pos_c = 0, pos_r = 0;
 
            if (rook == size && rook == 1) {
                out.println("R");
            } else if (size % 2 != 0 && rook <= size / 2 + 1) {
                for (int i = 0; i < size; i++) {
                    for (int j = 0; j < size; j++) {
                        if (count != 0 && i == pos_r && j == pos_c) {
                            pos_r += 2;
                            pos_c += 2;
                            out.print("R");
                            count--;
                        } else
                            out.print(".");
                    }
                    out.println();
                }
            } else if (size % 2 == 0 && rook <= size / 2) {
                for (int i = 0; i < size; i++) {
                    for (int j = 0; j < size; j++) {
                        if (count != 0 && i == pos_r && j == pos_c) {
                            pos_r += 2;
                            pos_c += 2;
                            out.print("R");
                            count--;
                        } else
                            out.print(".");
                    }
                    out.println();
                }
            } else
                out.println("-1");
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