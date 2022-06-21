import java.io.*;
import java.util.*;
 
public class B_Jzzhu_and_Sequences {
 public static void main(String[] args) {
  MyScanner sc = new MyScanner();
  out = new PrintWriter(new BufferedOutputStream(System.out));
 
  long first = sc.nextLong();
  long second = sc.nextLong();
  long p = sc.nextLong();
 
  long arr[] = { first, second, second - first, -first, -second, first - second };
  long ans = (arr[((int) p - 1) % 6] % 1000000007 + 1000000007) % 1000000007;
 
  out.println(ans);
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