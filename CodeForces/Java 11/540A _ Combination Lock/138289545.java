import java.io.*;
import java.util.*;
 
public class A_Combination_Lock {
 
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
 
    int n = sc.nextInt(), sum = 0;
    String num1 = sc.next(), num2 = sc.next();
    
    for(int i=0;i<n;i++)
    {
        int digit1 = Integer.parseInt(String.valueOf(num1.charAt(i)));
        int digit2 = Integer.parseInt(String.valueOf(num2.charAt(i)));
 
        if(Math.abs(digit1-digit2)>5)
            sum += (10-(Math.abs(digit1-digit2)));
        else
            sum += Math.abs(digit1-digit2);
    }
 
    out.println(sum);
    out.close();
  }
}