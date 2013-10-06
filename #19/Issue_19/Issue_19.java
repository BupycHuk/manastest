package issue_19;

import java.util.Scanner;

class SummOfSquare {
    private int N,result;
        
    public int getResult(){
        return result;
    }
    public void setN(int n){
        if(n<=0){
            System.out.println("Бутун сан киргизиниз!!!");
            return;
        }
        this.N = n;
    }
    public void go(){
        for(int i=1;i<=N;i++){
            result+=(i*i);
        }
    }  
}

public class Issue_19 {
    public static void main(String[] args) {
        System.out.println("Кандайдыр бир бутун N санын киргизиниз");
        SummOfSquare ob = new SummOfSquare();
        int n;
        Scanner input =new Scanner(System.in);
        n=input.nextInt();
        ob.setN(n);
        ob.go();
        System.out.println("0 дон N ге чейинки сандардын квадраттарынын суммасы:  "+ob.getResult());
    }
}