import java.util.*;
 
public class A_Games
{
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
 
        int home[] = new int[sc.nextInt()];
        int away[] = new int[home.length];
 
        for(int i=0;i<home.length;i++)
        {
            home[i] = sc.nextInt();
            away[i] = sc.nextInt();
        }
 
        int count = 0;
 
        for(int i=0;i<home.length;i++)
            for(int j=0;j<away.length;j++)
                if(home[i] == away[j])
                    count++;
 
        System.out.print(count);
    }
}