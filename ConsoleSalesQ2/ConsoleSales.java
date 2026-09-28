public class ConsoleSales extends Consoles {
    public ConsoleSales(String consoleType, String store, int totalSales) {
        super(consoleType, store, totalSales);
    }

    @Override
    public void printReport() {
        System.out.println("Console type: " + getConsoleType());
        System.out.println("Store name: " + getStore());
        System.out.println("Total sales: " + getTotalSales());
    }
}
