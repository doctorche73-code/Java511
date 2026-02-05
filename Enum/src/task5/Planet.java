package task5;

public enum Planet {
    MERCURY(0.06),
    VENUS(0.8),
    EARTH(1.0);

    private final double mass;

    Planet(double mass) {
        this.mass = mass;
    }

    public double getMass() {
        return mass;
    }
}
