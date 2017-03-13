public class Movie {
    public static final PriceCode CHILDRENS = new ChildrensPriceCode();
    public static final PriceCode REGULAR = new RegularPriceCode();
    public static final PriceCode NEW_RELEASE = new NewReleasePriceCode();

    private String title;
    private PriceCode priceCode;

    public Movie(String title, PriceCode priceCode) {
        this.title = title;
        this.priceCode = priceCode;
    }

    public PriceCode getPriceCode() {
        return priceCode;
    }

    public void setPriceCode(PriceCode priceCode) {
        this.priceCode = priceCode;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice(int daysRented) {
        double amount = 0;
        if (priceCode == REGULAR) {
            amount += 2;
            if (daysRented > 2)
                amount += (daysRented - 2) * 1.5;
        } else if (priceCode == NEW_RELEASE) {
            amount += daysRented * 3;
        } else if (priceCode == CHILDRENS) {
            amount += 1.5;
            if (daysRented > 3)
                amount += (daysRented - 3) * 1.5;
        }
        return amount;
    }

    public int getPoints(int daysRented) {
        int points = 1;
        // add bonus for a two day new release rental
        if ((priceCode == NEW_RELEASE) && daysRented > 1)
            points++;
        return points;
    }
}
