package enums;

public enum Subject {

    SOFTWARE_DEVELOPMENT("Software development");

    private final String value;

    Subject(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
