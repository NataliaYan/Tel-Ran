public class Main {
   public static void main(String[] args) {

      Account wallet = new Account("Programmer", 15000.0);
      Car bmw = new Car("BMW", 20000.0, "Programmer");
      Car lanos = new Car("lanos", 3000.0, "Scientist");
      Phone motorola = new Phone("Motorola", 300.0, "Scientist");
      Phone iphone = new Phone("Iphone", 2000.0, "Programmer");
      Plane boeingJet = new Plane("Boeing", 63000000.0, "Captain");
      Plane hondaJet = new Plane("Honda", 3000000.0, "Captain");
      DownshifterKit something = new DownshifterKit(" ", 0.0, "Stylish");

      System.out.println("Категория - " + wallet.categoryBuyer);
      System.out.println("Сумма на счету - " + wallet.currentAmount);

      if (wallet.categoryBuyer.equals("Stylish")) System.out.println("Мы не можем Вам ничего предложить((");
      else {
         findThingToBuy(wallet.categoryBuyer, wallet.currentAmount, bmw.brand, bmw.price, bmw.category);
         findThingToBuy(wallet.categoryBuyer, wallet.currentAmount, lanos.brand, lanos.price, lanos.category);
         findThingToBuy(wallet.categoryBuyer, wallet.currentAmount, motorola.brand, motorola.price, motorola.category);
         findThingToBuy(wallet.categoryBuyer, wallet.currentAmount, iphone.brand, iphone.price, iphone.category);
         findThingToBuy(wallet.categoryBuyer, wallet.currentAmount, boeingJet.brand, boeingJet.price, boeingJet.category);
         findThingToBuy(wallet.categoryBuyer, wallet.currentAmount, hondaJet.brand, hondaJet.price, hondaJet.category);
      }
   }

      static void findThingToBuy (String categoryBuyer, double currentAmount, String brand, double price, String category){
      if (currentAmount >= price && categoryBuyer.equals(category))
      System.out.println("Предлагаем купить Вам : " + brand + " стоимостью " +price);
      else if (currentAmount < price && categoryBuyer.equals(category))
         System.out.println("Средств недостаточно для покупки : " + brand + " стоимостью " +price);
      }
   }

