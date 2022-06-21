import java.io.*;
import java.util.*;
 
public class A_Tit_for_Tat {
 
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
        int len =  sc.nextInt();
        int opr = sc.nextInt();
        int num[] = new int[len];
 
        for(int i=0;i<len;i++) num[i] = sc.nextInt();
        
        for(int i=0;i<len-1;i++)
        {
            if(num[i]<opr)
            {
                opr-=num[i];
                num[len-1]+=num[i];
                num[i]=0;
            }
            else
            {
                num[i]-=opr;
                num[len-1]+=opr;
                opr=0;
            }
        }
        for(int x:num) out.print(x+" ");
        out.println();
    }
    out.close();
  }
}