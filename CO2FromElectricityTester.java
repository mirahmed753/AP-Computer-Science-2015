
/**
 * THE CO2FromElectricityTester class tests the CO2FromElectricity class by creating two arrayLists
 * containing monthly bills and prices which is then used to calculate annual CO2 emissions.
 * 
 * @author Mir Ahmed 
 * @version 11/16/14
 */
import java.util.ArrayList;
public class CO2FromElectricityTester
{
    public static void main(String [] args) 
    {
        //create and intantiate object
        CO2FromElectricity myCO2 = new CO2FromElectricity(); 
        //create arrayLists
        ArrayList<Double> monthlyBill = new ArrayList<Double>();
        ArrayList<Double> monthlyPrice = new ArrayList<Double>();
        //add elements to monthlyBill arrayList
        monthlyBill.add(223.45);
        monthlyBill.add(197.32);
        monthlyBill.add(209.78); 
        //add elements to monthlyPrice arrayList
        monthlyPrice.add(223.45/2623);
        monthlyPrice.add(197.32/2311);
        monthlyPrice.add(209.78/2468);
        //declare variables and call on methods 
        double avgBill = myCO2.calcAvgBill(monthlyBill);
        double avgPrice = myCO2.calcAvgPrice(monthlyPrice);
        double emissions = myCO2.calcElectricityCO2(avgBill, avgPrice);
        //print statements 
        System.out.printf("Average Monthly Electricity Bill: $%6.2f\n", avgBill);
        System.out.printf("Average Monthly Electricity Price: $%5.2f\n", avgPrice);
        System.out.printf("Annual CO2 Emissions from Electricity Usage: %8.2f pounds", emissions);
    }
}
