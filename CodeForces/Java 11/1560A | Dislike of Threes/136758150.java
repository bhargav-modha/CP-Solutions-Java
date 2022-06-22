import java.util.Scanner;
 
public class A_Dislike_of_Threes
{
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(), j=0;
 
        int arr[] = new int[1000];
 
        for(int i=1;i<=1666;i++)
            if(!(i%3 == 0 || i%10== 3))
                arr[j++] = i;
 
        while(t-- >0)   System.out.println(arr[sc.nextInt()-1]);
    }
}