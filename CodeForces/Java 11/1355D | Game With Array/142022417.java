import java.io.*;
import java.util.*;
 
public class D_Game_With_Array {
 public static void main(String[] args) {
  MyScanner sc = new MyScanner();
  out = new PrintWriter(new BufferedOutputStream(System.out));
 
  int n = sc.nextInt();
  int s = sc.nextInt();
 
  if (2 * n <= s) {
   out.println("YES");
   for (int i = 0; i < n - 1; i++) {
    out.print(2+" ");
    s -= 2;
   }
   out.print(s+"\n"+1);
  } else {
   out.println("NO");
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