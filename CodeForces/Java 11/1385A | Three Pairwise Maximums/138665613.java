import java.io.*;
import java.util.*;
 
public class A_Three_Pairwise_Maximums {
 
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
        int num[] = new int[3];
 
        for(int i=0;i<num.length;i++) num[i] = sc.nextInt();
        Arrays.sort(num);
 
        if(num[1] == num[2])
        {
            out.println("YES");
            out.println(num[0]+" "+num[0]+" "+num[2]);
        }
        else
        {
            out.println("NO");
        }
    }
    out.close();
  }
}
 