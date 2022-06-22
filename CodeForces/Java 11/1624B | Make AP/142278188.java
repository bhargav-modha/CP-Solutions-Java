import java.io.*;
import java.util.*;
 
public class B_Make_AP {
 public static void main(String[] args) {
  MyScanner sc = new MyScanner();
  out = new PrintWriter(new BufferedOutputStream(System.out));
  int t = sc.nextInt();
 
  while (t-- > 0) {
   long a = sc.nextLong();
   long b = sc.nextLong();
   long c = sc.nextLong();
 
   if (b - a == c - b || (a == b && b == c))
    out.println("YES");
   else if ((2 * b - c) % a == 0 && 2 * b - c > 0)
    out.println("YES");
   else if ((2 * b - a) % c == 0 && 2 * b - a > 0)
    out.println("YES");
   else if ((a + c) % (2 * b) == 0)
    out.println("YES");
   else
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
 
 static int min(int a, int b) {
  return a < b ? a : b;
 }
}