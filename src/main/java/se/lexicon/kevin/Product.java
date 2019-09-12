package se.lexicon.kevin;

import java.util.*;

abstract class Product extends Instan implements VendingMachine {
    public static void main(String[] args) {
        boolean meny = true;
        while (meny) {
            System.out.println("Welcome to the Vending Machine!");
            System.out.println("Please make a choice: ");
            System.out.println("1) Insert Money");
            System.out.println("2) View our Products");
            System.out.println("3) Buy a product");
            System.out.println("4) Withdraw Money");
            System.out.println("5) Consume your Product");
            System.out.println("6) View your balance: ");
            System.out.println("7) View a product description: ");
            System.out.println("8) End Session");
            System.out.println("9) Exit the program: ");

            int userInputs = scanner.nextInt();

            switch (userInputs) {
                case 1:
                    addCurrency();
                    meny = true;
                    break;
                case 2:
                    getProducts();
                    meny = true;
                    break;
                case 3:
                    productRequest();
                    meny = true;
                    break;
                case 4:
                    getBalance();
                    meny = true;
                    break;
                case 5:
                    use();
                    meny = true;
                    break;
                case 6:
                    moneyPool();
                    meny = true;
                    break;
                case 7:
                    getDescription();
                    meny = true;
                    break;
                case 8:
                    endSession();
                    meny = true;
                    break;
                case 9:
                    System.out.println("Program shutting down: ");
                    meny = false;
                    break;
                default:
                    System.out.println("Error");
            }
        }
    }
}




