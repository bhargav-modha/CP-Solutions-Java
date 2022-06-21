import java.io.*;
import java.util.*;
 
public class P37_Make_Product_Equal_One {
 public static void main(String[] args) {
  MyScanner sc = new MyScanner();
  out = new PrintWriter(new BufferedOutputStream(System.out));
 
  int n = sc.nextInt();
  long arr[] = new long[n], sum = 0;
  int negative = 0, zero = 0;
 
  for (int i = 0; i < n; i++) {
   arr[i] = sc.nextLong();
 
   if (arr[i] < 0) {
    negative++;
    sum += Math.abs(arr[i] + 1);
   } else if (arr[i] > 0) {
    sum += arr[i] - 1;
   } else {
    zero++;
    sum += 1;
   }
  }
 
  if (zero == 0 && negative % 2 != 0)
   sum += 2;
 
  out.println(sum);
 
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