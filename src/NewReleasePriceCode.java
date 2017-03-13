public class NewReleasePriceCode extends PriceCode {
    @Override
    public double getPrice(int daysRented) {
        return daysRented * 3;
    }

    @Override
    public int getPoints(int daysRented) {
        int points = 1;
        if (daysRented > 1)
            points++;
        return points;
    }
}
