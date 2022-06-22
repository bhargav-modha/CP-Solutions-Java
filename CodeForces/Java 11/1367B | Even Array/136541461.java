import java.util.Scanner;
 
public class B_Even_Array
{
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
        int t  = sc.nextInt();
 
        while(t-- >0)
        {
            int n = sc.nextInt();
            int odd = 0, even = 0;
            for(int i=0;i<n;i++)
            {
                int temp = sc.nextInt();
                if(i%2 != temp%2)
                {
                    if(temp%2 == 1) odd++;
                    else even++;
                }
            }
            System.out.println(odd == even?odd:-1);
        }
    }
}