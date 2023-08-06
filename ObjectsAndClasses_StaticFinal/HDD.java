public enum HDD {
    HDD_500("HDD", 500, 200),
    HDD_1000("HDD", 1000, 220),
    SSD_500("SSD", 500, 80),
    SSD_1000("SSD", 1000, 85);

    private final String HDDType;
    private final int memory;
    private final int weight;

    HDD(String HDDType, int memory, int weight){
        this.HDDType = HDDType;
        this.memory = memory;
        this.weight = weight;
    }

    public String getHDDType() {
        return HDDType;
    }

    public int getMemory() {
        return memory;
    }

    public int getWeight() {
        return weight;
    }
}
