public enum Planets {

    MERCURY(1, 0, 2439, null),
    VENUS(2, 50300, 6051, Planets.MERCURY),
    EARTH(3, 41388, 6371, Planets.VENUS),
    MARS(4, 78345, 3389, Planets.EARTH),
    JUPITER(5, 550396, 69911, Planets.MARS),
    SATURN(6, 648325, 58232, Planets.JUPITER),
    URANUS(7, 1443991, 25362, Planets.SATURN),
    NEPTUNE(8, 1627738, 24622, Planets.URANUS);

    private int number;
    private int distance;
    private int radius;
    private long solarDistance;

    final long initialDistance = 57909 * 1000;

    private Planets(final int number, final int distance, final int radius, final Planets prevPlanet) {
        this.number = number;
        this.distance = distance;
        this.radius = radius;

        if (prevPlanet != null) {
            this.solarDistance = prevPlanet.solarDistance + distance * 1000;
        } else {
            this.solarDistance = initialDistance;
        }

    }

    public String planetName() {
        return this.name();
    }

    // Getter
    public long getSolarDistance() {
        return solarDistance;
    }

}