import java.util.Scanner;
 
public class B_Taxi
{
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
 
        int c1 = 0, c2 = 0, c3 = 0, c4 = 0, taxi = 0;
 
        for(int i=0;i<n;i++)
        {
            switch(sc.nextInt())
            {
                case 1:
                    c1++;
                    break;
                case 2:
                    c2++;
                    break;
                case 3:
                    c3++;
                    break;
                case 4:
                    c4++;
                    break;
            }
        }
        taxi = c4 + c3 + c2/2;
        c1 -= c3;
 
        if(c1 < 0)
            c1 = 0;
 
        if(c2%2 == 0)
            c2 = 0;
        else
            c2 = 1;
 
        c1 += c2*2;
 
        if(c1%4 == 0)
            taxi += c1/4;
        else
            taxi += c1/4+1;
        
        System.out.print(taxi);
    }
}