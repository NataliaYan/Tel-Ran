import java.util.Scanner;

public class Account {
    public double currentAmount;
    public String categoryBuyer;

    Account(String categoryBuyer, double currentAmount) {
        this.categoryBuyer = categoryBuyer;
        this.currentAmount = currentAmount;
    }
}

    // Пробовала через вывод и сравнить , но не получается выводит нулевые значения в главном методе ((


//        setCategoryBuyer(categoryBuyer);
//        setAmountBuyer(currentAmount);


//    private String setCategoryBuyer(String categoryBuyer) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a category from the list: Programmer, Scientist, Captain, Stylish ");
//        categoryBuyer = scanner.nextLine();
//        return categoryBuyer;
//    }
//    private Double setAmountBuyer(double currentAmount){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the amount in your account: ");
//        currentAmount = scanner.nextDouble();
//        return currentAmount;







