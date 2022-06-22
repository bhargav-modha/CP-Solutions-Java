import java.io.*;
import java.util.*;
 
public class C_Division_by_Two_and_Permutation {
 public static void main(String[] args) {
  MyScanner sc = new MyScanner();
  out = new PrintWriter(new BufferedOutputStream(System.out));
  int t = sc.nextInt();
  while (t-- > 0) {
   int n = sc.nextInt();
   int[] a = new int[n];
   for (int i = 0; i < n; i++)
    a[i] = sc.nextInt();
 
   Arrays.sort(a);
   boolean[] visited = new boolean[n + 1];
   for (int i = 0; i < n; i++) {
    while (a[i] > 0) {
     if (a[i] <= n && !visited[a[i]]) {
      visited[a[i]] = true;
      break;
     }
     a[i] /= 2;
    }
   }
   boolean b = true;
   for (int i = 1; i <= n; i++) {
    if (!visited[i]) {
     b = false;
     break;
    }
   }
   out.println(b?"YES":"NO");
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