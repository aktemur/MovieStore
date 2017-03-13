import java.util.LinkedList;
import java.util.List;

class Customer {
    private String name;
    private List<Rental> rentals;

    public Customer(String name) {
        this.name = name;
        this.rentals = new LinkedList<Rental>();
    }

    public void addRental(Rental rental) {
        rentals.add(rental);
    }

    public String getName() {
        return name;
    }

    public String statement() {
        double totalAmount = 0;
        int totalPoints = 0;
        String result = "Rental Record for " + getName() + "\n";
        for (Rental rental : rentals) {

            // show figures for this rental
            result += "\t" + rental.getMovie().getTitle() + "\t"
                    + String.valueOf(getPriceFor(rental)) + "\n";
            totalAmount += getPriceFor(rental);
            totalPoints += getPointsFor(rental);
        }
        // add footer lines
        result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
        result += "You earned " + String.valueOf(totalPoints)
                + " frequent renter points";
        return result;

    }

    private double getPriceFor(Rental rental) {
        double amount = 0;
        // determine amounts for each rental
        switch (rental.getMovie().getPriceCode()) {
            case Movie.REGULAR:
                amount += 2;
                if (rental.getDaysRented() > 2)
                    amount += (rental.getDaysRented() - 2) * 1.5;
                break;
            case Movie.NEW_RELEASE:
                amount += rental.getDaysRented() * 3;
                break;
            case Movie.CHILDRENS:
                amount += 1.5;
                if (rental.getDaysRented() > 3)
                    amount += (rental.getDaysRented() - 3) * 1.5;
                break;

        }
        return amount;
    }

    private int getPointsFor(Rental rental) {
        // add frequent renter points
        int points = 1;
        // add bonus for a two day new release rental
        if ((rental.getMovie().getPriceCode() == Movie.NEW_RELEASE)
                && rental.getDaysRented() > 1)
            points++;
        return points;
    }
}
