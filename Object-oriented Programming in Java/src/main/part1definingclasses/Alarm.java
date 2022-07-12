package main.part1definingclasses;

class Alarm {

    boolean active;
    final String message;

    Alarm(String message) {
        this.message = message;
    }

    void turnOn() {
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

    void sendReport() {
        System.out.println(getReport(true));
    }
}
