
package pkg33;

import java.util.Scanner;

public class Main {

    
    public static void main(String[] args) 
 {
     Scanner read = new Scanner(System.in);
     int n = read.nextInt();
    int [] a; 
    a = new int [n];
    for (int i=0;i<n;i++)
        a[i]=read.nextInt();
    int max = 0;
    int min = 30000;
    for (int i=0;i<n;i++)
    {
      if (a[i]<min) min=a[i];
      if (a[i]>max) max=a[i];
    }
     System.out.println(min+" "+max);
     
    }
 }

