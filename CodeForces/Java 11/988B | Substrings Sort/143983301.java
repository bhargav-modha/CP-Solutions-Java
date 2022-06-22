import java.io.*;
import java.util.*;
 
public class B_Substrings_Sort {
 public static void main(String[] args) {
  MyScanner sc = new MyScanner();
  out = new PrintWriter(new BufferedOutputStream(System.out));
 
  int n = sc.nextInt();
  String s[] = new String[n];
  int lengths[] = new int[n];
 
  for (int i = 0; i < n; i++) {
   s[i] = sc.next();
   lengths[i] = s[i].length();
  }
 
  for (int i = 0; i < n; i++) {
   for (int j = i + 1; j < n; j++) {
    if (lengths[i] > lengths[j]) {
     int temp = lengths[i];
     lengths[i] = lengths[j];
     lengths[j] = temp;
 
     String str = s[i];
     s[i] = s[j];
     s[j] = str;
    }
   }
  }
  boolean flag = true;
  for (int i = 0; i < n - 1; i++) {
   if (!(s[i + 1].contains(s[i]))) {
    flag = false;
    break;
   }
  }
  if (s.length - 2 >=0)
   if (!(s[s.length - 1].contains(s[s.length - 2])) || !flag) {
    flag = false;
    out.println("NO");
   }
 
  if (flag) {
   out.println("YES");
   for (String str : s)
    out.println(str);
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