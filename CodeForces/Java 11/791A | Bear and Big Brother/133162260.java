import java.util.Scanner;
 
public class A_Bear_and_Big_Brother
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int count=0;
 
        int bear = sc.nextInt();
        int brother = sc.nextInt();
 
        do
        {
            bear *= 3;
            brother *= 2;
            count++;
        }
        while(bear <= brother);
 
        System.out.print(count);
    }
}