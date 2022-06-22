import java.io.*;
import java.util.*;
 
public class A_Reconnaissance_2 {
 public static void main(String[] args) {
  MyScanner sc = new MyScanner();
  out = new PrintWriter(new BufferedOutputStream(System.out));
 
  int n = sc.nextInt();
  int heights[] = sc.readArray(n);
  int min = Integer.MAX_VALUE, index1 = 0, index2 = 0;
 
  for (int i = 1; i < heights.length; i++) {
   if (Math.abs(heights[i] - heights[i - 1]) < min) {
    min = Math.abs(heights[i] - heights[i - 1]);
    index1 = i + 1;
    index2 = i;
   }
  }
 
  if (Math.abs(heights[0] - heights[n - 1]) < min) {
   index1 = 1;
   index2 = n;
  }
 
  out.print(index2 + " " + index1);
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