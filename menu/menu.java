package menu;

import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        int choice=-1;
        Scanner scanner= new Scanner (System.in);
     while (choice != 0){
         System.out.println("Menu");
         System.out.println("1. draw the triangle");
         System.out.println("2. draw the square");
         System.out.println("3. draw the rectangle");
         System.out.println("0. Exit");
         System.out.println("Enter u choice");
         choice= scanner.nextInt();
      switch(choice){
          case 1:
              System.out.println("draw the triang le");
              for (int i = 7; i >= 1 ; i --) {
                  for (int j = 0; j <i ; j++) {
                      System.out.printf("*");

                  }
                  System.out.println("\n");
              }

              break;
          case 2:
              System.out.println("draw the square");
              for (int i = 0; i <=6 ; i++) {
                  for (int j = 0; j <=6 ; j++) {
                      System.out.printf("  *");
                  }
                  System.out.println(" ");
              }
              break;
          case 3:
              System.out.println("draw the rectangle");
              for (int i = 0; i <4 ; i ++) {
                  for (int j = 0; j <=6 ; j++) {
                      System.out.printf(" *");

                  }
                  System.out.println(" ");
              }

              break;

          case 0: System.exit(0);
          default:
              System.out.printf("no choice");
      }

    }
}}
