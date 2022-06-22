import java.util.Scanner;
import java.util.Arrays;
 
public class A_Puzzles
{
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
        int students = sc.nextInt();
        int no_of_puzzles = sc.nextInt();
        int least = 9999;
 
        int puzzles[] = new int[no_of_puzzles];
 
        for(int i=0;i<no_of_puzzles;i++)
            puzzles[i] = sc.nextInt();
 
        Arrays.sort(puzzles);
 
        for(int i=0;i<puzzles.length;i++)
        {
            if(i+students > puzzles.length)
                break;
 
            if((puzzles[(i+students)-1]-puzzles[i])<least)
                least = puzzles[(i+students)-1]-puzzles[i];
        }
 
        System.out.println(least);
    }
}