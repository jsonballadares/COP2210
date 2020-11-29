public class StockPortfolioTester {
    public static void main(String[] args) {
        StockPortfolio sp = new StockPortfolio("The Ramjac Corporation",100,37,5);
        System.out.println(sp.getPortfolioValue());
        sp.setStockPrice(7,2);
        System.out.println(sp.getPortfolioValue());
    }
}
