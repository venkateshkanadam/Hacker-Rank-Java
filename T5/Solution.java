import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                String s1=sc.next();
                int x=sc.nextInt();
                System.out.printf("%-15s%03d%n",s1,x);
                //%s is used to %-15s--> To ramove space for left side 15
				//%d is used to %03d --> To remove space after right add '0'.
            }
            System.out.println("================================");

    }
}



