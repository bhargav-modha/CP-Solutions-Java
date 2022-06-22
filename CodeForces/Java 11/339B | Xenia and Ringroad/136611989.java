import java.util.*;
 
public class B_Xenia_and_Ringroad
{
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
        int houses = sc.nextInt();
        int tasks = sc.nextInt();
 
        int arr_tasks[] = new int[tasks];
        for(int i=0;i<tasks;i++) arr_tasks[i]=sc.nextInt();
 
        long result = arr_tasks[0]-1;
 
        for(int i=1;i<tasks;i++)
        {
            if(arr_tasks[i]>=arr_tasks[i-1])
                result += (arr_tasks[i]-arr_tasks[i-1]);
            else
                result += (houses-(arr_tasks[i-1]-arr_tasks[i]));
        }
 
        System.out.println(result);
    }
}