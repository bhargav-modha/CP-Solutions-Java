import java.io.*;
import java.util.*;
 
public class A_Candy_Bags
{
 public static void main(String[] args)
 {
  MyScanner sc = new MyScanner();
  out = new PrintWriter(new BufferedOutputStream(System.out));
 
  int n = sc.nextInt();
  int val1 = 1, val2 = n * n;
  for (int i = 1; i <= n; i++)
  {
   for (int j = 1; j <= n / 2; j++)
   {
    out.print(val1 + " ");
    val1++;
   }
   for (int j = 1; j <= n / 2; j++)
   {
    out.print(val2 + " ");
    val2--;
   }
   out.println();
  }
  out.close();
 }
 
 public static PrintWriter out;
 
 public static class MyScanner
 {
  BufferedReader br;
  StringTokenizer st;
 
  public MyScanner()
  {
   br = new BufferedReader(new InputStreamReader(System.in));
  }
 
  String next()
  {
   while (st == null || !st.hasMoreElements())
   {
    try
    {
     st = new StringTokenizer(br.readLine());
    }
    catch (IOException e)
    {
     e.printStackTrace();
    }
   }
   return st.nextToken();
  }
 
  int nextInt()
  {
   return Integer.parseInt(next());
  }
 
  long nextLong()
  {
   return Long.parseLong(next());
  }
 
  double nextDouble()
  {
   return Double.parseDouble(next());
  }
 
  int[] readArray(int n)
  {
   int a[] = new int[n];
   for (int i = 0; i < n; i++)
    a[i] = nextInt();
   return a;
  }
 
  long[] readLongArray(int n)
  {
   long a[] = new long[n];
   for (int i = 0; i < n; i++)
    a[i] = nextLong();
   return a;
  }
 
  String nextLine()
  {
   String str = "";
   try
   {
    str = br.readLine();
   }
   catch (IOException e)
   {
    e.printStackTrace();
   }
   return str;
  }
 }
}