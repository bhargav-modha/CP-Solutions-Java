import java.io.*;
import java.util.*;
 
public class B_Multiply_by_2_divide_by_6 {
 public static void main(String[] args) {
  MyScanner sc = new MyScanner();
  out = new PrintWriter(new BufferedOutputStream(System.out));
 
  int t = sc.nextInt();
  while (t-- > 0) {
   int n = sc.nextInt();
   int count2 = 0, count3 = 0;
   int temp = n;
 
   while (temp % 2 == 0) {
    count2++;
    temp /= 2;
   }
 
   while (temp % 3 == 0) {
    count3++;
    temp /= 3;
   }
 
   if (count2 <= count3 && temp == 1)
    out.println((count3 - count2) + count3);
   else
    out.println("-1");
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
 
 static boolean prime(int n) {
  for (int i = 2; i * i <= n; i++)
   if (n % i == 0)
    return false;
  return true;
 }
}