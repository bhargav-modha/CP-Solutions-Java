import java.util.Scanner;
 
public class A_Insomnia_cure
{
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
 
        int harm[] = new int[4];
 
        for(int i=0;i<harm.length;i++)  harm[i] = sc.nextInt();
 
        int total = sc.nextInt();
        boolean damage[] = new boolean[total+1];
 
        for(int x:harm) for(int i=1;i<=total;i++)    if(i%x == 0) damage[i] = true;
 
        int count = 0;
        for(boolean b:damage) if(b) count++;
 
        System.out.print(count);
    }
}