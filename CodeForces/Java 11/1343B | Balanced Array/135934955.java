import java.util.Scanner;
 
public class B_Balanced_Array
{
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while(t-- >0)
        {
            int len = sc.nextInt();
            if((len/2)%2 != 0)
                System.out.println("NO");
            else
            {
 
                int sum_even = 0, sum_odd = 0;
                int index = 0;
                System.out.println("YES");
 
                int even[] = new int[len/2];
                for(int i=2;i<=len;i=i+2)
                {
                    sum_even += i;
                    even[index] = i;
                    index++;
                }
                
                for(int x: even)
                    System.out.print(x+" ");
 
                for(int i=0;i<len/2;i++)
                {
                    if(i!=((len/2)-1))
                    {
                        System.out.print((even[i]-1)+" ");
                        sum_odd += even[i]-1;
                    }
                    else
                        System.out.print(sum_even-sum_odd);
                }
                System.out.println();
            }
        }
    }
}