
public class CarTester {
  public static void main(String[] args) {
    Car lexus = new Car("Lexus ES350", 48000, 26, 18875, 24500);
    Car tucson = new Car("2014 Hyundai Tucson", 12500, 32, 9850, 17500);

    // Sell Lexus
    lexus.sellCar(25000);

    // Print car information
    System.out.println(lexus);
    System.out.println(tucson);

    // Better Mileage?
    System.out.print("Better Mileage: ");
    System.out.println((lexus.compareMPG(tucson) > 0) ? lexus.getID() : tucson.getID());

    // More Miles?
    System.out.print("More Miles:     ");
    System.out.println((lexus.compareMiles(tucson) > 0) ? lexus.getID() : tucson.getID());

    // Higher Price?
    System.out.print("Higher Price:   ");
    System.out.println((lexus.comparePrice(tucson) > 0) ? lexus.getID() : tucson.getID());

  }
}
