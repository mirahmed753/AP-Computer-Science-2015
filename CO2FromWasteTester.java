
/**
 * THE CO2FromWasteTester class tests the CO2FromWaste class by creating
 * an ArrayList and objects corresponding to the CO2FromWaste class.
 * 
 * @author Mir Ahmed
 * @version 11/23/14
 */
import java.util.ArrayList;
public class CO2FromWasteTester
{
    public static void main (String [] args)
    { 
        ArrayList<CO2FromWaste> wasteEmission = new ArrayList<CO2FromWaste>();
        wasteEmission.add(new CO2FromWaste(1, true, true, true, true));
        wasteEmission.add(new CO2FromWaste(3, true, false, true, true));
        wasteEmission.add(new CO2FromWaste(5, true, false, false, true));
        wasteEmission.add(new CO2FromWaste(2, false, true, false, true));
        wasteEmission.add(new CO2FromWaste(6, false, false, false, false));
        wasteEmission.add(new CO2FromWaste(4, true, true, true, true));
        
        CO2FromWaste dataRecord; //create a new object
        //create for lool to reiterate through elements 
        for(int i = 0; i < wasteEmission.size(); i++)
        {
            dataRecord = wasteEmission.get(i);
            dataRecord.calcGrossWasteEmission();
            dataRecord.calcWasteReduction();
            dataRecord.calcNetWasteReduction();
        }
        //print statements
        System.out.println("     \t      \t                               \t     \t              \t Pounds of CO2     ");
        System.out.println("     \t      \t      Household Waste Recycled \t     \t     Total    \t               Net");
        System.out.println("Index\tPeople\t    Paper    Plastic\t Glass\t    Cans    Emission\tReduction    Emission");
        System.out.println("----------------------------------------------------------------------------------------------");
        for(int i = 0; i < wasteEmission.size(); i++)
        {
            dataRecord = wasteEmission.get(i);
            System.out.printf("  %s  |%7s  |  %6s  |  %6s  |  %6s  | %6s |  %6s  |  %7s  |  %7s  |  \n", i, dataRecord.getNumPeople(),
            dataRecord.getPaper(), dataRecord.getPlastic(), dataRecord.getGlass(), dataRecord.getCans(),
            dataRecord.calcGrossWasteEmission(), dataRecord.calcWasteReduction(), dataRecord.calcNetWasteReduction());
        }
        System.out.println("----------------------------------------------------------------------------------------------");
    }
}

