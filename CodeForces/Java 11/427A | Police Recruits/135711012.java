import java.util.Scanner;
 
public class A_Police_Recruits
{
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int police = 0, crime = 0;
 
        while(n-- >0)
        {
            int temp = sc.nextInt(); 
            if(temp == -1 && police>0)
                    police--;
            else if(temp == -1 && police <= 0)
                    crime++;
            else
                police += temp;
        }
 
        System.out.print(crime);
    }
}