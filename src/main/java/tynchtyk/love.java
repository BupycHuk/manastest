package tynchtyk;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: S_K_Y
 * Date: 21.10.13
 * Time: 11:34
 * To change this template use File | Settings | File Templates.
 */
public class love {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n, m;
        String s1 = "love", s2="nolove";
        System.out.println("Сандарды  киргиз:");
        n = input.nextInt();
        m = input.nextInt();
        if(n == 6 || m == 6 || n - m == 6 || m - n == 6){
            System.out.println(s1);
        }
        else {
            System.out.println(s2);
        }

    }
}
