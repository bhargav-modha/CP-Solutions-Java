import java.util.Scanner;
 
public class A_Young_Physicist
{
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
        int sum[] = new int[3];
        boolean flag=false;
        int n = sc.nextInt();
 
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<3;j++)
            {
                sum[j] += sc.nextInt();
            }
        }
 
        for(int j=0;j<3;j++)
        {
            if(sum[j] != 0)
                flag = true;
        }
 
        System.out.print(flag?"NO":"YES");
    }
}