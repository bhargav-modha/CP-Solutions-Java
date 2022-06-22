import java.io.*;
import java.util.*;
 
public class B_Dreamoon_and_WiFi {
 public static void main(String[] args) {
  MyScanner sc = new MyScanner();
  out = new PrintWriter(new BufferedOutputStream(System.out));
 
  char str[] = sc.next().toCharArray();
  char str2[] = sc.next().toCharArray();
 
  int original = 0, second = 0, question = 0;
  for (char c : str) {
   switch (c) {
    case '+':
     original++;
     break;
    case '-':
     original--;
     break;
   }
  }
  for (char c : str2) {
   switch (c) {
    case '+':
     second++;
     break;
    case '-':
     second--;
     break;
    case '?':
     question++;
     break;
   }
  }
  int distance = original - second;
  double answer;
  if ((distance + question) % 2 != 0 || question < Math.abs(distance))
   answer = 0;
  else {
   int m = (question + Math.abs(distance)) / 2;
   int c = 1;
   for (int i = 0; i < m; i++)
    c *= question - i;
   for (int i = 2; i <= m; i++)
    c /= i;
   answer = (double) c / (1 << question);
  }
  out.println(String.format("%.12f", answer));
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