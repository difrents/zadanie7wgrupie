package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {




        //dodawanie i dzielenie
	// write your code here
    }

    public static int dodawanie(){
        System.out.println("Wybrałeś dodawanie"+"\n"+"Podaj dwie liczby, które chcesz do siebie dodać");
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner1.nextInt();

        return a+b;
    }

    public static double dzielenie(){
        System.out.println("Wybrałeś dzielenie"+"\n"+"Podaj dwie liczby, które chcesz podzielić(Najpierw dzielną, następnie dzielnik)");
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        double a = scanner.nextInt();
        double b = scanner1.nextInt();

        return a/b;
    }

}
