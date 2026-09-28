public class ElectronicSales {

    public static void main(String[] args) {

        int[][] sales = {{1000,2000,3000,},{2000,3000,4000},{1500,1100,1200}};
        String [] franchises = {"PS5","XBOX","SWITCH"};
        String[] Towns = {"CAPE TOWN","PORT ELIZABETH","PRETORIA"};
        int total = 0;
         System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------");
         System.out.println("GAMING CONSOLE REPORT");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------");

        System.out.printf("%-18s" ,"");
        System.out.printf("%-18s","PS5"+"    "+"           "+"XBOX"+"     "+"         "+"SWITCH");


            for (int row = 0; row < Towns.length; row++) {
                System.out.println();
                System.out.printf("%-18s" ,Towns[row]);
                for (int col = 0; col < franchises.length; col++) {
                    System.out.printf("%-18s" ,sales[row][col]);
                }
        }
        System.out.println();

        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------");

        double greatestotal = 0;
        String greatestTown = "";


        for (int row = 0; row < Towns.length; row++) {
            double Total = sales[row][0] + sales[row][1] +sales[row][2];
            if (Total < 0) {
                Total = +total;
            }

            System.out.printf("%-15sR %.2f", Towns[row], Total);

            System.out.println();
            if (Total > greatestotal) {
                greatestotal = Total;
                greatestTown = Towns[row];
            }


        }

        System.out.println();
        System.out.println("CAMERA WITH THE MOST COST DIFFERENCE: " + greatestTown);


    }

    }





