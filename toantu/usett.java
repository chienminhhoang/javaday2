package toantu;

import java.util.Scanner;

public class usett {
    public static void main(String[] args) {
        float a,b;
        System.out.println("nhap chieu dai di ban");
        Scanner scanner= new Scanner(System.in);
        a = scanner.nextFloat();
        System.out.println("nhap chieu rong di ban");
        b=scanner.nextFloat();
        float area= a*b;
        System.out.println("area react is:"+area);
    }
}
