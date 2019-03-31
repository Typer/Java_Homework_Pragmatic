public class ComputerDemo {
    public static void main(String[] args) {

        Computer acerAspire3 = new Computer(2017, 799, true, 1200, "Windows7EE");
        Computer pentium4 = new Computer(2019, 1200, false, 3000, "Windows7EE");

        acerAspire3.changeOperationSystem("Debian");
        pentium4.useMemory(100.00);
        System.out.println(pentium4.freeDiskMemory);
        System.out.println(acerAspire3.freeDiskMemory);

        //First computer
        System.out.println("Acer Aspire 3");
        System.out.println("Year : " + acerAspire3.year);
        System.out.println("Type of machine : " + acerAspire3.isnotebook());
        System.out.println("HDD Memory : " + acerAspire3.hardDiskMemory);
        System.out.println("Operation System : " + acerAspire3.operationSystem);
        System.out.println("Free HDD Memory : " + acerAspire3.freeDiskMemory);

        System.out.println("");

        //Second computer
        System.out.println("Pentium 4");
        System.out.println("Year : " + pentium4.year);
        System.out.println("Type of machine : " + pentium4.isnotebook());
        System.out.println("HDD Memory : " + pentium4.hardDiskMemory);
        System.out.println("Operation System : " + pentium4.operationSystem);
        System.out.println("Free HDD Memory : " + pentium4.freeDiskMemory);
    }
}
