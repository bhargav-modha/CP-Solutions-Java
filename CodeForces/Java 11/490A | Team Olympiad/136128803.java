import java.util.Scanner;
 
public class A_Team_Olympiad
{
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int one = 0, two = 0, three = 0, min = 0;
 
        int students[][] = new int[2][n];
 
        for(int i=0;i<n;i++)
        {
            int temp = sc.nextInt();
            students[0][i] = temp;
            students[1][i] = i+1;
 
            switch(temp)
            {
                case 1:
                    one++;
                    break;
                case 2:
                    two++;
                    break;
                case 3:
                    three++;
                    break;
            }
        }
        min = Math.min(three,Math.min(one, two));
        System.out.println(min);
 
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(students[0][i] > students[0][j])
                {
                    int temp = students[0][i];
                    students[0][i] = students[0][j];
                    students[0][j] = temp;
 
                    temp = students[1][i];
                    students[1][i] = students[1][j];
                    students[1][j] = temp;
                }
            }
        }
 
        for(int i=0;i<min;i++)
        {
            System.out.print(students[1][i]+" ");
            System.out.print(students[1][i+(one)]+" ");
            System.out.print(students[1][i+(one+two)]+" ");
            System.out.println();
        }
    }
}