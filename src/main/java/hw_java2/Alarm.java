package hw_java2;

public interface Alarm {
    public default String turnAlarmOn(String brand) {
        return "Alarm is on" + brand;
    }

    public default String turnAlarmOff(String brand) {
        return "Alarm is off" + brand;
    }
}
