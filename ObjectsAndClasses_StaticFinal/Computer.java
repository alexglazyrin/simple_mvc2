public class Computer {
    private Processor processor;
    private OperativeMemory operativeMemory;
    private HDD hdd;
    private Display display;
    private Keyboard keyboard;
    private final String vendor;
    private final String name;

    public Computer(Processor processor, OperativeMemory operativeMemory, HDD hdd,
                    Display display, Keyboard keyboard, String vendor, String name) {
        this.processor = processor;
        this.operativeMemory = operativeMemory;
        this.hdd = hdd;
        this.display = display;
        this.keyboard = keyboard;
        this.vendor = vendor;
        this.name = name;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public OperativeMemory getOperativeMemory() {
        return operativeMemory;
    }

    public void setOperativeMemory(OperativeMemory operativeMemory) {
        this.operativeMemory = operativeMemory;
    }

    public HDD getHdd() {
        return hdd;
    }

    public void setHdd(HDD hdd) {
        this.hdd = hdd;
    }

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public double calcTotalWeight(){
        return processor.getWeight() +
                operativeMemory.getWeight()+
                hdd.getWeight() +
                display.getWeigth() +
                keyboard.getWeight();
    }

    public String toString(){
        return "\n============================" + "\nКомплектация ПК: " +
                "\nПроцессор: " + processor.getFactoryName() +
                " "  + processor.getFrequency() + " Гц " +
                " " + processor.getCoreNum() + " ядра" +
                "\nОперативная память: " + operativeMemory.getMemory() +
                " Гб " + operativeMemory.getTypeOfMemory() +
                "\nДиск: " + hdd.getHDDType() + " " +
                hdd.getMemory() + " Гб" +
                "\nМонитор: " + display.getDiag() + " дюймов" + " Тип матрицы: " +
                display.getDisplayType() + "\nПроизводитель: " +
                vendor + "\nНаименование: " + name;
    }


}
