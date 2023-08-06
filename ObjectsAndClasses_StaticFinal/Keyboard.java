public enum Keyboard {
    MECHAN_LED("Mechanical", true, 200),
    MECHAN_NOLED("Mechanical", false, 150),
    MEMBRAN_LED("Membrana", true, 150),
    MEMBRAN_NOLED("Membrana", false, 120);

    private final String type;
    private final boolean isLed;
    private final int weight;

    Keyboard(String type, boolean isLed, int weight){
        this.type = type;
        this.isLed = isLed;
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public boolean isLed() {
        return isLed;
    }

    public int getWeight() {
        return weight;
    }
}
