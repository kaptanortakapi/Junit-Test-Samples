package iyte.edu.year2019.ceng437.hw01.test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import iyte.edu.year2019.ceng437.hw01.DecisionTable;
import iyte.edu.year2019.ceng437.hw01.DeliveryDay;
import iyte.edu.year2019.ceng437.hw01.Shipment;

/**
 * @author Mert Temiz
 *
 */
@RunWith(Parameterized.class)
public class TestDecisionTable {
	
	private static DecisionTable decisionTable;
	private static Shipment shipment;
	
	private int testPurchaseAmount;
	private int testNumberOfItems;
	private DeliveryDay testDeliveryDay;
	private double testResult;

	


	public TestDecisionTable(int purchaseAmount, 
			int numberOfItems, 
			DeliveryDay deliveryDay, double testResult) {

		this.testPurchaseAmount=purchaseAmount;
		this.testNumberOfItems=numberOfItems;
		this.testDeliveryDay=deliveryDay;
		this.testResult=testResult;
	}
	
	
	
	/* Function below returns the list elements by assigning them to TestDecisionTable constructor
	as arguments so that i can test more than one case with this function.
	*/
	@Parameters
	public static Collection<Object[]> data() {
         return Arrays.asList(new Object[][] {
        	 		
        	 		//random tests and boundary tests below
        	 	  
        	 	  { 10, 1, DeliveryDay.IN_A_WEEK, 2.0 },
                  { 40, 2, DeliveryDay.IN_TWO_DAYS, 20.0 },
                  { 90, 4, DeliveryDay.NEXT_DAY, 35.0 },
                  { 110, 7, DeliveryDay.IN_A_WEEK, 10.5},
                  { 160, 8, DeliveryDay.IN_TWO_DAYS, 60.0 },
                  { 210, 9, DeliveryDay.NEXT_DAY, 81.0 },
                  { 220, 20, DeliveryDay.IN_A_WEEK, 70.0 },
                  { 310, 25, DeliveryDay.IN_TWO_DAYS, 187.5 },
                  { 410, 30, DeliveryDay.NEXT_DAY, 270.0 },
                  
                  { 149, 3, DeliveryDay.IN_A_WEEK, 6.0},
                  { 149, 3, DeliveryDay.IN_TWO_DAYS, 20.0 },
                  { 149, 3, DeliveryDay.NEXT_DAY, 35.0  },
                  
                  { 149, 4, DeliveryDay.IN_A_WEEK, 8.0 },
                  { 149, 4, DeliveryDay.IN_TWO_DAYS, 20.0 },
                  { 149, 4, DeliveryDay.NEXT_DAY, 35.0 },
                  
                  { 149, 5, DeliveryDay.IN_A_WEEK, 7.5 },
                  { 149, 5, DeliveryDay.IN_TWO_DAYS, 17.5 },
                  { 149, 5, DeliveryDay.NEXT_DAY, 25.0 },
                  
                  
                  
                  { 150, 3, DeliveryDay.IN_A_WEEK, 6.0 },
                  { 150, 3, DeliveryDay.IN_TWO_DAYS, 20.0 },
                  { 150, 3, DeliveryDay.NEXT_DAY, 35.0 },
                  
                  { 150, 4, DeliveryDay.IN_A_WEEK, 8.0 },
                  { 150, 4, DeliveryDay.IN_TWO_DAYS, 20.0 },
                  { 150, 4, DeliveryDay.NEXT_DAY, 35.0 },
                  
                  { 150, 5, DeliveryDay.IN_A_WEEK , 7.5},
                  { 150, 5, DeliveryDay.IN_TWO_DAYS, 17.5 },
                  { 150, 5, DeliveryDay.NEXT_DAY, 25.0 },
                  
                  
                  { 151, 3, DeliveryDay.IN_A_WEEK, 20.0 },
                  { 151, 3, DeliveryDay.IN_TWO_DAYS, 25.0 },
                  { 151, 3, DeliveryDay.NEXT_DAY, 40.0 },
                  
                  { 151, 4, DeliveryDay.IN_A_WEEK, 20.0},
                  { 151, 4, DeliveryDay.IN_TWO_DAYS, 25.0 },
                  { 151, 4, DeliveryDay.NEXT_DAY, 40.0 },
                  
                  { 151, 5, DeliveryDay.IN_A_WEEK, 17.5 },
                  { 151, 5, DeliveryDay.IN_TWO_DAYS, 37.5 },
                  { 151, 5, DeliveryDay.NEXT_DAY, 45.0 },
                  
                  
                  { 300, 30, DeliveryDay.IN_A_WEEK, 105.0 },
                  { 300, 40, DeliveryDay.IN_TWO_DAYS, 300.0 },
                  { 300, 50, DeliveryDay.NEXT_DAY, 450.0 },
                  
                
               
                  
            });
     }
	
	//This method runs before test methods.So, i created needed objects here.
	@Before
	public void setUp() throws Exception
	{
		decisionTable = new DecisionTable();
		shipment = new Shipment(testPurchaseAmount,testNumberOfItems,testDeliveryDay);
	}
	
	@Test
	public void testCalculateShipmentCost()
	{
		//last argument of assert equals "delta(0)" is the tolerance of compared results
		assertEquals(decisionTable.calculateShipmentCost(shipment), testResult, 0);
		
	}
}
