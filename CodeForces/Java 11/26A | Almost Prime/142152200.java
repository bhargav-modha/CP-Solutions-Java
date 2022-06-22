import java.io.*;
import java.util.*;
 
public class P16_Almost_Prime {
 public static void main(String[] args) {
  MyScanner sc = new MyScanner();
  out = new PrintWriter(new BufferedOutputStream(System.out));
 
  int n = sc.nextInt();
  int count = 0;
 
  for (int i = 1; i <= n; i++)
   if (AlmostPrime(i))
    count++;
 
  out.println(count);
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
 
 static boolean AlmostPrime(int n) {
  int count = 0;
  for (int i = 2; i <= n; i++) {
   if (n % i == 0 && prime(i))
    count++;
  }
 
  if (count == 2)
   return true;
  else
   return false;
 }
 
 static boolean prime(int n) {
  for (int i = 2; i * i <= n; i++)
   if (n % i == 0)
    return false;
  return true;
 }
}