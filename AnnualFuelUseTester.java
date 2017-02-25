
/**
 * THE AnnualFuelUseTester class tests the AnnualFuelUse class.
 * 
 * Mir Ahmed
 * 11/9/14
 */
public class AnnualFuelUseTester
{
    public static void main (String[] args)
    {
        //declare variables 
        int totalDistance = 0; 
        int totalGallonsUsed = 0;;
        double totalCost = 0;
        double totalMPG = 0;
        //intialize array of objects
        AnnualFuelUse[] fuelUse = {new AnnualFuelUse(1, 1, 17233, 17651, 23, 2.98),
                                   new AnnualFuelUse(2, 5, 17651, 17912, 20, 2.95),
                                   new AnnualFuelUse(3, 12, 17912, 18501, 25, 2.98)};
        //call on methods from AnnualFuelUse 
        for(int i = 0; i < fuelUse.length; i++)
        {
            fuelUse[i].calcDistance();
            fuelUse[i].calcMPG();
            fuelUse[i].calcTotalCost();
        }
        //calculate totals for each designated category 
        for(int i =0; i < fuelUse.length; i++)
        {
            totalDistance += fuelUse[i].getDistance(); 
            totalGallonsUsed += fuelUse[i].getGallonsUsed(); 
            totalCost += fuelUse[i].getCost(); 
            totalMPG += fuelUse[i].getMPG();
        }
        //calculate annual projections (AP) for designated categories 
        int distanceAP = (totalDistance/fuelUse[fuelUse.length - 1].getDay()) * 365;
        int gallonsAP = (totalGallonsUsed/fuelUse[fuelUse.length - 1].getFillUp()) * 365; 
        double costAP = (totalCost/fuelUse[fuelUse.length - 1].getDay()) * 365; 
        double mpgAP = totalMPG/fuelUse.length;
        //calculate max and min for categories dist mpg price
        Integer minDistance = Integer.MAX_VALUE;
        Double minMPG = Double.MAX_VALUE;
        Double minPrice = Double.MAX_VALUE;
        Integer maxDistance = Integer.MIN_VALUE;
        Double maxMPG = Double.MIN_VALUE;
        Double maxPrice = Double.MIN_VALUE;
        //Find max and min for distance 
        for (int i = 0; i < fuelUse.length; i++)
        {
            if(fuelUse[i].getDistance() < minDistance)
                minDistance = fuelUse[i].getDistance();
        }
        for (int i = 0; i < fuelUse.length; i++)
        {
            if(fuelUse[i].getDistance() > maxDistance)
                maxDistance = fuelUse[i].getDistance();
        }
        //Find max and min for MPG 
        for (int i = 0; i < fuelUse.length; i++)
        {
            if(fuelUse[i].getMPG() < minMPG)
                minMPG = fuelUse[i].getMPG();
        }
        for (int i = 0; i < fuelUse.length; i++)
        {
            if(fuelUse[i].getMPG() > maxMPG)
                maxMPG = fuelUse[i].getMPG();
        }
        //Find max and min for price
        for (int i = 0; i < fuelUse.length; i++)
        {
            if(fuelUse[i].getPrice() < minPrice)
                minPrice = fuelUse[i].getPrice();
        }
        for (int i = 0; i < fuelUse.length; i++)
        {
            if(fuelUse[i].getPrice() > minPrice)
                maxPrice = fuelUse[i].getPrice();
        }
        //print statements 
        System.out.println("Fill Up\t  Days\tStart Miles\tEnd Miles\tDistance   Gallons Used    MPG\t   Price    Cost");   
        for(int i = 0; i < fuelUse.length; i++)
        {
            System.out.printf("%3d %8d %12d %13s %13s %12.2s %10.2s %9s %9.2f\n", fuelUse[i].getFillUp(),
                              fuelUse[i].getDay(), fuelUse[i].getStartMiles(), fuelUse[i].getEndMiles(), 
                              fuelUse[i].getDistance(), fuelUse[i].getGallonsUsed(), fuelUse[i].getMPG(),
                              fuelUse[i].getPrice(), fuelUse[i].getCost());
        }
        System.out.println(); 
        System.out.printf("%s %45s %23.2s %9.2f\n", "Minimum", minDistance, minMPG, minPrice);
        System.out.printf("%s %45s %23.2s %9.2f\n", "Maximum", maxDistance, maxMPG, maxPrice);
        System.out.println();
        System.out.printf("%s %45s %12s %31.2f\n", "Totals:", totalDistance, totalGallonsUsed, totalCost);
        System.out.printf("%s %34s %12s %13.2f %17.2f\n", "Annual Projection:", distanceAP, gallonsAP, mpgAP, costAP); 
    }
}
