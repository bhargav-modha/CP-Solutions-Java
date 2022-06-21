 
/*________       _       _      _____  _  __  __                    _
  |__   __| |   (_)     | |    |  __ \(_)/ _|/ _|                  | |
  | |  | |__  _ _ __ | | __ | |  | |_| |_| |_ ___ _ __ ___ _ __ | |_ 
  | |  | '_ \| | '_ \| |/ / | |  | | |  _|  _/ _ \ '__/ _ \ '_ \| __|
  | |  | | | | | | | |   <  | |__| | | | | ||  __/ | |  __/ | | | |_ _
   __|_|  |_| |_|_|_|_|_|_|\_\ |_____/|_|_| |_| \___|_|  \___|_| |_|\__( )
  |  _ \       | |  | |     (_)                                        |/
  | |_) | ___  | |  | |_ __  _  __ _ _   _  ___  
  |  _ < / _ \ | |  | | '_ \| |/ _` | | | |/ _ \ 
  | |_) |  __/ | |__| | | | | | (_| | |_| |  __/
  |____/ \___|  \____/|_| |_|_|\__, |\__,_|\___|
          | |
          |_|*/
import java.io.*;
import java.util.*;
 
public class A_Equation {
 public static void main(String[] args) {
  MyScanner sc = new MyScanner();
  out = new PrintWriter(new BufferedOutputStream(System.out));
 
  long n = sc.nextLong();
  for (long i = 1;; i++) {
   if (!prime(i) && !prime(i + n)) {
    out.println((i + n) + " " + i);
    break;
   }
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
 
 static boolean prime(long n) {
  for (long i = 2; i * i <= n; i++)
   if (n % i == 0)
    return false;
  return true;
 }
}