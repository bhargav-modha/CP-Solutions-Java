import java.util.*;
 
public class A_IQ_test
{
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int number = 0, count = 0, e_index = 0, o_index = 0;
 
        for(int i=1;i<=n;i++)
        {
            number = sc.nextInt();
            if(number%2 == 0)
            {
                count++;
                e_index = i;
            }
            else
            {
                count--;
                o_index = i;
            }
        }
        System.out.println(count>0?o_index:e_index);
    }
}