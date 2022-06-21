import java.io.*;
import java.util.*;
 
public class A_Greg_s_Workout {
 public static void main(String[] args) {
  MyScanner sc = new MyScanner();
  out = new PrintWriter(new BufferedOutputStream(System.out));
  
  int n = sc.nextInt(), max = Integer.MIN_VALUE, temp = 0;
  int exercises[] = new int[3];
 
  for (int i = 0; i < n; i++)
   exercises[i % 3] += sc.nextInt();
 
  for (int i = 0; i < 3; i++) {
   if (exercises[i] != 0 && exercises[i] > max) {
    max = exercises[i];
    temp = i;
   }
  }
 
  switch (temp) {
   case 0:
    out.println("chest");
    break;
   case 1:
    out.println("biceps");
    break;
   case 2:
    out.println("back");
    break;
  }
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