import java.io.*;
import java.util.*;
 
public class B_Borze {
 
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
 
    String str = sc.next();
    String res = "";
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == '.') {
        res += "0";
      } else {
        if (str.charAt(i + 1) == '.') res += "1"; else res += "2";
        i++;
      }
    }
 
    out.println(res);
    out.close();
  }
}