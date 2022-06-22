import java.util.Scanner;
 
public class A_Even_Odds
{
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long index = sc.nextLong();
 
        long mid = n/2;
    
        if(n%2 == 1)
            mid++;
 
        if(index<=mid)
           System.out.println((2*index)-1);
        else{
            index-=mid;
            System.out.println(2*index);
        }
    }
}