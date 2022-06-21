import java.io.*;
import java.util.*;
 
public class P39_Vitamins {
 public static void main(String[] args) {
  MyScanner sc = new MyScanner();
  out = new PrintWriter(new BufferedOutputStream(System.out));
  int n = sc.nextInt();
 
  int min_a = Integer.MAX_VALUE, min_b = Integer.MAX_VALUE, min_c = Integer.MAX_VALUE,
    min_ab = Integer.MAX_VALUE, min_bc = Integer.MAX_VALUE, min_ac = Integer.MAX_VALUE,
    min_abc = Integer.MAX_VALUE;
 
  while (n-- > 0) {
   int x = sc.nextInt();
   String juice = sc.next();
 
   if (juice.length() == 1) {
    switch (juice) {
     case "A":
      min_a = min(min_a, x);
      break;
     case "B":
      min_b = min(min_b, x);
      break;
     case "C":
      min_c = min(min_c, x);
      break;
    }
   } else if (juice.length() == 2) {
    if (juice.contains("A") && juice.contains("B"))
     min_ab = min(min_ab, x);
    else if (juice.contains("B") && juice.contains("C"))
     min_bc = min(min_bc, x);
    else if (juice.contains("A") && juice.contains("C"))
     min_ac = min(min_ac, x);
   } else
    min_abc = min(min_abc, x);
  }
 
  if ((min_a == Integer.MAX_VALUE && min_ab == Integer.MAX_VALUE && min_ac == Integer.MAX_VALUE
    && min_abc == Integer.MAX_VALUE)
    || (min_b == Integer.MAX_VALUE && min_bc == Integer.MAX_VALUE && min_ab == Integer.MAX_VALUE
      && min_abc == Integer.MAX_VALUE)
    || (min_c == Integer.MAX_VALUE && min_ac == Integer.MAX_VALUE && min_bc == Integer.MAX_VALUE
      && min_abc == Integer.MAX_VALUE))
   out.println("-1");
  else {
   int answer = Integer.MAX_VALUE;
   if (min(answer, min_ab + min_c) > 0)
    answer = min(answer, min_ab + min_c);
   if (min(answer, min_bc + min_a) > 0)
    answer = min(answer, min_bc + min_a);
   if (min(answer, min_ac + min_b) > 0)
    answer = min(answer, min_ac + min_b);
   if (min(answer, min_ab + min_bc) > 0)
    answer = min(answer, min_ab + min_bc);
   if (min(answer, min_bc + min_ac) > 0)
    answer = min(answer, min_bc + min_ac);
   if (min(answer, min_ac + min_ab) > 0)
    answer = min(answer, min_ac + min_ab);
   if (min(answer, min_abc) > 0)
    answer = min(answer, min_abc);
   if (min(answer, min_a + min_b + min_c) > 0
     && (min_a != Integer.MAX_VALUE && min_b != Integer.MAX_VALUE && min_c != Integer.MAX_VALUE))
    answer = min(answer, (min_a + min_b + min_c));
 
   out.println(answer);
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
 
 static int abs(int a) {
  return a > 0 ? a : -a;
 }
 
 static int max(int a, int b) {
  return a > b ? a : b;
 }
 
 static int min(int a, int b) {
  return a < b ? a : b;
 }
}