import java.io.*;
import java.util.*;
 
public class A_Dividing_Orange {
 public static void main(String[] args) {
  MyScanner sc = new MyScanner();
  out = new PrintWriter(new BufferedOutputStream(System.out));
 
  int n = sc.nextInt(), k = sc.nextInt();
  int choices[] = new int[k], segments[] = new int[n * k];
 
  for (int i = 0; i < k; i++)
   choices[i] = sc.nextInt();
 
  for (int i = 0; i < n * k; i++)
   segments[i] = i + 1;
 
  for (int i = 0; i < k; i++)
   for (int j = 0; j < n * k; j++)
    if (choices[i] == segments[j])
     segments[j] = 0;
 
  int index = 0;
  for (int i = 0; i < k; i++) {
   out.print(choices[i] + " ");
   for (int j = 0; j < n - 1; j++) {
    while (segments[index] == 0)
     index++;
    out.print(segments[index++] + " ");
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