import java.util.Scanner;
 
public class A_Buy_a_Shovel
{
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();
        int coin = sc.nextInt();
 
        int i = 1;
        if((price%10) == coin || (price%10) == 0)
            System.out.print("1");
        else
        {
            for(i=1;i<9;i++)
            {
                if(((price * i)%10) == coin || ((price * i)%10) == 0)
                    break;
            }
            System.out.print(i);
        }
    }
}