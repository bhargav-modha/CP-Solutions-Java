import java.util.Scanner;
 
public class A_Boring_Apartments
{
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0)
        {
            int n = sc.nextInt(), sum=0, len = String.valueOf(n).length();
 
            for(int i=1;i<=(n%10);i++)
            {
                if(i != n%10)
                    for(int j=1;j<=4;j++)
                        sum += j;
                else
                    for(int j=1;j<=len;j++)
                        sum += j;
            }
            System.out.println(sum);
        }
    }
}