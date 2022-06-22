import java.io.*;
import java.util.*;
 
public class B_Ordinary_Numbers {
 
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
 
    int t = sc.nextInt();
    while(t-->0)
    {
        double n = sc.nextDouble();
       
        int count = 0;
        for (double i = 1; i <= n; i = i * 10 + 1) 
            for (int d = 1; d <= 9;  d++) 
                if (i * d <= n) 
                    count++;
 
        out.println(count);
    }
    out.close();
  }
}