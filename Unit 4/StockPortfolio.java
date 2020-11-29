/**
 * On April 9, 2001, the American stock exchanges first began reporting stock prices as decimal values (i.e., dollars and cents), as is common practice in all other institutions.

 * Previously, however, – in a tradition dating back to the Spanish conquistadores - prices had been calibrated to the nearest half, quarter, eighth, or sixteenth of a dollar.

 * This assignment is to write a class to represent a stock portfolio using the traditional measure, and another class that tests it.
 */

public class StockPortfolio {
    /*
    To receive credit for this assignment, all instance variables except for the company name must be type int
    */
    private String companyName;
    private int numberOfShares;
    private int dollarPortionOfSharePrice;
    private int eightsPortionOfSharePrice;

    public StockPortfolio(String companyName,int numberOfShares,int dollarPortionOfSharePrice,int eightsPortionOfSharePrice){
        this.companyName = companyName;
        this.numberOfShares = numberOfShares;
        this.dollarPortionOfSharePrice = dollarPortionOfSharePrice;
        this.eightsPortionOfSharePrice = eightsPortionOfSharePrice;
    }

    /*
    Other methods of the class will include
        1.	“Get” methods for each of the instance variables
        2.	A method to modify the stock price.  This method will have 2 int parameters:
        •	The change in the dollar portion of the price
        •	The change in the eighths portion of the price
        3.	A method to compute and return the portfolio value as a decimal
    */

    public String getCompanyName(){
        return companyName;
    }

    public int getNumberOfShares(){
        return numberOfShares;
    }

    public int dollarPortionOfSharePrice(){
        return dollarPortionOfSharePrice;
    }

    public int eightsPortionOfSharePrice(){
        return eightsPortionOfSharePrice;
    }

    public void setStockPrice(int dollarPricePortion, int eightDollarPricePortion){
        this.dollarPortionOfSharePrice += dollarPricePortion;
        this.eightsPortionOfSharePrice += eightDollarPricePortion;
    }

    public double getPortfolioValue(){
        return (((double) dollarPortionOfSharePrice ) + ((double) eightsPortionOfSharePrice / 8.0)) * numberOfShares;
    }
}
