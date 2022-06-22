import java.util.Scanner;
 
public class A_Dragons
{
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
 
        int strength = sc.nextInt(); 
        int no_of_dragons = sc.nextInt();
        int dragon_strengths[] = new int[no_of_dragons];
        int bonus_strengths[] = new int[no_of_dragons];
 
        boolean pass = true;
 
        for(int i=0;i<no_of_dragons;i++) 
        {
            dragon_strengths[i] = sc.nextInt();
            bonus_strengths[i] = sc.nextInt();
        }
        
        for(int i=0;i<no_of_dragons;i++)
        {
            for(int j=i+1;j<no_of_dragons;j++)
            {
                if(dragon_strengths[i] > dragon_strengths[j])
                {
                    int temp = dragon_strengths[j];
                    dragon_strengths[j] = dragon_strengths[i];
                    dragon_strengths[i] = temp;
 
                    temp = bonus_strengths[j];
                    bonus_strengths[j] = bonus_strengths[i];
                    bonus_strengths[i] = temp;
                }
            }
        }
 
        for(int i=0;i<no_of_dragons;i++)
        {
            if(dragon_strengths[i]>=strength)
            {
                pass = false;
                break;
            }
            else
                strength += bonus_strengths[i];
        }
 
        if(pass) System.out.println("YES");
        else System.out.println("NO");
    }
}