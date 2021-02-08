package creational.singleton;

public enum EnumSingleton {
    INSTANCE;

    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
