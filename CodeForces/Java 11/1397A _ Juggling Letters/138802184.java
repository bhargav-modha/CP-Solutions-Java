import java.io.*;
import java.util.*;
 
public class A_Juggling_Letters {
 
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
        int strcount = sc.nextInt();
        int count = 1;
        String str ="";
 
        for(int i=0;i<strcount;i++) str+= sc.next();
 
        char ch[] = str.toCharArray();
        Arrays.sort(ch);
        
        boolean flag = true;
 
        if(str.length()%strcount != 0)
            out.println("NO");
        else
        {
            for(int i=1;i<ch.length;i++)
            {
                if(ch[i] == ch[i-1])    count++;
                else
                {
                    if(count%strcount != 0)
                    {
                        out.println("NO");
                        flag = false;
                        break;
                    }
                    count = 1;
                }
            }
            if(flag) out.println("YES");
        }
    }
    out.close();
  }
}