import java.util.Scanner;
 
public class A_Sum_of_Round_Numbers
{
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while(t-- >0)
        {
            int temp = sc.nextInt();
            if(temp<=9)
            {
                System.out.println("1");
                System.out.println(temp);
            }
            else
            {
                int count = 0;
                int digits[] = new int[5];
 
                for(int i=0;temp>0;i++)
                {
                    int rem = temp%10;
                    temp = temp/10;
 
                    if(rem != 0)
                        count++;
 
                    digits[i] = (int)Math.pow(10,i)*rem;
                }
 
                System.out.println(count);
                for(int x:digits)
                    if(x != 0)
                        System.out.print(x+"    ");
                System.out.println();
            }
        }
    }
}