import java.util.Scanner;
 
public class A_Petya_and_Strings
{
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
        String sen1 = sc.nextLine();
        String sen2 = sc.nextLine();
 
        sen1 = sen1.toLowerCase();
        sen2 = sen2.toLowerCase();
 
        if(sen1.compareTo(sen2)==0)
            System.out.print("0");
        else if(sen1.compareTo(sen2) > 0)
            System.out.print("1");
        else if(sen1.compareTo(sen2) < 0)
            System.out.print("-1");
    }
}