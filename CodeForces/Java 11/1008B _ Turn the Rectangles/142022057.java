import java.io.*;
import java.util.*;
 
public class B_Turn_the_Rectangles {
 public static void main(String[] args) {
  MyScanner sc = new MyScanner();
  out = new PrintWriter(new BufferedOutputStream(System.out));
 
  int n = sc.nextInt(), w[] = new int[n], h[] = new int[n];
 
  for (int i = 0; i < n; i++) {
   w[i] = sc.nextInt();
   h[i] = sc.nextInt();
  }
 
  int max = max(h[0], w[0]);
  boolean flag = false;
 
  for (int i = 1; i < n; i++) {
   if (max(h[i], w[i]) <= max)
    max = max(h[i], w[i]);
   else if (min(h[i], w[i]) <= max)
    max = min(h[i], w[i]);
   else {
    flag = true;
    break;
   }
  }
  out.println(!flag ? "YES" : "NO");
  out.close();
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
 
 static int max(int a, int b) {
  return a > b ? a : b;
 }
 
 static int min(int a, int b) {
  return a < b ? a : b;
 }
}