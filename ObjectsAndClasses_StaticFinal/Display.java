public class Display {

    private final double diag;
    private final DisplayType displayType;
    private final double weigth;

    Display(double diag, DisplayType displayType, double weigth){
        this.diag = diag;
        this.displayType = displayType;
        this.weigth = weigth;
    }

    public double getDiag() {
        return diag;
    }

    public DisplayType getDisplayType() {
        return displayType;
    }

    public double getWeigth() {
        return weigth;
    }
}
