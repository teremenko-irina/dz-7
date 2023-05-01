public class Main
{
    public static void main(String[] args)
    {
        Planet p = new Planet(Planets.EARTH);

        System.out.printf("The distance from %s to SUN :  %d km", p.planetName(), p.solarDistance());

    }
}
