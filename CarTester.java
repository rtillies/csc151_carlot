
public class CarTester {
  // public static void main(String[] args) throws Exception {
  public static void main(String[] args) {
    Car lexus = new Car("Lexus ES350", 48000, 26, 18875, 24500);
    Car tucson = new Car("2014 Hyundai Tucson", 12500, 32, 9850, 17500);

    // Try to change existing info
    lexus.setID("New Lexus");
    lexus.setMileage(10000);

    // Sell Lexus
    lexus.sellCar(25000);

    // Print car information
    // System.out.println(lexus);
    // System.out.println(tucson);

    // Better Mileage?
    System.out.print("Better Mileage: ");
    System.out.println(betterMileage(lexus, tucson).getID());
    
    
    // More Miles?
    System.out.print("More Miles:     ");
    System.out.println(moreMiles(lexus, tucson).getID());
    
    // Higher Price?
    System.out.print("Higher Price:   ");
    System.out.println(higherPrice(lexus, tucson).getID());
  }

  // Return car with better mileage
  public static Car betterMileage(Car a, Car b) {
    return a.compareMPG(b) > 0 ? a : b;
  }

  // Return car with more miles
  public static Car moreMiles(Car a, Car b) {
    return a.compareMiles(b) > 0 ? a : b;
  }

  // Return car with higher price
  public static Car higherPrice(Car a, Car b) {
    return a.comparePrice(b) > 0 ? a : b;
  }

  
}
