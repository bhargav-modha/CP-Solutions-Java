import java.util.Scanner;
 
public class A_Kefa_and_First_Steps
{
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        int num[] = new int[n];
        int count = 0, max = 0;
 
        for(int i=0;i<n;i++)
        {
            num[i] = sc.nextInt();
        }
 
        for(int i=0;i<n-1;i++)
        {
            if(num[i] <= num[i+1])
            {
                count++;
                if(count > max)
                    max = count;
            }
            else
            {
                count = 0;
                if(count > max)
                    max = count;
                continue;
            }
        }
 
        System.out.print(max+1);
    }
}