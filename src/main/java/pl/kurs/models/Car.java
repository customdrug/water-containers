package pl.kurs.models;

public class Car {

    private String producer;
    private String model;
    private int powerHp;
    private int torqueNm;
    private int year;

    public Car(String producer, String model, int powerHp, int torqueNm, int year) {
        this.producer = producer;
        this.model = model;
        this.powerHp = powerHp;
        this.torqueNm = torqueNm;
        this.year = year;
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

    @Override
    public String toString() {
        return "Car{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", powerHp=" + powerHp +
                ", torqueNm=" + torqueNm +
                ", year=" + year +
                '}';
    }
}
