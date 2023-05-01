public enum Planets {

    MERCURY(1, 0, 2439 , 0, 2),
    VENUS(2, 50300, 6051 , 1, 3),
    EARTH(3, 41388, 6371 , 2, 4),
    MARS(4,78345, 3389 , 3, 5),
    JUPITER(5,550396, 69911 , 4, 6),
    SATURN(6,648325, 58232 , 5, 7),
    URANUS(7,1443991, 25362 , 6, 8),
    NEPTUNE(8,1627738, 24622 , 7, 0);

    private int number;
    private int distance;
    private int radius;
    private int prev;
    private int next;
    private long solarDistance;



    private Planets(final int number, final int distance, final int radius, final int prev, final int next) {
        this.number = number ;
        this.distance = distance ;
        this.radius = radius ;
        this.prev = prev ;
        this.next = next ;

    }


    // Getter
    public long getSolarDistance() {
        return solarDistance;
    }

    // Setter
    public void setSolarDistance(long value) {
        this.solarDistance = value;
    }

    public void init(){
        Planets[] planets = Planets.values();
        final long initialDistance = 57909*1000;
        Planets prevPlanet = null;
        for (Planets planet : planets) {

            if (prevPlanet!=null){
                planet.solarDistance = prevPlanet.solarDistance + planet.distance*1000;
            }else{
                planet.solarDistance = initialDistance;
            }
            prevPlanet = planet;

        }
    }


}

