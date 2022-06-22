import java.io.*;
import java.util.*;
 
public class A_Nauuo_and_Votes {
 public static void main(String[] args) {
  MyScanner sc = new MyScanner();
  out = new PrintWriter(new BufferedOutputStream(System.out));
  int x = sc.nextInt(), y = sc.nextInt(), z = sc.nextInt();
  if (z == 0)
   out.println(x > y ? '+' : (x < y ? '-' : '0'));
  else {
   if (x > y + z)
    out.println('+');
 
   else if (y > x + z)
    out.println('-');
   else
    out.println('?');
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
 }
}