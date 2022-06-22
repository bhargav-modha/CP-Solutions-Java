import java.io.*;
import java.util.*;
 
public class A_Cards_for_Friends {
 
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
 
    int t =sc.nextInt();
    while(t-->0)
    {
        int w = sc.nextInt();
        int h = sc.nextInt();
        int n = sc.nextInt();
        int count = 1;
 
        if(n == 1)
            out.println("YES");
        else if(w%2 != 0 && h%2 != 0)
            out.println("NO");
        else
        {
            while(w%2 == 0 || h%2 == 0)
            {
                if(w%2 == 0)
                    w /= 2;
                else if(h%2 == 0)
                    h /= 2;
                
                count *= 2;
            }
            out.println(count>=n?"YES":"NO");
        }
    }
    out.close();
  }
}