public class Main {
    public static void main(String[] args) {

        Computer computer = new Computer(
                new Processor(3000, 6, ProcessorSeries.COREI5, 95.0),
                new OperativeMemory(OperativeMemoryType.DDR4,16,100.0),
                new HDD(HDDType.SSD, 1000,400.0),
                new Display(24.7,DisplayType.TN, 3500),
                new Keyboard(KeyboardType.MECHNICAL, true,500.0),
                "X-Com",
                "PiterStyle");



        computer.setDisplay(new Display(30.0,DisplayType.IPS,4200));
        computer.setProcessor(new Processor(4500, 12,ProcessorSeries.COREI9, 115.0));

        System.out.println(computer.calcTotalWeight());
        System.out.println(computer.toString());

    }
}
