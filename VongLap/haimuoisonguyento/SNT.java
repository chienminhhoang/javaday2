package VongLap.haimuoisonguyento;

import java.util.Scanner;

public class SNT {
    public static void main(String[] args) {
        System.out.println("nhap so snt can in ra di ban oi");
        Scanner scanner = new Scanner (System.in);
        int a = scanner.nextInt();
        System.out.println("nhung so nguyen to dau tien la:");
        int count=0;
        int i=2;
       while (count<a){
           if(LaSoNguYenTo(i)){
               System.out.println(i+"");
              count++;
           } i++;

       }

    }
    public static boolean LaSoNguYenTo (int a) {
           if(a<2){
               System.out.println("day khong phai la so nguyen to");
            return  false;
           }
           int SquareRoot = (int) Math.sqrt(a);
        for (int i = 2; i <SquareRoot ; i++) {
            
            if (a % i == 0) {
                return false;

            }
        }
            return true;

    }
}
