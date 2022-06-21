import java.io.*;
import java.util.*;
 
public class B_Construct_the_String {
 public static void main(String[] args) {
  MyScanner sc = new MyScanner();
  out = new PrintWriter(new BufferedOutputStream(System.out));
  int t = sc.nextInt();
  while (t-- > 0) {
   int tot_len = sc.nextInt();
   int len_substring = sc.nextInt(), distinct = sc.nextInt();
   char c[] = "abcdefghijklmnopqrstuvwxyz".toCharArray();
   String answer = "";
 
   for (int i = 0; i < distinct; i++)
    answer += c[i];
 
   int k = 0;
   while (tot_len-- > 0) {
    out.print(answer.charAt(k));
    k++;
 
    if (k == distinct)
     k = 0;
   }
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