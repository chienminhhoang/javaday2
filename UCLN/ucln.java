package UCLN;

import java.util.Scanner;

public class ucln {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("nhap so a vao ban oi");
        int a= scanner.nextInt();
        System.out.println("nhp so b vao di ban");
        int b=scanner.nextInt();
        a= Math.abs(a);
        b= Math.abs(b); // gia tri tuyet doi.
        if (a ==0 || b==0){
            System.out.println("khong co uoc chung lon nhat");
        }
        while (a != b){
            if(a > b){
                a= a -b;
            }
            else
                b=b-a;

        }

        System.out.println("uoc chung lon nhat la '"+a +"'" );


    }
}
