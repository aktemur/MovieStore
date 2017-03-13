public class NewReleasePriceCode extends PriceCode {
    @Override
    public double getPrice(int daysRented) {
        return daysRented * 3;
    }
}
