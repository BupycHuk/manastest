package javaapplication1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Imanali
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int a,b,c;
        a=input.nextInt();
        b=input.nextInt();
        c=input.nextInt();
        if(a<b+c){
            System.out.print("NO");
        }
        else{
            System.out.print("YES");
        }
    }
}