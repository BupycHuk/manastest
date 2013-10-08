package issue_17;
import java.util.Arrays;
import java.util.Scanner;
class Vowels
{
    private String str,result="";
    private int size;
    public void setStr(String sap)
    {
        this.str=sap;
        this.size=str.length();
    }
    public String getStr()
    {
        return result;
    }
    
    public void searchVowels()
    {
        for(int i=0;i<size;i++)
        {
            char ch  =str.charAt(i);
            switch(ch)
            {
                case 'A': result+=ch;break;
                case 'O': result+=ch;break;
                case 'I': result+=ch;break;
                case 'U': result+=ch;break;
                case 'E': result+=ch;break;
                case 'a': result+=ch;break;
                case 'o': result+=ch;break;
                case 'i': result+=ch;break;
                case 'u': result+=ch;break;
                case 'e': result+=ch;break;
            }
        }
    }
    public void sortStr()
    {
        char[] chars = result.toCharArray();
        Arrays.sort(chars);
        String sorted = new String(chars);
        result=sorted;
    }
}
public class Issue_17 
{
    public static void main(String[] args) 
    {
        String sap;
        Vowels object = new Vowels();
        Scanner input = new Scanner(System.in);
        sap = input.nextLine();
        object.setStr(sap);
        object.searchVowels();
        object.sortStr();
        System.out.println(object.getStr());
        
    }
}
