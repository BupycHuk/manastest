package issue;

import java.util.Scanner;

class koshu
{
   // public int n,m;
    
    public void summa (int n , int m)
    {
        
        System.out.println(n+m);
    }
}
public class Issue {
    public static void main(String[] args) 
    {
        koshu object=new koshu();
        int a,b;
        Scanner input = new Scanner(System.in);
        a=input.nextInt();
        b=input.nextInt();
        object.summa(a,b);
     }
}
