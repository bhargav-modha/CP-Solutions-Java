import java.io.*;
import java.util.*;
 
import javax.swing.text.Segment;
 
public class B_Integers_Shop {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int t = sc.nextInt();
        while (t-- > 0) {
            int segments = sc.nextInt();
            int l[] = new int[segments], r[] = new int[segments];
            long c[] = new long[segments];
 
            for (int i = 0; i < segments; i++) {
                l[i] = sc.nextInt();
                r[i] = sc.nextInt();
                c[i] = sc.nextLong();
            }
 
            int min[] = new int[segments];
            Arrays.fill(min, Integer.MAX_VALUE);
            int[] max = new int[segments];
            min[0] = l[0];
            max[0] = r[0];
 
            for (int i = 1; i < segments; i++) {
                min[i] = min[i - 1];
                max[i] = max[i - 1];
                min[i] = Math.min(min[i], l[i]);
                max[i] = Math.max(max[i], r[i]);
            }
 
            Map<Integer, Long> left = new HashMap<>();
            Map<Integer, Long> right = new HashMap<>();
            Map<Pair, Long> map = new HashMap<>();
            left.put(l[0], c[0]);
            right.put(r[0], c[0]);
            map.put(new Pair(l[0], r[0]), c[0]);
            out.println(c[0]);
            for (int i = 1; i < segments; i++) {
                left.put(l[i], Math.min(c[i], left.getOrDefault(l[i], Long.MAX_VALUE)));
                right.put(r[i], Math.min(c[i], right.getOrDefault(r[i], Long.MAX_VALUE)));
                map.put(new Pair(l[i], r[i]), Math.min(c[i], map.getOrDefault(new Pair(l[i], r[i]), Long.MAX_VALUE)));
                long res = left.get(min[i]) + right.get(max[i]);
                if (map.containsKey(new Pair(min[i], max[i]))) {
                    res = Math.min(res, (map.get(new Pair(min[i], max[i]))));
                }
                out.println(res);
            }
        }
        out.close();
    }
 
    static class Pair {
        int l;
        int r;
        long x;
 
        Pair(int l, int r) {
            this.l = l;
            this.r = r;
        }
 
        @Override
        public boolean equals(Object o) {
            if (this == o)
                return true;
            if (o == null || getClass() != o.getClass())
                return false;
            Pair pair = (Pair) o;
            return l == pair.l && r == pair.r && x == pair.x;
        }
 
        @Override
        public int hashCode() {
            return Objects.hash(l, r, x);
        }
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