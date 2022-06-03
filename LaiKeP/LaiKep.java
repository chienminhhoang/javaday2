package LaiKeP;
import java.util.Scanner;
public class LaiKep {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        double money=1.0;
        int month=1;
        double Profit= 1.0;
        System.out.println("nhap so tien vao di:");
        money= scanner.nextDouble();
        System.out.println("nhap so thang");
        month= scanner.nextInt();
        System.out.println("nhap lai suat");
        Profit= scanner.nextDouble();
        double totalProfit=0;
        for (int i = 0; i <month ; i++) {
            totalProfit += money *(Profit/100)/12 * month;


        }
        System.out.println("total of profit ="+ totalProfit);
    }
}
