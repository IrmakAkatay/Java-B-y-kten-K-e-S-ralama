import java.io.FilterOutputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, c;
        Scanner inp = new Scanner(System.in);

        System.out.print("1.Sayıyı Giriniz :");
        a = inp.nextInt();

        System.out.print("2.Sayıyı Giriniz :");
        b = inp.nextInt();

        System.out.print("3.Sayıyı Giriniz :");
        c = inp.nextInt();

        if (a > b && a > c) {
            if (b > c) {
                System.out.print("a > b > c");
            } else {
                System.out.print("a > c > b");
            }
        } else if ((b > a) && (b > c)) {
            if (a > c) {
                System.out.print("b > a > c");
            } else {
                System.out.print("b > c > a");

            }
        }else if(c>b && c>a){
            if(b>a){
                System.out.print("c > b > a");
            }
        }else {
            System.out.print("c > a >b");
        }
    }
}