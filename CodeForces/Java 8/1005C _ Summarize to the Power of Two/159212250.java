import java.io.*;
import java.security.KeyStore.Entry;
import java.util.*;
 
public class C_Summarize_to_the_Power_of_Two {
 public static void main(String[] args) {
  MyScanner sc = new MyScanner();
  out = new PrintWriter(new BufferedOutputStream(System.out));
  int n = sc.nextInt();
  long arr[] = sc.readLongArray(n);
  sort(arr);
  HashMap<Long, Integer> map = new HashMap<Long, Integer>();
  for(long e : arr)map.put(e, map.getOrDefault(e, 0)+1);
  int ans = 0;
 
  for(int i = 0; i<n; i++) {
   long val = arr[i];
   for(int j = 0; j<=33; j++) {
    long mm = 1L<<j;
    if(map.containsKey(mm-val)) {
     if(mm-val == val && map.get(mm-val) == 1)continue;
     ans++;
     break;
    }
   }
  }
  out.println(n-ans);
  out.close();
 }
 
 public static PrintWriter out;
 public static long mod = (long) 1e9 + 7;
 public static int[] parent = new int[101];
 public static int[] rank = new int[101];
 
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
 
  int[][] readArrayMatrix(int N, int M, int Index) {
   if (Index == 0) {
    int[][] res = new int[N][M];
    for (int i = 0; i < N; i++) {
     for (int j = 0; j < M; j++)
      res[i][j] = (int) nextLong();
    }
    return res;
   }
   int[][] res = new int[N][M];
   for (int i = 1; i <= N; i++) {
    for (int j = 1; j <= M; j++)
     res[i][j] = (int) nextLong();
   }
   return res;
  }
 
  long[][] readArrayMatrixLong(int N, int M, int Index) {
   if (Index == 0) {
    long[][] res = new long[N][M];
    for (int i = 0; i < N; i++) {
     for (int j = 0; j < M; j++)
      res[i][j] = nextLong();
    }
    return res;
   }
   long[][] res = new long[N][M];
   for (int i = 1; i <= N; i++) {
    for (int j = 1; j <= M; j++)
     res[i][j] = nextLong();
   }
   return res;
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
 
 private static void google(int tt) {
  out.print("Case #" + (tt) + ": ");
 }
 
 public static int lower_bound(int[] arr, int x) {
  int low = 0, high = arr.length - 1, mid = -1;
  int ans = -1;
  while (low <= high) {
   mid = (low + high) / 2;
   if (arr[mid] > x) {
    high = mid - 1;
   } else {
    ans = mid;
    low = mid + 1;
   }
  }
  return ans;
 }
 
 public static int upper_bound(int[] arr, int x) {
  int low = 0, high = arr.length - 1, mid = -1;
  int ans = arr.length;
  while (low < high) {
   mid = (low + high) / 2;
   if (arr[mid] >= x) {
    ans = mid;
    high = mid - 1;
   } else {
    low = mid + 1;
   }
  }
  return ans;
 }
 
 static void reverseArray(int[] a) {
  int n = a.length;
  int arr[] = new int[n];
  for (int i = 0; i < n; i++)
   arr[i] = a[n - i - 1];
  for (int i = 0; i < n; i++)
   a[i] = arr[i];
 }
 
 static void reverseArray(long[] a) {
  int n = a.length;
  long arr[] = new long[n];
  for (int i = 0; i < n; i++)
   arr[i] = a[n - i - 1];
  for (int i = 0; i < n; i++)
   a[i] = arr[i];
 }
 
 public static void push(TreeMap<Integer, Integer> map, int k, int v) {
  if (!map.containsKey(k))
   map.put(k, v);
  else
   map.put(k, map.get(k) + v);
 }
 
 public static void pull(TreeMap<Integer, Integer> map, int k, int v) {
  int lol = map.get(k);
  if (lol == v)
   map.remove(k);
  else
   map.put(k, lol - v);
 }
 
 static int[][] matrixMul(int[][] a, int[][] m) {
  if (a[0].length == m.length) {
   int[][] b = new int[a.length][m.length];
   for (int i = 0; i < m.length; i++) {
    for (int j = 0; j < m.length; j++) {
     int sum = 0;
     for (int k = 0; k < m.length; k++) {
      sum += m[i][k] * m[k][j];
     }
     b[i][j] = sum;
    }
   }
   return b;
  }
  return null;
 }
 
 static void swap(int[] a, int l, int r) {
  int temp = a[l];
  a[l] = a[r];
  a[r] = temp;
 }
 
 static void SieveOfEratosthenes(int n, boolean prime[]) {
  prime[0] = false;
  prime[1] = false;
  for (int p = 2; p * p <= n; p++) {
   if (prime[p] == true)
    for (int i = p * p; i <= n; i += p)
     prime[i] = false;
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
  for (int i = 2; i <= Math.sqrt(n); i++)
   if (n % i == 0)
    return false;
  return true;
 }
 
 static boolean isPrime(long n) {
  for (long i = 2; i <= Math.sqrt(n); i++)
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
 
 static int ceil(int x, int y) {
  return (x % y == 0 ? x / y : (x / y + 1));
 }
 
 static long ceil(long x, long y) {
  return (x % y == 0 ? x / y : (x / y + 1));
 }
 
 static boolean isSquare(double a) {
  boolean isSq = false;
  double b = Math.sqrt(a);
  double c = Math.sqrt(a) - Math.floor(b);
 
  if (c == 0)
   isSq = true;
 
  return isSq;
 }
 
 static long sqrt(long z) {
  long sqz = (long) Math.sqrt(z);
  while (sqz * 1L * sqz < z) {
   sqz++;
  }
  while (sqz * 1L * sqz > z) {
   sqz--;
  }
  return sqz;
 }
 
 static double log2(long N) {
  double result = (Math.log(N) / Math.log(2));
  return result;
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
 
 static long modular_add(long a, long b) {
  return ((a % mod) + (b % mod)) % mod;
 }
 
 static long modular_sub(long a, long b) {
  return ((a % mod) - (b % mod) + mod) % mod;
 }
 
 static long modular_mult(long a, long b) {
  return ((a % mod) * (b % mod)) % mod;
 }
 
 public static long gcd(long a, long b) {
  if (a > b)
   a = (a + b) - (b = a);
  if (a == 0L)
   return b;
  return gcd(b % a, a);
 }
 
 public static long lcm(long a, long b) {
  return (a * b) / gcd(a, b);
 }
 
 static int gcd(int n1, int n2) {
  if (n2 != 0)
   return gcd(n2, n1 % n2);
  else
   return n1;
 }
 
 static int find(int u) {
  if (u == parent[u])
   return u;
  return parent[u] = find(parent[u]);
 }
 
 static void union(int u, int v) {
  int a = find(u), b = find(v);
 
  if (a == b)
   return;
 
  if (rank[a] > rank[b]) {
   parent[b] = a;
   rank[a] += rank[b];
  } else {
   parent[a] = b;
   rank[b] += rank[a];
  }
 }
 
 static void dsu() {
  for (int i = 0; i < 101; i++) {
   parent[i] = i;
   rank[i] = 1;
  }
 }
 
 static class Pair {
  int x, y;
 
  Pair(int x, int y) {
   this.x = x;
   this.y = y;
  }
 
  static void sortbyx(Pair[] coll) {
   List<Pair> al = new ArrayList<>(Arrays.asList(coll));
   Collections.sort(al, new Comparator<Pair>() {
    public int compare(Pair p1, Pair p2) {
     return p1.x - p2.x;
    }
   });
   for (int i = 0; i < al.size(); i++) {
    coll[i] = al.get(i);
   }
  }
 
  static void sortbyy(Pair[] coll) {
   List<Pair> al = new ArrayList<>(Arrays.asList(coll));
   Collections.sort(al, new Comparator<Pair>() {
    public int compare(Pair p1, Pair p2) {
     return p1.y - p2.y;
    }
   });
   for (int i = 0; i < al.size(); i++) {
    coll[i] = al.get(i);
   }
  }
 
  public String toString() {
   return String.format("(%s, %s)", String.valueOf(x), String.valueOf(y));
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
 
 static long sum(long a[]) {
  long sum = 0;
  for (long i : a)
   sum += i;
  return (sum);
 }
 
 static long count(long a[], long x) {
  long c = 0;
  for (long i : a)
   if (i == x)
    c++;
  return (c);
 }
 
 static int sum(int a[]) {
  int sum = 0;
  for (int i : a)
   sum += i;
  return (sum);
 }
 
 static int count(int a[], int x) {
  int c = 0;
  for (int i : a)
   if (i == x)
    c++;
  return (c);
 }
 
 static int count(String s, char ch) {
  int c = 0;
  char x[] = s.toCharArray();
  for (char i : x)
   if (ch == i)
    c++;
  return (c);
 }
 
 static int[] freq(int a[], int n) {
  int f[] = new int[n + 1];
  for (int i : a)
   f[i]++;
  return f;
 }
 
 static int[] pos(int a[], int n) {
  int f[] = new int[n + 1];
  for (int i = 0; i < n; i++)
   f[a[i]] = i;
  return f;
 }
 
 static boolean isPalindrome(String s) {
  StringBuilder sb = new StringBuilder();
  sb.append(s);
  String str = String.valueOf(sb.reverse());
  if (s.equals(str))
   return true;
  else
   return false;
 }
}