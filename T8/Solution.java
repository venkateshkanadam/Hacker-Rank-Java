import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int lines =1;
        while(true)
        {
            String s = sc.nextLine();
            System.out.println(lines+" "+s);
            lines++;
            if(!sc.hasNext())
            {
                break;
            }
        }
     
         
    }
}