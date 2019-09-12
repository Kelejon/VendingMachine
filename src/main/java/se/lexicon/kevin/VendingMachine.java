package se.lexicon.kevin;

import java.util.*;

public interface VendingMachine  {

    Scanner scanner = new Scanner(System.in);

    void addCurrency(int amount);

    String  productRequest (int productNumber);

    void moneyPool (int totalCurrency);

    int endSession();

    String getDescription (int productNumber);

    int getBalance();

    String [] getProducts();




}


