package issue_18;
import java.util.Scanner;
class fibonacci 
{
    private int result,x;
    
    public void setFib(int n)
    {
        this.x = n;
    }
    public int getFib()
    {
        return result;
    }
    public void searchFib()
    {
        if(x>=2)
        {
            int a=0,b=1;
            for(int i=2;i<=x;i++)
            {
                b=a+b;a=b-a;
            }
            result = b;
        }
        else result = x;
    }
}


public class Issue_18 
{
    public static void main(String[] args) 
    {
        int n;
        fibonacci fib = new fibonacci();
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        fib.setFib(n);
        
        fib.searchFib();
        System.out.println(fib.getFib());
    }
}
