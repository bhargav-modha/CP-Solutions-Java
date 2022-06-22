import java.io.*;
import java.util.*;
 
public class B_Amr_and_The_Large_Array {
 public static void main(String[] args) {
  MyScanner sc = new MyScanner();
  out = new PrintWriter(new BufferedOutputStream(System.out));
  int MAX_VALUE = (int) 1e6;
  int n = sc.nextInt();
  int[] front = new int[MAX_VALUE], rear = new int[MAX_VALUE];
  int[] cnt = new int[MAX_VALUE];
 
  int maxCnt = 0;
  for (int i = 1; i <= n; ++i) {
   int k = sc.nextInt() - 1;
   cnt[k]++;
   maxCnt = Math.max(maxCnt, cnt[k]);
   if (cnt[k] == 1)
    front[k] = i;
   rear[k] = i;
  }
 
  int minIndex = -1;
  for (int i = 0; i < MAX_VALUE; ++i)
   if (cnt[i] == maxCnt)
    if (minIndex == -1 || (rear[minIndex] - front[minIndex] > rear[i] - front[i]))
     minIndex = i;
 
  out.println(front[minIndex] + " " + rear[minIndex]);
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
 
 static void dfs(int root, boolean[] vis, int[] value, ArrayList[] gr, int prev) {
  vis[root] = true;
  value[root] = 3 - prev;
  prev = 3 - prev;
  for (int i = 0; i < gr[root].size(); i++) {
   int next = (int) gr[root].get(i);
   if (!vis[next])
    dfs(next, vis, value, gr, prev);
  }
 }
 
 static boolean isPrime(int n) {
  for (int i = 2; i * i <= n; i++)
   if (n % i == 0)
    return false;
  return true;
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
 
 static long pow(long n, long m) {
  if (m == 0)
   return 1;
  long temp = pow(n, m / 2);
  long res = ((temp * temp) % mod);
  if (m % 2 == 0)
   return res;
  return (res * n) % mod;
 }
 
 static class Pair {
  int u, v;
 
  Pair(int u, int v) {
   this.u = u;
   this.v = v;
  }
 
  static void sort(Pair[] coll) {
   List<Pair> al = new ArrayList<>(Arrays.asList(coll));
   Collections.sort(al, new Comparator<Pair>() {
    public int compare(Pair p1, Pair p2) {
     return p1.u - p2.u;
    }
   });
   for (int i = 0; i < al.size(); i++) {
    coll[i] = al.get(i);
   }
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
 
 static void sort(long a[]) {
  ArrayList<Long> list = new ArrayList<>();
  for (long i : a)
   list.add(i);
  Collections.sort(list);
  for (int i = 0; i < a.length; i++)
   a[i] = list.get(i);
 }
 
 static int[] array(int n, int value) {
  int a[] = new int[n];
  for (int i = 0; i < n; i++)
   a[i] = value;
  return a;
 }
}