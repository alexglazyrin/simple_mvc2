public class Keyboard {

    private final KeyboardType keyboardType;
    private final boolean isLed;
    private final double weight;

    Keyboard(KeyboardType keyboardType, boolean isLed, double weight){
        this.keyboardType = keyboardType;
        this.isLed = isLed;
        this.weight = weight;
    }

    public KeyboardType getKeyboardType() {
        return keyboardType;
    }

    public boolean isLed() {
        return isLed;
    }

    public double getWeight() {
        return weight;
    }
}
