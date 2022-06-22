import java.util.Scanner;
 
public class A_Dubstep
{
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
        String arr[] = (sc.next()).split("WUB");
 
        for(String x:arr)
            if(!x.equals(""))
                System.out.print(x+" ");
    }
}