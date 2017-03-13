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
            result += "\t" + rental.getMovie().getTitle() + "\t"
                    + rental.getPrice() + "\n";
            totalAmount += rental.getPrice();
            totalPoints += rental.getPoints();
        }
        // add footer lines
        result += "Amount owed is " + totalAmount + "\n";
        result += "You earned " + totalPoints + " frequent renter points";
        return result;
    }
}
