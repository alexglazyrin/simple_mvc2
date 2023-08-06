public enum Display {
    MON24IPS(24, "IPS", 3000),
    MON24TN(24, "TN", 4000),
    MON27IPS(27, "IPS", 6000),
    MON27VA(27, "VA", 8000);

    private final int diag;
    private final String matrixType;
    private final int weigth;

    Display(int diag, String matrixType, int weigth){
        this.diag = diag;
        this.matrixType = matrixType;
        this.weigth = weigth;
    }

    public int getDiag() {
        return diag;
    }

    public String getMatrixType() {
        return matrixType;
    }

    public int getWeigth() {
        return weigth;
    }
}
