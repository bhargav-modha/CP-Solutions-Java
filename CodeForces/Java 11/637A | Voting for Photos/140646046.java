import java.io.*;
import java.util.*;
 
public class B_Christmas_Party_Dilemma {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));
 
        int n = sc.nextInt();
        long arr[] = new long[n], count_arr[] = new long[n], max = 0, max2 = 0;
        boolean flag = false;
 
        for (int i = 0; i < n; i++) {
            long temp = sc.nextLong();
            flag = false;
 
            for (int j = 0; j < n; j++) {
                if (temp == arr[j] && arr[j] != 0) {
                    count_arr[j]++;
                    flag = true;
                }
            }
 
            if (!flag)
            {
                arr[i] = temp;
                if(i == 0)
                    max2 = temp;
            }
 
            for (int k = 0; k < count_arr.length; k++)
                if (count_arr[k] > max && count_arr[k] != max) {
                    max = count_arr[k];
                    max2 = arr[k];
                }
        }
 
        out.println(max2);
        
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