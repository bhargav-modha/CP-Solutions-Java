import java.io.*;
import java.util.*;
 
public class A_Favorite_Sequence {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));
 
        int t = sc.nextInt();
 
        while(t-->0)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
 
            for(int i=0;i<n;i++) arr[i] = sc.nextInt();
 
            int n_index = n-1;
            for(int i=0;i<n;i++,n_index--)
            {
                if(i>=n_index)
                    break;
                out.print(arr[i]+" "+arr[n_index]+" ");
            }
            if(n%2 != 0)    out.print(arr[n_index]);
            
            out.println();
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