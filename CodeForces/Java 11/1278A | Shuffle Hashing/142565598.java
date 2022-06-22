import java.io.*;
import java.util.*;
 
public class P31_Shuffle_Hashing {
 public static void main(String[] args) {
  MyScanner sc = new MyScanner();
  out = new PrintWriter(new BufferedOutputStream(System.out));
 
  int t = sc.nextInt();
  while (t-- > 0) {
 
   char[] p = sc.next().toCharArray();
   int len = p.length;
 
   Arrays.sort(p);
   String pass = Arrays.toString(p);
 
   boolean flag = false;
   String hash = sc.next();
   for (int i = 0; i <= hash.length() - len; i++) {
    char[] sub = hash.substring(i, i + len).toCharArray();
    Arrays.sort(sub);
    String s1 = Arrays.toString(sub);
    if ((s1.equals(pass))) {
     flag = true;
     break;
    }
   }
   out.println(flag ? "YES" : "NO");
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