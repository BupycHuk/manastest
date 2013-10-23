package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Imanali
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n,q;
        int[] ar=new int[90];
        String s;
        Scanner input =new Scanner(System.in);
        s=input.nextLine();
        char[] toCharArray = s.toCharArray();
        for(int i=0;i<toCharArray.length;i++){
            ar[i]=toCharArray[i]-48;
        }
        for(int i=1;i<toCharArray.length;i++){
            for(int k=0;k<toCharArray.length-i;k++){
                if(ar[k]>ar[k+1]){
                    q = ar[k];
                    ar[k] = ar[k+1];
                    ar[k+1] = q;
                }
            }
        }
        //Large
        if(ar[0]!=0){
            for(int i=((toCharArray.length)-1);i>=0; --i){
                System.out.print(ar[i]);
            }
        }
        else{
            System.out.print(ar[1]+""+ar[0]);
            for(int i=2; i<toCharArray.length;i++){
                System.out.print(ar[i]);
            }
        }
        System.out.println();
        for(int i=((toCharArray.length)-1);i>=0; --i){
                System.out.print(ar[i]);
            }
    }
}