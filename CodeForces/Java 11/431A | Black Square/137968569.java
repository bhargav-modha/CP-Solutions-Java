import java.io.*;
import java.util.*;
 
public class A_Black_Square {
 
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
 
  public static void main(String[] args) {
    MyScanner sc = new MyScanner();
    out = new PrintWriter(new BufferedOutputStream(System.out));
 
    int calories[] = new int[4], sum = 0;
    for (int i = 0; i < calories.length; i++) calories[i] = sc.nextInt();
 
    String str = sc.next();
 
    for (int i = 0; i < str.length(); i++) sum +=
      calories[Integer.parseInt(String.valueOf(str.charAt(i))) - 1];
 
    out.println(sum);
    out.close();
  }
}