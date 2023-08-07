public class Processor {

    private final int frequency;
    private final int coreNum;
    private final ProcessorSeries processorSeries;
    private final double weight;
    Processor(int frequency, int coreNum, ProcessorSeries processorSeries, double weight){
        this.frequency = frequency;
        this.coreNum = coreNum;
        this.processorSeries = processorSeries;
        this.weight = weight;
    }

    public int getFrequency() {
        return frequency;
    }

    public int getCoreNum() {
        return coreNum;
    }

    public ProcessorSeries getFactoryName() {
        return processorSeries;
    }

    public double getWeight() {
        return weight;
    }
}
