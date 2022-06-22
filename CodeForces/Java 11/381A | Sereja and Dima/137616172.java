import java.util.*;
 
public class A_Sereja_and_Dima
{
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
 
        for(int i=0;i<n;i++)    arr[i]=sc.nextInt();
 
        int front = 0, rear = n-1;
        int sereja = 0, dima = 0;
 
        for(int i = 0; front != rear+1; i++)
        {
            if(i%2 == 0)
            {
                if(arr[front] > arr[rear])
                {
                    sereja += arr[front];
                    front++;
                }
                else
                {
                    sereja += arr[rear];
                    rear--;
                }
            }
            else
            {
                if(arr[front] > arr[rear])
                {
                    dima += arr[front];
                    front++;
                }
                else
                {
                    dima += arr[rear];
                    rear--;
                }
            }
        }
        System.out.print(sereja+" "+dima);
    }
}