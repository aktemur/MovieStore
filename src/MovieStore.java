public class MovieStore {
    public static void main(String[] args) {
        Customer customer = new Customer("Ahmet");
        Movie sevenSamurai = new Movie("Seven Samurai", Movie.REGULAR);
        Movie corpseBride = new Movie("Corpse Bride", Movie.CHILDRENS);
        Movie inception = new Movie("Inception", Movie.NEW_RELEASE);
        Rental rentS = new Rental(sevenSamurai, 3);
        Rental rentC = new Rental(corpseBride, 2);
        Rental rentI = new Rental(inception, 5);

        System.out.println("Movie Title : " + sevenSamurai.getTitle());
        System.out.println("Rental Time : " + rentS.getDaysRented());

        System.out.println("Movie Title : " + corpseBride.getTitle());
        System.out.println("Rental Time : " + rentC.getDaysRented());

        System.out.println("Movie Title : " + inception.getTitle());
        System.out.println("Rental Time : " + rentI.getDaysRented());

        customer.addRental(rentS);
        System.out.println(customer.statement());
        customer.addRental(rentC);
        System.out.println(customer.statement());
        customer.addRental(rentI);
        System.out.println(customer.statement());
    }
}
