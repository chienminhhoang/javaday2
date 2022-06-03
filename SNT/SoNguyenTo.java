package SNT;
import java.util.Scanner;

public class SoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner= new Scanner (System.in);
        int a;
        System.out.println("nhap so a de ban oi:");

        a= scanner.nextInt();
        if( a<2 ) {
            System.out.println("day khong phai la so nguyen to");
        }
        else{ int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(a)) {
                if (a % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check)
                System.out.println(a + " is a prime");
            else
                System.out.println(a + " is not a prime");
        }
    }
}
