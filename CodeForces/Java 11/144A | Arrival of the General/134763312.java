import java.util.Scanner;
 
public class A_Arrival_of_the_General
{
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
 
        int total = sc.nextInt();
        int positions[] = new int[total];
        int max=-2147483648, min=2147483647, max_pos=0, min_pos=0, moves = 0;
 
        for(int i=0;i<total;i++)
        {
            positions[i] = sc.nextInt();
            if(positions[i] <= min)
            {
                min = positions[i];
                min_pos = i;
            }
 
            if(positions[i] > max)
            {
                max = positions[i];
                max_pos = i;
            }
        }
        if(min_pos<max_pos)  moves--;
 
        moves += Math.abs(max_pos)+Math.abs(total-1-min_pos);
        System.out.print(moves);
    }
}