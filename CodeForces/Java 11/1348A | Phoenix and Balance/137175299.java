import java.util.Scanner;
 
public class A_Phoenix_and_Balance
{
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int n = sc.nextInt(), sum = 0;
            int arr[] = new int[n];
 
            for(int i=0;i<n;i++)   arr[i] = (int)Math.pow(2,i+1);
 
            for(int i=(n/2)-1;i<arr.length;i++)
            {
                for(int j=i+1;j<arr.length;j++)
                {
                    if(arr[i]<arr[j])
                    {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
 
            for(int i=0;i<n;i++)
            {
                if(i<n/2)
                    sum += arr[i];
                else
                    sum -= arr[i];
            }
            System.out.println(sum);
        }
    }
}
/*
 
6->14 (6 hoi to 2)
2 4 8 16 32 64
2 4 64
16 32 8    
 
8->30 (8 hoi to 3)
2 4 8 16 32 64 128 256
16 32 64 128
2 4 8 256
 
10->62 (10 hoi to 4)
32 64 128 256 512
2 4 8 16 1024 
*/