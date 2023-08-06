public enum Processor {
    COREI3(2000, 4, "Intel", 60),
    COREI5(3000, 6, "Intel", 65),
    COREI7(4000, 10, "Intel", 70),
    COREI9(4500, 16, "Intel", 90),
    RYZEN(3800, 12, "AMD", 70);

    private final int frequency;
    private final int coreNum;
    private final String factoryName;
    private final int weight;
    Processor(int frequency, int coreNum, String factoryName, int weight){
        this.frequency = frequency;
        this.coreNum = coreNum;
        this.factoryName = factoryName;
        this.weight = weight;
    }

    public int getFrequency() {
        return frequency;
    }

    public int getCoreNum() {
        return coreNum;
    }

    public String getFactoryName() {
        return factoryName;
    }

    public int getWeight() {
        return weight;
    }
}
