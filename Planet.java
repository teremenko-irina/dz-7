public class Planet {

    private Planets planet;

    // Constructor
    public Planet(Planets planet) {
        this.planet = planet;
        this.planet.init(); // Initialize distance calculation
    }

    public long solarDistance(){

        return this.planet.getSolarDistance();
    }

    public String planetName(){
        return this.planet.name();
    }
}