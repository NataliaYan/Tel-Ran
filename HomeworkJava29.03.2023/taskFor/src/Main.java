public class Main {
    public static void main(String[] args) {

        Fruit[] fruits = {
                new Fruit("apple", true, "green"),
                new Fruit("cherry", true, "red/white/black"),
                new Fruit("banana", true, "yellow/green")
        };

        int iterationNum = 0;

//   (Переменная для хран. фруктов) : (название массива с фруктами)
        for (Fruit currentFruit : fruits) {
            System.out.println("Iteration: " + iterationNum);
            System.out.println(" Fruit name: " + currentFruit.name);
            System.out.println(" Fruit color: " + currentFruit.color);
            System.out.println(" Fruit is tasty?: " + currentFruit.isTasty);
            iterationNum++;

        }
        //    код с цикла "For each" на обычный цикл "for" с счётчиком.
        for (int count = 0; count < fruits.length; count++) {
            System.out.println("NEW Iteration: " + count);
            System.out.println(" Fruit name: " + fruits[count].name);
            System.out.println(" Fruit color: " + fruits[count].color);
            System.out.println(" Fruit is tasty?: " + fruits[count].isTasty);
        }
    }
}