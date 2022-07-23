package enums;

public enum SkillLevel {

    BEGINNER("Beginner");

    private final String value;

    SkillLevel(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
