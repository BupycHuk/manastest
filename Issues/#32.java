package aa;
import java.util.Scanner;
public class Aa {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int [][] TikBurchtuuMassiv;
        int []b;
        System.out.println("Массивдин олчомун киргизиз");
        int n = input.nextInt();
        int m = input.nextInt();
        b = new int [m];
        TikBurchtuuMassiv = new int[n][m];
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                TikBurchtuuMassiv[i][j]=input.nextInt();
            }
        }
        for (int i=0;i<n;i++){
            b[i]=TikBurchtuuMassiv[i][0];
            for (int j=0;j<m-1;j++){
                TikBurchtuuMassiv[i][j]=TikBurchtuuMassiv[i][j+1];
            }
            TikBurchtuuMassiv[i][m-1]=b[i];
        }
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                System.out.print(TikBurchtuuMassiv[i][j]+" ");
            }
            System.out.println();
        }
    }
}