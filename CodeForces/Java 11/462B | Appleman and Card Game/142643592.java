import java.io.*;
import java.util.*;
 
public class F_Appleman_and_Card_Game {
 public static void main(String[] args) {
  MyScanner sc = new MyScanner();
  out = new PrintWriter(new BufferedOutputStream(System.out));
 
  int n = sc.nextInt();
  long k = sc.nextLong();
  long[] freq = new long[26];
 
  String str = sc.next();
  for (char ch : str.toCharArray())
   freq[ch - 'A']++;
 
  Arrays.sort(freq);
  long res = 0;
 
  for (int i = 25; i >= 0; i--) {
   if (freq[i] == 0)
    break;
   if (freq[i] <= k) {
    res += (freq[i] * freq[i]);
    k -= freq[i];
   } else {
    res += (k * k);
    break;
   }
 
   if (k == 0)
    break;
  }
  out.println(res);
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