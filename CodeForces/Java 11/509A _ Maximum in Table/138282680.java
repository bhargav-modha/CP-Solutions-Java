import java.io.*;
import java.util.*;
 
public class A_Maximum_in_Table {
 
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
 
    int temp = sc.nextInt();
    int arr[][] = new int[temp][temp];
    int max = 0;
 
    for (int r = 0; r < temp; r++) {
      for (int c = 0; c < temp; c++) {
        if (r == 0 || c == 0) arr[r][c] = 1; 
        else arr[r][c] = arr[r - 1][c] + arr[r][c - 1];
      }
    }
 
    for (int r = 0; r < temp; r++) for (int c = 0; c < temp; c++) 
    max = Math.max(max, arr[r][c]);
 
    out.println(max);
    out.close();
  }
}