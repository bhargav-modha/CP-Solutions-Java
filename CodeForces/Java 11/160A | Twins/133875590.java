import java.util.Scanner;
 
public class A_Twins
{
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        int coins[] = new int[no];
        int sum=0, take=0, count=0;
 
        for(int i=0;i<no;i++)
        {
            coins[i] = sc.nextInt();
            sum += coins[i];
        }
 
        for(int i=0;i<no;i++)
        {
            for(int j=i+1;j<no;j++)
            {
                if(coins[j] > coins[i])
                {
                    int temp = coins[i];
                    coins[i] = coins[j];
                    coins[j] = temp;
                }
            }
        }
 
        for(count=0;count<no;count++)
        {
            take += coins[count];
            sum -= coins[count];
 
            if(take > sum)
                break;
        }
        System.out.print(count+1);
    }
}