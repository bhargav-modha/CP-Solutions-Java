import java.util.Scanner;
 
public class A_The_New_Year_Meeting_Friends
{
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
        int positions[] = new int[3];
        
        for(int i=0;i<3;i++)
            positions[i] = sc.nextInt();
 
        for(int i=0;i<positions.length;i++)
        {
            for(int j=i+1;j<positions.length;j++)
                {
                    if(positions[i] > positions[j])
                    {
                        int temp = positions[i];
                        positions[i] = positions[j];
                        positions[j] = temp;
                    }
                }
        }
        System.out.print((positions[1]-positions[0])+(positions[2]-positions[1]));
    }
}