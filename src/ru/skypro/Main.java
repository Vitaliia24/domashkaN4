package ru.skypro;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
	int i = 1;
    while (i <= 10) {
        System.out.print(i + " ");
        i++;
    }
        System.out.println("\n");
    for (int b= 10; b >= 1; b = b - 1) {
        System.out.print(b + " ");
    }
    }




    public static void main(String[] args) {

        for (int friday = 5; friday <=31; friday = friday + 7) {
            System.out.println("Сегодня пятница - " + friday + "-е число. Необходимо подготовить отчет");
        }
    }



    public static void main(String[] args) {

        int thisYear = 2021;
        int forTwoHandred = (thisYear - 200);
        int hundredYearsAfter = thisYear + 100;

        for (int i = 0; i < thisYear; i = i + 79) {
    if (i < forTwoHandred) continue;
    System.out.println(i);
}
        for (int i = 0; i < hundredYearsAfter; i = i + 79) {
            if (i < thisYear) continue;
            System.out.println(i);
        }
    }
}
