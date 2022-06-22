import java.util.*;
 
public class B_Gifts_Fixing
{
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while(t-- >0)
        {
            int len = sc.nextInt();
            int arr[][] = new int[2][len];
            int min_c = Integer.MAX_VALUE, min_o = Integer.MAX_VALUE;
            long count = 0;
 
            for(int i=0;i<len;i++) 
            {
                arr[0][i]=sc.nextInt();
                if(arr[0][i]<min_c)
                    min_c = arr[0][i];
            }
 
            for(int i=0;i<len;i++) 
            {
                arr[1][i]=sc.nextInt();
                if(arr[1][i]<min_o)
                    min_o = arr[1][i];
            }
 
            for(int i=0;i<len;i++) 
            {
                if(arr[0][i] > min_c && arr[1][i] > min_o)
                    count +=  (Math.abs((arr[0][i] - min_c)-(arr[1][i] - min_o))+(Math.min((arr[0][i] - min_c),(arr[1][i] - min_o))));
                else if(arr[0][i] > min_c)
                    count += (arr[0][i] - min_c);
                else if(arr[1][i] > min_o)
                    count += (arr[1][i] - min_o);
            }
 
            System.out.println(count);
        }
    }
}