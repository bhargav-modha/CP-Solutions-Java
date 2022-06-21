import java.util.Scanner;
 
public class A_Spy_Detected_
{
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            int i=1;
 
            for(int j=0;j<n;j++) arr[j]=sc.nextInt();
 
            if(arr[1]==arr[2] && arr[0]!=arr[1])
                System.out.println(i);
            else
            {
                for(i=1;i<=n;i++)
                    if(arr[i-1]!=arr[i])
                        break;
                System.out.println(i+1);
            }
        }
    }
}