import java.io.*;
import java.util.*;
 
public class C_Vasya_and_Golden_Ticket {
 public static void main(String[] args) {
  MyScanner sc = new MyScanner();
  out = new PrintWriter(new BufferedOutputStream(System.out));
 
  int n = sc.nextInt();
  String str = sc.next();
  char charArr[] = str.toCharArray();
 
  long sum1 = 0;
  for (int i = 0; i < n; i++) {
   boolean flag = true;
   sum1 += charArr[i] - '0';
   int pos = i + 1;
   long sum2 = 0;
   while (pos < n) {
    sum2 = charArr[pos++] - '0';
    while (pos < n && sum2 + charArr[pos] - '0' <= sum1) {
     sum2 += charArr[pos] - '0';
     pos++;
    }
    if (sum1 != sum2)
     flag = false;
   }
   if (sum1 != sum2)
    flag = false;
   if (flag) {
    out.println("YES");
    out.close();
    return;
   }
  }
  out.println("NO");
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