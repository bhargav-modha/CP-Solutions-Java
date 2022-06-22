import java.util.Scanner;
 
public class A_Beautiful_Matrix
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int matrix[][] = new int[5][5];
        int temp_r=-1, temp_c=-1;
 
        for(int r=0;r<5;r++)
        {
            for(int c=0;c<5;c++)
            {
                matrix[r][c] = sc.nextInt();
                if(matrix[r][c] == 1 )
                {
                    temp_c = c;
                    temp_r = r;
                    break;
                }
            }
        }
 
            System.out.print(Math.abs(temp_r-2) + Math.abs(temp_c-2));
    }
}