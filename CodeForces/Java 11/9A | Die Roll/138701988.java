import java.io.*;
import java.util.*;
 
public class A_Die_Roll {
 
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
 
    int y = sc.nextInt();
    int w = sc.nextInt();
 
    int numerator = 6-(Math.max(y,w)-1), denom=6;
 
    for(int i=2;i<=denom;i++)
    {
        if(numerator%i == 0 && denom%i == 0)
        {
            numerator /= i;
            denom /= i;
        }
    }  
    out.println(numerator+"/"+denom);
    out.close();
  }
}