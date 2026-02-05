package TaskTwo;

public class Country {
    private String title;
    private int population;
    private double square;
    private String capital;
    private boolean exitToSea;

    Country(String title){
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public int getPopulation() {
        return population;
    }

    public double getSquare() {
        return square;
    }

    public String getCapital() {
        return capital;
    }

    public boolean isExitToSea() {
        return exitToSea;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public void setExitToSea(boolean exitToSea) {
        this.exitToSea = exitToSea;
    }
}
