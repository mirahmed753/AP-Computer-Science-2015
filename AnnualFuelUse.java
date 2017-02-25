
/**
 * THE AnnualFuelUse class calculates Gas Mileage Information.
 * 
 * Mir Ahmed
 * 11/9/14
 */
public class AnnualFuelUse
{
    //declare variables
    private int fillUp, day, startMiles, endMiles, distance;
    private double gallonsUsed, price, MPG, cost;
    //create constructor 
    public AnnualFuelUse(int myFillUp, int myDay, int myStartMiles, int myEndMiles, 
                         double myGallonsUsed, double myPrice)
    {
        fillUp = myFillUp;
        day = myDay;
        startMiles = myStartMiles;
        endMiles = myEndMiles;
        gallonsUsed = myGallonsUsed;
        price = myPrice;
    }
    //mutator methods
    //calculate distance traveled
    public void calcDistance()
    {
        distance = endMiles - startMiles;
    }
    //calculate total miles per gallon 
    public void calcMPG()
    {
        MPG = distance/gallonsUsed;
    }
     //calculate cost of fill-up 
    public void calcTotalCost()
    {
        cost = gallonsUsed * price; 
    }
    //getters
    public int getFillUp()
    {
        return fillUp;
    }
    public int getDay()
    {
        return day; 
    }
    public int getStartMiles()
    {
        return startMiles;
    }
    public int getEndMiles()
    {
        return endMiles;
    }
    public double getGallonsUsed()
    {
        return gallonsUsed;
    }
    public double getPrice()
    {
        return price;
    }
    public int getDistance()
    {
        return distance;
    }
    public double getMPG()
    {
        return MPG;
    }
    public double getCost()
    {
        return cost;
    }
}
