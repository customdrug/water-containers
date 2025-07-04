package pl.kurs.models;

import java.io.Serializable;
import java.util.Objects;

public class Car implements Serializable {
    private static final long serialVersionUID = 42L;

    private String producer;
    private String model;
    private int powerHp;
    private int torqueNm;
    private int year;
    private char segment;

    public Car(String producer, String model, int powerHp, int torqueNm, int year, char segment) {
        this.producer = producer;
        this.model = model;
        this.powerHp = powerHp;
        this.torqueNm = torqueNm;
        this.year = year;
        this.segment = segment;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPowerHp() {
        return powerHp;
    }

    public void setPowerHp(int powerHp) {
        this.powerHp = powerHp;
    }

    public int getTorqueNm() {
        return torqueNm;
    }

    public void setTorqueNm(int torqueNm) {
        this.torqueNm = torqueNm;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public char getSegment() {
        return segment;
    }

    public void setSegment(char segment) {
        this.segment = segment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return powerHp == car.powerHp && torqueNm == car.torqueNm && year == car.year && segment == car.segment && Objects.equals(producer, car.producer) && Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(producer, model, powerHp, torqueNm, year, segment);
    }

    @Override
    public String toString() {
        return "Car{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", powerHp=" + powerHp +
                ", torqueNm=" + torqueNm +
                ", year=" + year +
                ", segment=" + segment +
                '}';
    }
}
