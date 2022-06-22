import java.util.Scanner;
 
public class B_Drinks
{
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
        double sum=0;
 
        int n = sc.nextInt();
 
        for(int i=0;i<n;i++)
        {
            sum += sc.nextInt();
        }
        System.out.printf("%.12f",sum/n);
    }
}