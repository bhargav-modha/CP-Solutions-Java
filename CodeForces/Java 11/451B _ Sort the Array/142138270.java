import java.io.*;
import java.util.*;
 
public class P12_Sort_the_Array {
 public static void main(String[] args) {
  MyScanner sc = new MyScanner();
  out = new PrintWriter(new BufferedOutputStream(System.out));
 
  int n = sc.nextInt();
  int sorted[] = sc.readArray(n);
  int org[] = new int[n];
  for (int i = 0; i < n; i++)
   org[i] = sorted[i];
  sort(sorted);
 
  int count = 0;
  int num1 = -1, num2 = -1;
 
  for (int i = 0; i < n; i++) {
   if (org[i] != sorted[i]) {
 
    if (num1 == -1)
     num1 = i;
    else
     num2 = i;
    count++;
   }
  }
 
  if (num1 == -1 || num2 == -1) {
   out.println("yes");
   out.println(1 + " " + 1);
  } else if (count % 2 != 0) {
   out.println("no");
  } else {
   if (!isReverse(org, sorted, num1, num2)) {
    out.println("no");
   } else {
    out.println("yes");
    out.println((num1 + 1) + " " + (num2 + 1));
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
 
 static void sort(int[] a) {
  ArrayList<Integer> list = new ArrayList<>();
  for (int i : a)
   list.add(i);
  Collections.sort(list);
  for (int i = 0; i < a.length; i++)
   a[i] = list.get(i);
 }
 
 public static boolean isReverse(int[] arr, int[] copy, int si, int ei) {
  int i = si;
  int j = ei;
 
  while (i <= ei && j >= si) {
   if (arr[i] != copy[j])
    return false;
   i++;
   j--;
  }
  return true;
 }
}