import java.io.*;
import java.util.*;
 
public class P46_Eleven {
 public static void main(String[] args) {
  MyScanner sc = new MyScanner();
  out = new PrintWriter(new BufferedOutputStream(System.out));
  int n = sc.nextInt();
  int first = 1;
  int second = 1;
 
  int fibo[] = new int[1000];
  fibo[0] = first;
 
  int i = 0;
  while (first < n) {
   int temp = first;
   first = first + second;
   second = temp;
   fibo[++i] = first;
  }
 
  StringBuilder sb = new StringBuilder();
  for(int j = 0;j<n;j++)
   sb.append('o');
 
  for(int x:fibo)
   if(x!=0 && x<=n)
   try {
    sb.replace(x-1, x,"O");
   } catch (Exception e) {}
    
  out.println(String.valueOf(sb));
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