import java.util.*;
 
public class A_Choosing_Teams
{
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int time = sc.nextInt();
 
        int participants[] = new int[number];
 
        for(int i=0;i<number;i++)
            participants[i] = sc.nextInt();
        
        Arrays.sort(participants);
 
        int count = 0;
 
        for(int x:participants)
            if((x+time)<=5)
                count++;
 
        System.out.println(count/3);
    }
}