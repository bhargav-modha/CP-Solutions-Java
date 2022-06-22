import java.util.Scanner;
 
public class A_In_Search_of_an_Easy_Problem
{
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
 
        boolean flag = false;
        int n = sc.nextInt();
 
        for(int i=0;i<n;i++)
        {
            if(sc.nextInt() == 1)
            {
                flag = true;
                System.out.print("HARD");
                break;   
            }
        }
        if(!flag)
            System.out.print("EASY");
    }
}