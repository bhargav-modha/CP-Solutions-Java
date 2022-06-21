import java.io.*;
import java.util.*;
 
public class B_Little_Elephant_and_Magic_Square {
 public static void main(String[] args) {
  MyScanner sc = new MyScanner();
  out = new PrintWriter(new BufferedOutputStream(System.out));
 
  int matrix[][] = new int[3][3], sum = 0;
 
  for (int i = 0; i < 3; i++) {
   for (int j = 0; j < 3; j++) {
    matrix[i][j] = sc.nextInt();
    sum += matrix[i][j];
   }
  }
  int x = sum / 2;
  matrix[0][0] = x - (matrix[0][1] + matrix[0][2]);
  matrix[1][1] = x - (matrix[1][0] + matrix[1][2]);
  matrix[2][2] = x - (matrix[2][0] + matrix[2][1]);
  for (int i = 0; i < 3; i++) {
   for (int j = 0; j < 3; j++) {
    out.print(matrix[i][j] + " ");
   }
   out.println();
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
}