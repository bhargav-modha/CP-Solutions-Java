import java.util.Scanner;
 
public class A_I_love__username_
{
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
        int max = 0, min = 0, count = 0;
        int n = sc.nextInt();
 
        int scores[] = new int[n];
        
        for(int i=0;i<n;i++)
            scores[i] = sc.nextInt();
 
        max = scores[0];
        min = scores[0];
 
        for(int x:scores)
        {
            if(x>max)
            {
                count++;
                max = x;
            }
            else if(x<min)
            {
                count++;
                min = x;
            }
        }
        System.out.print(count);
    }
}