package hw_java2;

public abstract class Car implements Alarm, Vehicle {
    private String brand;
    private String model;
    private String color;

    public Car(String brand, String model, String color) {
        this.brand = brand;
        this.model = model;
        this.color = color;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String getBrand() {
        return brand;
    }

    @Override
    public String turnAlarmOn(String brand) {
        brand = this.brand;
        return Alarm.super.turnAlarmOn(brand);
    }

    @Override
    public String turnAlarmOff(String brand) {
        brand = this.brand;
        return turnAlarmOff(brand);
    }

    @Override
    public void speedUp(String brand) {
        System.out.println(brand + " is going quicker.");;
    }

    @Override
    public void slowDown(String brand) {
        System.out.println(brand + "is going slower");;
    }
}
