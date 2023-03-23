public class Main {
    public static void main(String[] args) {

//      1 вариант
        Planet mars = new Planet();
        mars.name ="Марс";
        mars.numberOfMoons = 2;
        outPutPlanet(mars.name, mars.numberOfMoons);


//      2 вариант
        Planet venera = new Planet(0);
        venera.name = "Венера";
        outPutPlanet(venera.name, venera.numberOfMoons);

//       3 вариант
        Planet jupiter = new Planet("Юпитер");
        jupiter.numberOfMoons = 79;
        outPutPlanet(jupiter.name, jupiter.numberOfMoons);

//       4 вариант
        Planet neptun = new Planet("Нептун",14);
        outPutPlanet(neptun.name, neptun.numberOfMoons);

//       5 планета по 4 варианту
        Planet earth = new Planet("Земля",1);
        outPutPlanet(earth.name, earth.numberOfMoons);
    }


//   метод вывода на экран
    public static void outPutPlanet(String name, int numberOfMoons)
    {
        System.out.println(name + " - количество лун  " + numberOfMoons);
        System.out.println();
    }
}