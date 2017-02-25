
/**
 * THE CO2FromElectricity class creates a default constructor and defines methods to calculate 
 * electricity bills, prices, and emissions. 
 * 
 * @author Mir Ahmed
 * @version 11/16/14
 */
import java.util.ArrayList;
public class CO2FromElectricity
{
    CO2FromElectricity()
    {
    }
    //method to calculate average bill
    public double calcAvgBill(ArrayList<Double> monthlyBill)
    {
        double sum = 0; 
        for(int i = 0; i < monthlyBill.size(); i++)
        {
            sum += monthlyBill.get(i);
        }
        return sum/monthlyBill.size(); 
    }
    //method to calculate average price
    public double calcAvgPrice(ArrayList<Double> monthlyPrice)
    {
        double sum = 0; 
        for(int i = 0 ; i < monthlyPrice.size(); i++)
        {
            sum+= monthlyPrice.get(i);
        }
        return sum/monthlyPrice.size(); 
    }
    //method to calculate electricty from CO2
    public double calcElectricityCO2(double avgBill, double avgPrice)
    {
        return (avgBill/avgPrice) * 1.37 * 12;
    }
}
