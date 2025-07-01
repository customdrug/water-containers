package pl.kurs.models;

import java.io.Serializable;
import java.util.Objects;

public class WaterContainer implements Serializable {

    private String name;
    private final double maxCapCm3;
    private double currentFillingCm3;

    private WaterContainer(String name, double maxCapCm3, double currentFillingCm3) {
        this.name = name;
        this.maxCapCm3 = maxCapCm3;
        this.currentFillingCm3 = currentFillingCm3;
    }

    public static WaterContainer create(String name, double maxCapCm3, double currentFillingCm3){
        if (maxCapCm3 <= 0) {
            throw new RuntimeException("Maksymalna pojemność musi być powyżej zera.");
        }
        if (currentFillingCm3 < 0) {
            throw new RuntimeException("Aktualny stan wody nie może byc ponizej zera.");
        }
        if (maxCapCm3 < currentFillingCm3) {
            throw new RuntimeException("Aktualna ilość wody nie moze być wieksza niz maksymalna pojemność");
        }
        return new WaterContainer(name, maxCapCm3, currentFillingCm3);
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


    public double getCurrentFillingCm3() {
        return currentFillingCm3;
    }

    public void setCurrentFillingCm3(double currentFillingCm3) {
        this.currentFillingCm3 = currentFillingCm3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WaterContainer that = (WaterContainer) o;
        return Double.compare(maxCapCm3, that.maxCapCm3) == 0 && Double.compare(currentFillingCm3, that.currentFillingCm3) == 0 && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, maxCapCm3, currentFillingCm3);
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
