import java.io.*;
import java.util.*;
 
public class A_Min_Max_Swap {
 public static void main(String[] args) {
  MyScanner sc = new MyScanner();
  out = new PrintWriter(new BufferedOutputStream(System.out));
 
  int t = sc.nextInt();
  while (t-- > 0) {
   int n = sc.nextInt(), arr1[] = sc.readArray(n), arr2[] = sc.readArray(n);
   int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
 
   for (int i = 0; i < n; i++) {
    if (arr1[i] > arr2[i]) {
     int temp = arr1[i];
     arr1[i] = arr2[i];
     arr2[i] = temp;
    }
    max1 = Integer.max(arr1[i], max1);
    max2 = Integer.max(arr2[i], max2);
   }
 
   out.println(max1 * max2);
  }
  out.close();
 }
 
 public static PrintWriter out;
 public static long mod = (long) 1e9 + 7;
 
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