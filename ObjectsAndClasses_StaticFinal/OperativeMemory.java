public class OperativeMemory {

    private final OperativeMemoryType operativeMemoryType;
    private final int memory;
    private final double weight;

    OperativeMemory(OperativeMemoryType operativeMemoryType, int memory, double weight){
        this.operativeMemoryType = operativeMemoryType;
        this.memory = memory;
        this.weight = weight;
    }

    public OperativeMemoryType getTypeOfMemory() {
        return operativeMemoryType;
    }

    public int getMemory() {
        return memory;
    }

    public double getWeight() {
        return weight;
    }
}
