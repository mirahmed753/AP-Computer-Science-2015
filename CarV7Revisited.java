 /* THE CarV5 class creates an object that is used in calculating gas mileage information.
 * 
 * Mir Ahmed
 * 04/05/15
 */
public class CarV7
{
    //declare variables 
    private String carType; 
    private int endMiles; 
    private int startMiles; 
    private double gallonsUsed; 
    private double pricePerGallon;
    //create constructor
    CarV7(String carType, int endMiles, int startMiles, double gallonsUsed, double pricePerGallon)
    {
        this.carType = carType;
        this.endMiles = endMiles;
        this.startMiles = startMiles;
        this.gallonsUsed = gallonsUsed;
        this.pricePerGallon = pricePerGallon; 
    }
    //accessors 
    public String getCarType()
    {
        return carType;
    }
    public int getEndMiles()
    {
        return endMiles;
    }
    public int getStartMiles()
    {
        return startMiles;
    }
    public double getGallonsUsed()
    {
        return gallonsUsed;
    }
    public double getPricePerGallon()
    {
        return pricePerGallon;
    }
    //calculate distance traveled
    public int calcDistance(int sMiles, int eMiles)
    {
        return eMiles - sMiles;
    }
    //calculate total miles per gallon 
    public double calcMPG(int dist, double gals)
    {
        return dist/gals;
    }
    //calculate gallons per mile
    public double calcGPM(int dist, double gals)
    {
        return gals/dist;
    }
    //calculate cost of fill-up 
    public double totalCost(double gals, double cost)
    {
        return gals * cost; 
    }
}


