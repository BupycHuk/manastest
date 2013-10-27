package javaapplication1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class JavaApplication1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        Byte[] b = new Byte[n];
        for(int i=0;i<n;i++){
            b[i]=input.nextByte();
        }
        Arrays.sort(b);

        List<Byte> asList = Arrays.asList(b);
        List<Byte> l = new LinkedList<Byte>(asList);
        l.remove(0);
        Byte[] res = (Byte[]) l.toArray(new Byte[l.size()]);
        System.out.println("result array "+
        Arrays.toString(res));
    }

}