package com.QrIzZ.bookOfRecipes;

import com.QrIzZ.bookOfRecipes.Recipes.recipes;
import com.QrIzZ.bookOfRecipes.byUser.AuthorizationUser;
import com.QrIzZ.bookOfRecipes.byUser.RegistrationUser;

import java.util.Scanner;

public class mainMenu {
    Scanner scannerInfo = new Scanner(System.in);
    static AuthorizationUser authorizationUser = new AuthorizationUser();
    static RegistrationUser registrationUser = new RegistrationUser();
    static recipes recipes = new recipes();
    int UserChoice;

    public static void autorization() {
        AuthorizationUser.main();
    }

    public static void registration() {
        RegistrationUser.main();
    }

    public static void viewRecipes() {
        recipes.recept();
    }

    public static void menuPrint() {
        System.out.println("<<[1]>> - --Авторизація;--");
        System.out.println("<<[2]>> - --Реєстрація;--");
        System.out.println("<<[3]>> - --Перегляд рецептів;--");
    }

    public  void Audit(){
        boolean repit = true;
        System.out.println("Обреріть пункт:");
        while (repit == true) {
            try {
                scannerInfo = new Scanner(System.in);
                UserChoice = scannerInfo.nextInt();
                if (UserChoice > 0 && UserChoice <= 5) {
                    repit = false;
                }
                else {
                    System.out.println("Ви вибрали пункт якого не існує");

                }
            } catch (Exception exeption) {
                System.out.println("Ви ввели не вірно дані, повторіть спробу:");

            }
        }



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
                System.out.println("<<---Ви вибрали пункт якого не існує!--->>");
        }
    }

    public static void main() {
        Scanner userInput = new Scanner(System.in);
        menuPrint();
        while (userInput.hasNext()){
            menuChoice(userInput.nextInt());
        }
    }



}
