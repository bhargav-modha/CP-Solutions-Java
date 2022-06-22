import java.io.*;
import java.util.*;
 
public class B_CopyCopyCopyCopyCopy {
 
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
        int n = sc.nextInt();
        int num[] = new int[n];
 
        for(int i=0;i<n;i++) num[i] = sc.nextInt();
        Arrays.sort(num);
        int count = 0;
 
        for(int i=0;i<n-1;i++)
            if(num[i]!=num[i+1])
                count++;
 
        out.println(count+1);
    }
    out.close();
  }
}