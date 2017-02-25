
/**
 * THE CO2FromWaste calculates waste emission and reduction information.
 * 
 * @author  Mir Ahmed
 * @version 11/23/14
 */
public class CO2FromWaste
{
    private int numPeople;
    private boolean paper, plastic, glass, cans;
    //constructor 
    CO2FromWaste(int numPeopleP, boolean paperP, boolean plasticP, boolean glassP, boolean cansP)
    {
        numPeople = numPeopleP; 
        paper = paperP; 
        plastic = plasticP; 
        glass = glassP; 
        cans = cansP; 
    }
    //getters and setters 
    public int getNumPeople()
    {
        return numPeople;
    }
    public boolean getPaper()
    {
        return paper;
    }
    public boolean getPlastic()
    {
        return plastic; 
    }
    public boolean getGlass()
    {
        return glass;
    }
    public boolean getCans()
    {
        return cans;
    }
    //method to calculate the gross water emission 
    public double calcGrossWasteEmission()
    {
        return getNumPeople() * 1018;  
    }
    //method to calculate the waste reduction 
    public double calcWasteReduction()
    {
        double sum = 0; 
        if(getPaper() == true) //paper reduces 184 lbs
        {
            sum += (184 * getNumPeople());
        }
        if(getPaper() == true) //plastic reduces 25.6 lbs 
        {
            sum += (184 * getNumPeople());
        }
        if(getPaper() == true) //glass reduces 46.6 lbs
        {
            sum += (184 * getNumPeople());
        }
        if(getPaper() == true) //cans reduces 165.8 lbs
        {
            sum += (184 * getNumPeople());
        }
        return sum; 
    }
    //method to calculate the net waste reduction 
    public double calcNetWasteReduction() 
    {
        return calcGrossWasteEmission() - calcWasteReduction(); 
    }
}
