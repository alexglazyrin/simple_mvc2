public enum OperativeMemory {
    DDR3_8GB("DDR3", 8, 50),
    DDR3_16GB("DDR3", 16, 85),
    DDR4_8GB("DDR4", 8, 40),
    DDR4_16GB("DDR4", 16, 50),
    DDR4_32GB("DDR4", 32, 70);

    private final String typeOfMemory;
    private final int memory;
    private final int weight;

    OperativeMemory(String typeOfMemory, int memory, int weight){
        this.typeOfMemory = typeOfMemory;
        this.memory = memory;
        this.weight = weight;
    }

    public String getTypeOfMemory() {
        return typeOfMemory;
    }

    public int getMemory() {
        return memory;
    }

    public int getWeight() {
        return weight;
    }
}
