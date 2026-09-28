import java.util.Scanner;

public class RunApplication {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Select console type:");
        System.out.println("1. PlayStation");
        System.out.println("2. Xbox");
        System.out.println("3. Nintendo Switch");
        System.out.print("Choice: ");
        int choice = Integer.parseInt(in.nextLine().trim());

        String type;
        switch (choice) {
            case 1:  type = "PlayStation"; break;
            case 2:  type = "Xbox"; break;
            case 3:  type = "Nintendo Switch"; break;
            default: type = "Unknown"; break;
        }

        System.out.print("Enter store name: ");
        String store = in.nextLine();

        System.out.print("Enter total sales: ");
        int sales = Integer.parseInt(in.nextLine().trim());

        ConsoleSales report = new ConsoleSales(type, store, sales);
        report.printReport();
    }
}
