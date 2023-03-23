public class Planet {
    public int numberOfMoons;
    public String name;

    Planet() {}

    Planet(int numberOfMoons)
    {
        this.numberOfMoons = numberOfMoons;
    }

    Planet(String name)
    {
        this.name = name;
        System.out.println("Я - планета " + name);
    }

    Planet(String name, int numberOfMoons)
    {
        this.name = name;
        this.numberOfMoons = numberOfMoons;
    }
}
