package pl.kurs.models;

public class WaterContainers {

    private String name;
    private double maxCapCm3;
    private double currentFillingCm3;

    public WaterContainers(String name, int maxCapCm3, int currentFillingCm3) {
        this.name = name;
        this.maxCapCm3 = maxCapCm3;
        this.currentFillingCm3 = currentFillingCm3;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMaxCapCm3() {
        return maxCapCm3;
    }

    public void setMaxCapCm3(double maxCapCm3) {
        this.maxCapCm3 = maxCapCm3;
    }

    public double getCurrentFillingCm3() {
        return currentFillingCm3;
    }

    public void setCurrentFillingCm3(double currentFillingCm3) {
        this.currentFillingCm3 = currentFillingCm3;
    }

    @Override
    public String toString() {
        return "WaterContainers{" +
                "name='" + name + '\'' +
                ", maxCapCm3=" + maxCapCm3 +
                ", currentFillingCm3=" + currentFillingCm3 +
                '}';
    }
}
