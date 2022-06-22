import java.util.Scanner;
 
public class A_Next_Round
{
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int sum=0 ,tot_ppl, kth_per;
        tot_ppl = sc.nextInt();
        kth_per = sc.nextInt()-1;
 
        int arr[] = new int[tot_ppl];
 
        for(int i=0;i<tot_ppl;i++)
        {
            arr[i] = sc.nextInt();
        }
 
        for(int i=0;i<tot_ppl;i++)
        {
            if(arr[i]>=arr[kth_per] && arr[i] != 0)
                sum++;
        }
        System.out.print(sum);
    }
}