import java.util.Scanner;
 
public class A_Design_Tutorial_Learn_from_Math
{
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
 
        outer:for(int i=1;i<num;i++)
        {
            for(int j=2;j<num;j++)
            {
                if((num-i)%j == 0 && (num-i)!=j)
                {
                    for(int k=2;k<num;k++)
                    if(i%k == 0 && i!=k)
                    {
                        System.out.println((num-i)+" "+i);
                        break outer;
                    }
                }
            }
        }
    }
}