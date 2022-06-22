import java.io.*;
import java.util.*;
 
public class A_Benches {
 public static void main(String[] args) {
  MyScanner sc = new MyScanner();
  out = new PrintWriter(new BufferedOutputStream(System.out));
  int benches = sc.nextInt(), m_ppl = sc.nextInt();
  int ppl[] = sc.readArray(benches);
 
  Arrays.sort(ppl);
  int max = ppl[benches - 1] + m_ppl;
 
  while (m_ppl > 0) {
   int min = Integer.MAX_VALUE;
   int pos = 0;
   for (int i = 0; i < ppl.length; i++) {
    if (ppl[i] < min) {
     min = ppl[i];
     pos = i;
    }
   }
   ppl[pos]++;
   m_ppl--;
  }
 
  int min = Integer.MIN_VALUE;
  for (int i = 0; i < ppl.length; i++)
   if (ppl[i] > min)
    min = ppl[i];
 
  out.println(min + " " + max);
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