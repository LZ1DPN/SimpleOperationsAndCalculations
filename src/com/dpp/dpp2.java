package com.dpp;

import java.util.Scanner;

public class dpp2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Double valutaKol = Double.parseDouble(scanner.nextLine());
        Double valutaSource = scanner.nextLine();
        Double valutaDest = scanner.nextLine();

        Double bgn = 1;
        Double usd = 1.79549;
        Double eur = 1.95583;
        Double gbp = 2.53405;
        Double valutaExit = 0.0;

        if (valutaSource.equals("BGN") && valutaDest.equals("USD")){valutaExit = valutaKol / usd;}
        if (valutaSource.equals("BGN") && valutaDest.equals("EUR")){valutaExit = valutaKol / eur;}
        if (valutaSource.equals("BGN") && valutaDest.equals("GBP")){valutaExit = valutaKol / gbp;}

        if (valutaSource.equals("USD") && valutaDest.equals("BGN")){valutaExit = valutaKol * usd;}
        if (valutaSource.equals("EUR") && valutaDest.equals("BGN")){valutaExit = valutaKol * eur;}
        if (valutaSource.equals("BGP") && valutaDest.equals("BGN")){valutaExit = valutaKol * gbp;}

        System.out.printf("%.2f %s\n", valutaExit, valutaDest);
    }

}
