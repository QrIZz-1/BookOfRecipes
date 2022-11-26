package com.QrIzZ.bookOfRecipes;

import java.util.Scanner;

public class mainMenu {
    static  final  String RESET = "\u001b[0m";
    static  final  String BLACk = "\u001b[30m";
    static  final  String RED = "\u001b[31m";
    static  final  String GREEN = "\u001b[32m";
    static  final  String YELLOW = "\u001b[33m";
    static  final  String BLUE = "\u001b[34m";
    static  final  String PURPLE = "\u001b[35m";
    static  final  String CYAN = "\u001b[36m";
    static  final  String WHITE = "\u001b[37m";

    public  static  void  main1(String[] args)
    {
        print(BLUE);
        print(BLUE);
        print(BLUE);
        print(BLUE);
        print(YELLOW);
        print(YELLOW);
        print(YELLOW);
        print(YELLOW);
    }

    public static  void print (String color) {
        for (int i = 0; i < 30; i++) {
            System.out.println(color + "\u058D");
        }
        System.out.println();
    }


    public static void autorization() {
        System.out.println("");
    }

    public static void registration() {
        System.out.println("");
    }
    public static void viewRecipes() {
        System.out.println("");
    }

    public static void menuPrint() {
        System.out.println("<<[1]>> - --Авторизація;--");
        System.out.println("<<[2]>> - --Реєстрація;--");
        System.out.println("<<[3]>> - --Перегляд рецептів;--");
    }

    public static void menuChoice(int numMenu) {
        switch (numMenu) {
            case 1 : autorization();
                break;
            case 2 : registration();
                break;
            case 3 : viewRecipes();
                break;
            default:
                System.out.println("Не понятно!");
        }
    }

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        menuPrint();
        while (userInput.hasNext()){
            menuChoice(userInput.nextInt());
        }
    }

}
