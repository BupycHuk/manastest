/**
 * Created with IntelliJ IDEA.
 * User: Toshiba
 * Date: 21.10.13
 * Time: 12:53
 * To change this template use File | Settings | File Templates.
 */
import java.util.Scanner;
public class gcd1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1-санды киргиз:");
        int n = scanner.nextInt();
        System.out.println("1-санды киргиз:");
        int m = scanner.nextInt();

        System.out.println("Жообу:" + findGCD(n,m));
    }

    private static int findGCD(int n, int m) {
        if(m == 0){
            return n;
        }
        return findGCD(m, n%m);
    }
}
