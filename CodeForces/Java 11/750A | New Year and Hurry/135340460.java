import java.util.Scanner;
 
public class A_New_Year_and_Hurry
{
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
        int no_of_problems = sc.nextInt();
        int minutes = 240 - sc.nextInt();
 
        int i=1;
 
        while(minutes>=5)
        {
            if(minutes<(i*5))
                break;
            minutes = minutes - (i*5);
            i++;
        }
        System.out.println(i>no_of_problems?no_of_problems:i-1);
    }
}