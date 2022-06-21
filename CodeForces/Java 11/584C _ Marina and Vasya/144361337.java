import java.io.*;
import java.util.*;
 
public class C_Marina_and_Vasya {
 public static void main(String[] args) {
  MyScanner sc = new MyScanner();
  out = new PrintWriter(new BufferedOutputStream(System.out));
 
  int n = sc.nextInt(), t = sc.nextInt();
  char a[] = sc.nextLine().toCharArray();
  char b[] = sc.nextLine().toCharArray();
  int diff = 0, same = 0;
  StringBuilder s3 = new StringBuilder();
 
  for (int i = 0; i < n; i++) {
   if (a[i] != b[i])
    diff++;
   else
    same++;
  }
 
  int ca = diff - t, cb = ca;
 
  char res[] = new char[n];
  for (int i = 0; i < n; i++) {
   if (a[i] != b[i]) {
    if (ca > 0) {
     ca--;
     res[i] = a[i];
    } else if (cb > 0) {
     cb--;
     res[i] = b[i];
    } else {
     char c = 'a';
     while (c == a[i] || c == b[i])
      c++;
     res[i] = c;
    }
   }
  }
  int ta = 0, tb = 0;
  for (int i = 0; i < n; i++) {
   if (a[i] != res[i] && res[i] != 0)
    ta++;
  }
  for (int i = 0; i < n; i++) {
   if (res[i] == 0) {
    if (ta < t) {
     ta++;
     char c = 'a';
     while (c == a[i])
      c++;
     res[i] = c;
    } else
     res[i] = a[i];
 
   }
  }
  ta = 0;
  String ans = String.copyValueOf(res);
  for (int i = 0; i < ans.length(); i++) {
   if (ans.charAt(i) != a[i])
    ta++;
   if (ans.charAt(i) != b[i])
    tb++;
  }
  if (ta == tb && ta == t)
   out.println(ans);
  else
   out.println(-1);
 
  out.close();
 }
 
 public static PrintWriter out;
 public static long mod = (long) 1e9 + 7;
 
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