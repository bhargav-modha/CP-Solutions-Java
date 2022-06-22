import java.util.Scanner;
 
public class A_Holiday_Of_Equality
{
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = Integer.MIN_VALUE;
        int citizens[] = new int[n];
 
        for(int i=0;i<n;i++)
        {   
            citizens[i] = sc.nextInt();
            max = Math.max(max,citizens[i]);
        }
        int temp = 0;
 
        for(int i=0;i<n;i++)
            temp += max-citizens[i];
 
        System.out.print(temp);
    }
}