package com.dpp;

import java.util.Scanner;

public class dpp36_rectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String town = scanner.nextLine().toLowerCase();
        Double x1 = Double.parseDouble(scanner.nextLine());
        Double y1 = Double.parseDouble(scanner.nextLine());
        Double x2 = Double.parseDouble(scanner.nextLine());
        Double y2 = Double.parseDouble(scanner.nextLine());
        Double x = Double.parseDouble(scanner.nextLine());
        Double y = Double.parseDouble(scanner.nextLine());

        if (((x==x1) || (x==x2)) && ((y1<=y) && (y<=y2))) {
            System.out.println("Border");
        }

        if (((y==y1) || (y==y2)) && ((x1<=x) && (x<=x2))){
            System.out.println("Border");
        }

        if (((x1<x) && (x<x2)) && ((y1<y) && (y<y2))){
            System.out.println("Inside");
        } else if(((x1>x) || (x>x2)) && ((y1>y) || (y>y2))){
            System.out.println("Outside");
        }
    }
}
