import java.io.*;
import java.util.*;
 
public class A_Cakeminator {
 public static void main(String[] args) {
  MyScanner sc = new MyScanner();
  out = new PrintWriter(new BufferedOutputStream(System.out));
 
  int r = sc.nextInt(), c = sc.nextInt();
  char matrix[][] = new char[r][c];
  int count = 0, new_count = 0;
  for (int i = 0; i < r; i++) {
   String str = sc.nextLine();
   if (!(str.contains("S")))
    count++;
   else {
    for (int j = 0; j < c; j++) {
     matrix[i][j] = str.charAt(j);
    }
   }
  }
 
  count *= c;
  String str = "";
  for (int i = 0; i < c; i++) {
   str = "";
   for (int j = 0; j < r; j++)
    str += String.valueOf(matrix[j][i]).trim();
   if (!(str.contains("S")))
    new_count++;
  }
  out.println((new_count * str.length()) + count);
  out.close();
 }
 
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
 
  int[] readArray(int n) {
   int a[] = new int[n];
   for (int i = 0; i < n; i++)
    a[i] = nextInt();
   return a;
  }
 
  long[] readLongArray(int n) {
   long a[] = new long[n];
   for (int i = 0; i < n; i++)
    a[i] = nextLong();
   return a;
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
}