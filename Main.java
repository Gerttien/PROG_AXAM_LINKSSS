import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] months = {"MONTH 1", "MONTH 2", "MONTH 3"};
        String[] products = {"Cozy Nights Monarch", "Restonic Barbados", "Sealy Phuket"};
        int[][] sales ={{25,18,20},{15,10,12},{18,15,20}};

        for (int p = 0; p < products.length; p++) {
            for (int m = 0; m < months.length; m++) {
                System.out.print("Enter number of sales for month " + (m + 1) + " for " + products[p] + " mattress: ");
                sales[p][m] = scanner.nextInt();}}
        Product product = new Product(sales, products);

        System.out.println("**************************************************");
        System.out.println("PRODUCT SALES REPORT - 2026");
        System.out.println("**************************************************");

        System.out.printf("%-25s", "");
        for (int c = 0; c < months.length; c++) {
            System.out.printf("%-18s", months[c]);
        }
        System.out.println();
        for (int p = 0; p < products.length; p++) {
            System.out.printf("%-25s", products[p]);
            for (int t = 0; t < sales[p].length; t++) {
                System.out.printf("%-18s", sales[p][t]);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("**************************************************");
        System.out.println("PRODUCT SALES RESULTS");
        System.out.println("**************************************************");

        for (int p = 0; p < products.length; p++) {
            int sub = sales[p][0] + sales[p][1] + sales[p][2];
            System.out.println(products[p] + " : " + sub);
            if (sub >= 60) {
                System.out.println("***");
            }
        }
        System.out.println();
        PrintProduct printer = new PrintProduct();
        printer.PrintTotalProductSales(product.GetTotalProductSold());
        printer.PrintAverageProductSales(product.GetAverageProductSold());
        printer.PrintMostPopularProduct(product.GetMostPopularProduct());
    }
}