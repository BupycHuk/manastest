/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

import java.util.Scanner;

/**
 *
 * @author Imanali
 */
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers1 =new int[90];
        int[] numbers2 =new int[90];
        int n;
        n=input.nextInt();
        for(int i=0;i<n;i++){
            System.out.print("A [ "+(i+1)+" ] = ");
            numbers1[i]=input.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print("B [ "+(i+1)+" ] = ");
            numbers2[i]=input.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.println("A [ "+i+" ] * B [" + (i+1) + "] ="+numbers1[i]*numbers2[i]);
        }
    }
}
