import java.io.*;
import java.util.*;
 
public class B_T_primes {
 public static void main(String[] args) {
  MyScanner sc = new MyScanner();
  out = new PrintWriter(new BufferedOutputStream(System.out));
 
  boolean[] sieve = new boolean[1000001];
  Arrays.fill(sieve, true);
  sieve[0] = false;
  sieve[1] = false;
 
  for (int i = 2; i * i < sieve.length; i++)
   if (sieve[i])
    for (int j = i; j * i < sieve.length; j++)
     sieve[j * i] = false;
 
  int n = sc.nextInt();
  while (n-- > 0) {
   long temp = sc.nextLong();
   int root = (int) Math.sqrt(temp);
 
   if (temp == ((long) root) * root && sieve[root])
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
   int arr[] = new int[n];
   for (int i = 0; i < n; i++)
    arr[i] = nextInt();
   return arr;
  }
 
  long[] readLongArray(int n) {
   long arr[] = new long[n];
   for (int i = 0; i < n; i++)
    arr[i] = nextLong();
   return arr;
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