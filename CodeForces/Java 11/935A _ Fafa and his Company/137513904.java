import java.util.Scanner;
 
public class A_Fafa_and_his_Company
{
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int n = sc.nextInt();
 
        for(int i=1;i<n;i++)
            if(n%i == 0)
                count++;
 
        System.out.print(count);
    }
}