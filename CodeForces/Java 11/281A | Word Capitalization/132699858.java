import java.util.Scanner;
 
public class A_Word_Capitalization
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = (!((int)str.charAt(0) >= 65 && (int)str.charAt(0) <= 91)?((char)((int)str.charAt(0)-32))+str.substring(1, str.length()):str);
        System.out.print(str);
    }
}