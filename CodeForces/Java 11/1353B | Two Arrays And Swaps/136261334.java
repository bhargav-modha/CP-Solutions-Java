import java.util.*;
 
public class B_Two_Arrays_And_Swaps
{
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while(t-- >0)
        {
            int n = sc.nextInt();
            int swaps = sc.nextInt();
            int sum = 0;
 
            int a[] = new int[n];
            int b[] = new int[n];
 
            for(int i=0;i<n;i++)
                a[i] = sc.nextInt();
            
            for(int i=0;i<n;i++)
                b[i] = sc.nextInt();
 
            Arrays.sort(a);
            Arrays.sort(b);
 
            for(int i=0;i<swaps;i++)
            {
                if(a[i] >= b[(n-1)-i])
                    break;
                    
                int temp = a[i];
                a[i] = b[(n-1)-i];
                b[(n-1)-i] = temp;
            }    
 
            for(int x:a)
                sum += x;
                
            System.out.println(sum);
        }
    }
}