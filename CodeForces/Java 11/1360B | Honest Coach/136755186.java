import java.util.*;
 
public class B_Honest_Coach
{
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0)
        {
            int len = sc.nextInt();
            int players[] = new int[len];
            int min = Integer.MAX_VALUE;
 
            for(int i=0;i<len;i++) players[i]=sc.nextInt();
            Arrays.sort(players);
 
            for(int i=len-1;i>0;i--)
                min = Math.min(min,players[i] - players[i-1]);
                
            System.out.println(min);
        }
    }
}