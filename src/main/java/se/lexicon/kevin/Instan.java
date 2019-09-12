package se.lexicon.kevin;

public abstract class Instan implements VendingMachine {

    int productNumber;
    int price;
    String name;
    int calories;
    int totalMoney;
    StringBuilder productsBought = new StringBuilder();

    public String fruit() {
        this.productNumber = 1;
        this.name = "banana";
        this.calories = 200;
        this.price = 5;
        return examine(productNumber, name, calories, price);
    }

    public String candy() {
        this.productNumber = 2;
        this.name = "snickers";
        this.calories = 200;
        this.price = 10;
        return examine(productNumber, name, calories, price);
    }

    public String drinks() {
        this.productNumber = 3;
        this.name = "coke";
        this.calories = 0;
        this.price = 20;
        return examine(productNumber, name, calories, price);
    }

    public String food() {
        this.productNumber = 4;
        this.name = "pizza";
        this.calories = 1000;
        this.price = 100;
        return examine(productNumber, name, calories, price);
    }


    public String examine(int productNumber, String name, int calories, int price) {
        this.productNumber = productNumber;
        this.name = name;
        this.calories = calories;
        this.price = price;
        return null;/*examine(productNumber, name, calories, price);*/
    }


    public String use() {
        productsBought.delete(0, 10);
        return productsBought.toString();
    }

    public void addCurrency(int amount) {
        System.out.println("The vending machine accepts the following currencies: ");
        System.out.println("1 " + "5 " + "10 " + "50 " + "100 " + "500 " + "100");
        System.out.println("Please enter the currency you would like to add: ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                amount = 1;
                totalMoney = totalMoney + amount;
                break;
            case 5:
                amount = 5;
                totalMoney = totalMoney + amount;
                break;
            case 10:
                amount = 10;
                totalMoney = totalMoney + amount;
                break;
            case 50:
                amount = 50;
                totalMoney = totalMoney + amount;
                break;
            case 100:
                amount = 100;
                totalMoney = totalMoney + amount;
                break;
            case 500:
                amount = 500;
                totalMoney = totalMoney + amount;
                break;
            case 1000:
                amount = 1000;
                totalMoney = totalMoney + amount;
                break;
            default:
                System.out.println("Error");
                break;
        }

    }

    @Override
    public void moneyPool(int totalCurrency) {
        totalCurrency = totalMoney;
        System.out.println(totalCurrency);
    }

    @Override
    public int getBalance() {
        System.out.println("Your change is: " + totalMoney);
        totalMoney = 0;
        System.out.println("New balance is: ");
        return totalMoney;
    }

    @Override
    public String getDescription(int productNumber) {
        System.out.println("Which item would you like to review?");
        System.out.println("1 = fruit " + "\n2 = candy " + "\n3 = drinks " + "\n4 = food");
        int userInput = scanner.nextInt();
        switch (userInput) {
            case 1:
                System.out.println(fruit());
                break;
            case 2:
                System.out.println(candy());
                break;
            case 3:
                System.out.println(drinks());
                break;
            case 4:
                System.out.println(food());
                break;
            default:
                System.out.println("Error");
                break;
        }
        return examine(productNumber, name, calories, price);
    }

    @Override
    public String productRequest(int productNumber) {
        System.out.println("Which product would you like to buy?");
        System.out.println("You can choose between: ");
        System.out.println("1 = Banana. \n 2 = Snickers. \n3 = Coke. \n 4 = Pizza");
        int buy = scanner.nextInt();
        switch (buy) {
            case 1:
                productsBought.append("Banana");
                break;
            case 2:
                productsBought.append("Snickers");
                break;
            case 3:
                productsBought.append("Coke");
                break;
            case 4:
                productsBought.append("Pizza");
                break;
        }
        System.out.println("Your products: ");
        return productsBought.toString();
    }

    @Override
    public int endSession() {
        System.out.println("Your change is: " + totalMoney);
        totalMoney = 0;
        System.out.println("New balance is: ");
        return totalMoney;
    }

    @Override
    public String[] getProducts() {
        String[] getProducts = new String[4];
        getProducts[0] = fruit();
        getProducts[1] = candy();
        getProducts[2] = drinks();
        getProducts[3] = food();
        for (int i = 0; i < getProducts.length; i++) {
            System.out.println(getProducts[i]);
        }
        return getProducts;
    }

}


