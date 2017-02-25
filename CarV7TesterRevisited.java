/**
 * THE CarV7Tester class creates multiple objects to test CarV7 class.
 * 
 * Mir Ahmed
 * 04/05/15
 */
public class CarV7Tester
{
    //start main method
    public static void main (String[] args)
    {
        //declare and instantiate objects
        CarV7 car1 = new CarV7("06 Honda CR-V", 17651, 17233, 23, 2.98);
        CarV7 car2 = new CarV7("06 Toyota Corolla", 18934, 18402, 26, 2.98);
        CarV7 car3 = new CarV7("15 BMW 3 Series", 15543, 15247, 32, 2.98);
     
        //declare variables
        int car1TotalDist = car1.calcDistance(car1.getStartMiles(), car1.getEndMiles()); //call on method to calculate distance for car1 
        double car1TotalGallons = car1TotalDist/car1.getGallonsUsed(); 
        int car2TotalDist = car2.calcDistance(car2.getStartMiles(), car2.getEndMiles()); //call on method to calculate distance for car2
        double car2TotalGallons = car2TotalDist/car2.getGallonsUsed(); 
        int car3TotalDist = car3.calcDistance(car3.getStartMiles(), car3.getEndMiles()); //call on method to calculate distance for car3
        double car3TotalGallons = car3TotalDist/car3.getGallonsUsed(); 
        //print statements
        System.out.println("\t\t\t\t\tGas Mileage Calculations");
        System.out.printf("%s %19s %15s %15s %15s %13s %13s %15s %15s\n", "Type of Car", "Start Miles", 
                            "End Miles", "Distance", "Gallons", "Price", "Cost", "Miles/Gal", "Gal/Mile");
        System.out.print("================================================================================");
        System.out.println("===============================================================");
        //print statements for car1
        System.out.printf("%s %15s %15s %15s %15.2f %15.2f %15.2f %15.2f %12.3f\n", car1.getCarType(), car1.getStartMiles(), car1.getEndMiles(), 
                            car1TotalDist, car1TotalGallons, car1.getPricePerGallon(), car1.totalCost(car1TotalGallons, car1.getPricePerGallon()), 
                            car1.calcMPG(car1TotalDist, car1TotalGallons), car1.calcGPM(car1TotalDist, car1TotalGallons));
        //print statements for car2
        System.out.printf("%s %11s %15s %15s %15.2f %15.2f %15.2f %15.2f %12.3f\n", car2.getCarType(), car2.getStartMiles(), car2.getEndMiles(), 
                            car2TotalDist, car2TotalGallons, car2.getPricePerGallon(), car2.totalCost(car2TotalGallons, car2.getPricePerGallon()), 
                            car2.calcMPG(car2TotalDist, car2TotalGallons), car2.calcGPM(car2TotalDist, car2TotalGallons));
        //print statements for car3
        System.out.printf("%s %13s %15s %15s %15.2f %15.2f %15.2f %15.2f %12.3f\n", car3.getCarType(), car3.getStartMiles(), car3.getEndMiles(), 
                            car3TotalDist, car3TotalGallons, car3.getPricePerGallon(), car3.totalCost(car3TotalGallons, car3.getPricePerGallon()), 
                            car3.calcMPG(car3TotalDist, car3TotalGallons), car3.calcGPM(car3TotalDist, car3TotalGallons));
    }
}