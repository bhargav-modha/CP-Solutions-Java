import java.io.*;
import java.util.*;
 
public class B_Queries_about_less_or_equal_elements {
 public static void main(String[] args) {
  MyScanner sc = new MyScanner();
  out = new PrintWriter(new BufferedOutputStream(System.out));
 
  int n = sc.nextInt();
  int m = sc.nextInt();
  long arr1[] = sc.readLongArray(n);
  long arr2[] = sc.readLongArray(m);
 
  sort(arr1);
  int idx = 0;
  while (m-- > 0) {
   int value = (binarySearch(arr2[idx++], n, arr1)) + 1;
   out.print(value + " ");
  }
  out.close();
 }
 
 static int binarySearch(long val, int size, long[] arr) {
  int lo = 0, hi = size - 1, last_idx = -1;
  while (lo <= hi) {
   int mid = (lo + hi) / 2;
   if (arr[mid] <= val) {
    last_idx = mid;
    lo = mid + 1;
   } else if (arr[mid] > val)
    hi = mid - 1;
   else if (arr[mid] < val)
    lo = mid + 1;
  }
  return last_idx;
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
 
 static void sort(long a[]) {
  ArrayList<Long> list = new ArrayList<>();
  for (long i : a)
   list.add(i);
  Collections.sort(list);
  for (int i = 0; i < a.length; i++)
   a[i] = list.get(i);
 }
}