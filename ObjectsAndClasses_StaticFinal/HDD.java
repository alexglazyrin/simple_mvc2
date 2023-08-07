public class HDD {

    private final HDDType hddType;
    private final int memory;
    private final double weight;

    HDD(HDDType hddType, int memory, double weight){
        this.hddType = hddType;
        this.memory = memory;
        this.weight = weight;
    }

    public HDDType getHDDType() {
        return hddType;
    }

    public int getMemory() {
        return memory;
    }

    public double getWeight() {
        return weight;
    }
}
