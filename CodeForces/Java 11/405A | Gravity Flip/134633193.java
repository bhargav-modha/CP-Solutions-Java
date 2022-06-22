import java.util.Scanner;
import java.util.Arrays;
 
public class A_Gravity_Flip
{
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
        int col = sc.nextInt();
 
        int heights[] = new int[col];
 
        for(int i=0;i<col;i++)
            heights[i] = sc.nextInt();
 
        Arrays.sort(heights);
 
        for(int x:heights)
            System.out.print(x+" ");
    }
}