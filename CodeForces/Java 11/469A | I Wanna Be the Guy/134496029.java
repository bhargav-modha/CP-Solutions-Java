import java.util.Scanner;
import java.util.Arrays;
 
public class A_I_Wanna_Be_the_Guy
{
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l1 = sc.nextInt();
        int temp = 0;
 
        boolean arr[] = new boolean[n];
        for(int i=0;i<l1;i++)
        {
            temp = sc.nextInt();
            arr[temp-1] = true;
        }
        
        int l2 = sc.nextInt();
        for(int i=0;i<l2;i++)
        {
            temp = sc.nextInt();
            arr[temp-1] = true;
        }
        
        boolean ans = true;
        for(int i=0;i<arr.length;i++)
        {
            ans = ans & arr[i];
        }
 
        System.out.print((ans)?"I become the guy.":"Oh, my keyboard!");
    }
}