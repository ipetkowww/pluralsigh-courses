package part1definingclasses.alarmv1;

public class Alarm {

    boolean active;
    final String message;

    public Alarm(String message) {
        this.message = message;
    }

    public void turnOn() {
        active = true;
    }

    void turnOff() {
        active = false;
    }

    String getReport() {
        return getReport(false);
    }

    String getReport(boolean isUppercase) {
        if (active) {
            return isUppercase ? message.toUpperCase() : message;
        }
        return "";
    }

    public void sendReport() {
        System.out.println(getReport(true));
    }
}
