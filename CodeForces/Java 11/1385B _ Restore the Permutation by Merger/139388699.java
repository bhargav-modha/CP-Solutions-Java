import java.io.*;
import java.util.*;
 
public class B_Restore_the_Permutation_by_Merger {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));
 
        int t = sc.nextInt();
        while(t-->0)
        {
            int n = 2*sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < arr.length; i++) arr[i] = sc.nextInt();
 
            for(int i = 0;i<n;i++)
                for(int j=i+1;j<n;j++)
                    if(arr[i] == arr[j])
                        arr[j] = -1;
 
            for(int x:arr) 
                if(x == 0-1)
                    continue;
                else
                    out.print(x+" ");
 
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
   
    static void sort(int[] a) {
        ArrayList < Integer > list = new ArrayList < > ();
        for (int i: a) list.add(i);
        Collections.sort(list);
        for (int i = 0; i < a.length; i++) a[i] = list.get(i);
    }
}