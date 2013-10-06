package issue_12;

import java.util.Scanner;

class KyskaUzunKyska 
{
    private String sap1,sap2,result;
    public String getStr()
    {
        return result;
    }
    public void setStr(String s1,String s2)
    {
        this.sap1 = s1;
        this.sap2 = s2;
    }
    public void CompareAndChange()
    {
        if(sap1.length()>sap2.length())
            result=sap2+sap1+sap2;
        else 
            result=sap1+sap2+sap1;
        return;
    }
}


public class Issue_12 
{
    public static void main(String[] args) 
    {
        KyskaUzunKyska ob = new KyskaUzunKyska();
        String str1,str2;
        Scanner input = new Scanner(System.in);
        System.out.println("эки сап киргизиниз");
        str1 = input.nextLine();
        str2 = input.nextLine();
        ob.setStr(str1,str2);
        ob.CompareAndChange();
        System.out.println(ob.getStr());
        
    }
}
