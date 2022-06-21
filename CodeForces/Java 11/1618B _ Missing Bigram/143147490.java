import java.io.*;
import java.util.*;
 
public class B_Missing_Bigram {
 public static void main(String[] args) {
  MyScanner sc = new MyScanner();
  out = new PrintWriter(new BufferedOutputStream(System.out));
 
  int t = sc.nextInt();
  while (t-- > 0) {
   int len = sc.nextInt();
   String bigrams[] = sc.nextLine().split(" ");
 
   StringBuilder sb = new StringBuilder();
   sb.append(bigrams[0]);
 
   for (int i = 1; i < bigrams.length; i++) {
    String temp = bigrams[i - 1];
    String nxt = bigrams[i];
 
    if (nxt.charAt(0) == temp.charAt(1))
     sb.append(nxt.charAt(1));
    else
     sb.append(nxt);
   }
   if (sb.length() < len)
    sb.append('a');
   out.println(sb.toString());
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