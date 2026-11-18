public class Product implements IProduct {
    private int[][] sales;
    private String[] products;

    public Product(int[][] sales, String[] products) {
        this.sales = sales;
        this.products = products;
    }

    @Override
    public int GetTotalProductSold() {
        int total = 0;
        for (int p = 0; p < sales.length; p++) {
            for (int t = 0; t < sales[p].length; t++) {
                total += sales[p][t];
            }
        }
        return total;
    }

    @Override
    public double GetAverageProductSold() {
        int total = GetTotalProductSold();
        int count = 0;
        for (int p = 0; p < sales.length; p++) {
            count += sales[p].length;
        }
        return (double) total / count;}

    @Override
    public String GetMostPopularProduct() {
        int max = sales[0][0];
        String popular = products[0];
        for (int p = 0; p < sales.length; p++) {
            for (int t = 0; t < sales[p].length; t++) {
                if (sales[p][t] > max) {
                    max = sales[p][t];
                    popular = products[p];}}
        }
        return popular + " (" + max + ")";
    }
}