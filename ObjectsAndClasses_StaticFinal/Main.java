public class Main {
    public static void main(String[] args) {

        Computer computer = new Computer(
                Processor.COREI5,
                OperativeMemory.DDR4_32GB,
                HDD.SSD_1000,
                Display.MON27IPS,
                Keyboard.MECHAN_LED,
                "X-Com",
                "PiterStyle");

        Computer computer1 = new Computer(
                Processor.RYZEN,
                OperativeMemory.DDR4_16GB,
                HDD.HDD_500,
                Display.MON24TN,
                Keyboard.MEMBRAN_NOLED,
                "PIK",
                "U768TU"
        );

        computer.setDisplay(Display.MON24TN);
        computer.setProcessor(Processor.COREI9);

        System.out.println(computer.calcTotalWeight());
        System.out.println(computer.toString());
        System.out.println(computer1.toString());

    }
}
