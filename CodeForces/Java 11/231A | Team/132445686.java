import java.util.Scanner;
 
public class A_Team
{
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int choice, sum=0;
 
        for(int i=0;i<num;i++)
        {
            choice = 0;
            for(int j=0;j<3;j++){
                choice += sc.nextInt();
            }
            if(choice>=2)
                sum++;
        }
 
        System.out.print(sum);
    }
}