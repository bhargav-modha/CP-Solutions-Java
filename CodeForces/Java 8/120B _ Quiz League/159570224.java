import java.io.*;
import java.util.*;
 
public class B_Quiz_League {
 public static void main(String[] args) throws IOException {
  BufferedReader in = new BufferedReader(new FileReader("input.txt"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));
        StringTokenizer st = new StringTokenizer(in.readLine());
 
  int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken()) - 1, arr[] = new int[n];
  st = new StringTokenizer(in.readLine());
  for (int i = 0; i < arr.length; i++)
   arr[i] = Integer.parseInt(st.nextToken());
 
  while (arr[k] == 0)
   k = (k + 1) % n;
  out.print(k + 1);
  out.close();
  in.close();
 }
}