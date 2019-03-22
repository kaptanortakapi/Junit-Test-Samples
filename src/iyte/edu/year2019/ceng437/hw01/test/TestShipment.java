package iyte.edu.year2019.ceng437.hw01.test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import iyte.edu.year2019.ceng437.hw01.DeliveryDay;
import iyte.edu.year2019.ceng437.hw01.Shipment;
/**
 * @author Mert Temiz
 *
 */
@RunWith(Parameterized.class)
public class TestShipment {
	
	private int purchaseAmount;
	private int numberOfItems;
	private DeliveryDay deliveryDay;
	private Shipment shipment;
	


	public TestShipment(int purchaseAmount, 
			int numberOfItems, 
			DeliveryDay deliveryDay) {

		this.purchaseAmount=purchaseAmount;
		this.numberOfItems=numberOfItems;
		this.deliveryDay=deliveryDay;
	}
	
	/* Function below returns the list elements by assigning them to TestShipment constructor
	 as arguments so that i can test more than one case with this function.*/
     @Parameters
     public static Collection<Object[]> data() {
         return Arrays.asList(new Object[][] {
        	 	
        	 	//random tests and boundary test below
	        	 { 10, 1, DeliveryDay.IN_A_WEEK},
	             { 40, 2, DeliveryDay.IN_TWO_DAYS},
	             { 90, 4, DeliveryDay.NEXT_DAY},
	             { 110, 7, DeliveryDay.IN_A_WEEK},
	             { 160, 8, DeliveryDay.IN_TWO_DAYS},
	             { 210, 9, DeliveryDay.NEXT_DAY},
	             { 220, 20, DeliveryDay.IN_A_WEEK},
	             { 310, 25, DeliveryDay.IN_TWO_DAYS},
	             { 410, 30, DeliveryDay.NEXT_DAY},
             
        	 	  { 10, 1, DeliveryDay.IN_A_WEEK },
                  { 10, 1, DeliveryDay.IN_TWO_DAYS },
                  { 10, 1, DeliveryDay.NEXT_DAY },
                  
                  { 10, 4, DeliveryDay.IN_A_WEEK },
                  { 10, 4, DeliveryDay.IN_TWO_DAYS },
                  { 10, 4, DeliveryDay.NEXT_DAY },
                  
                  { 10, 5, DeliveryDay.IN_A_WEEK },
                  { 10, 5, DeliveryDay.IN_TWO_DAYS },
                  { 10, 5, DeliveryDay.NEXT_DAY },
                  
                  { 149, 1, DeliveryDay.IN_A_WEEK },
                  { 149, 1, DeliveryDay.IN_TWO_DAYS },
                  { 149, 1, DeliveryDay.NEXT_DAY },
                  
                  { 149, 4, DeliveryDay.IN_A_WEEK },
                  { 149, 4, DeliveryDay.IN_TWO_DAYS },
                  { 149, 4, DeliveryDay.NEXT_DAY },
                  
                  { 149, 5, DeliveryDay.IN_A_WEEK },
                  { 149, 5, DeliveryDay.IN_TWO_DAYS },
                  { 149, 5, DeliveryDay.NEXT_DAY },
                  
                  
                  
                  { 150, 1, DeliveryDay.IN_A_WEEK },
                  { 150, 1, DeliveryDay.IN_TWO_DAYS },
                  { 150, 1, DeliveryDay.NEXT_DAY },
                  
                  { 150, 4, DeliveryDay.IN_A_WEEK },
                  { 150, 4, DeliveryDay.IN_TWO_DAYS },
                  { 150, 4, DeliveryDay.NEXT_DAY },
                  
                  { 150, 5, DeliveryDay.IN_A_WEEK },
                  { 150, 5, DeliveryDay.IN_TWO_DAYS },
                  { 150, 5, DeliveryDay.NEXT_DAY },
                  
                  
                  { 151, 1, DeliveryDay.IN_A_WEEK },
                  { 151, 1, DeliveryDay.IN_TWO_DAYS },
                  { 151, 1, DeliveryDay.NEXT_DAY },
                  
                  { 151, 4, DeliveryDay.IN_A_WEEK },
                  { 151, 4, DeliveryDay.IN_TWO_DAYS },
                  { 151, 4, DeliveryDay.NEXT_DAY },
                  
                  { 151, 5, DeliveryDay.IN_A_WEEK },
                  { 151, 5, DeliveryDay.IN_TWO_DAYS },
                  { 151, 5, DeliveryDay.NEXT_DAY },
                  
                  
                  { 300, 1, DeliveryDay.IN_A_WEEK },
                  { 300, 1, DeliveryDay.IN_TWO_DAYS },
                  { 300, 1, DeliveryDay.NEXT_DAY },
                  
                  { 300, 4, DeliveryDay.IN_A_WEEK },
                  { 300, 4, DeliveryDay.IN_TWO_DAYS },
                  { 300, 4, DeliveryDay.NEXT_DAY },
                  
                  { 300, 5, DeliveryDay.IN_A_WEEK },
                  { 300, 5, DeliveryDay.IN_TWO_DAYS },
                  { 300, 5, DeliveryDay.NEXT_DAY },
               
                  
            });
     }

   //This method runs before test methods.So, i created Shipment object here.
     @Before
     public void setUp() throws Exception {
    	 
    	 shipment = new Shipment(purchaseAmount,numberOfItems,deliveryDay);
         
     }
     
     @After
     public void tearDown() throws Exception {
          
          
     }

     @Test
     public void testGetPurchaseAmount() {
        
    	 assertEquals(shipment.getPurchaseAmount(),purchaseAmount);
     }

     @Test
     public void testGetNumberOfItems() {
    	 
    	 assertEquals(shipment.getNumberOfItems(), numberOfItems);
  
     }
     
     @Test
     public void testGetDeliveryDay() {
    	 
    	 assertEquals(shipment.getDeliveryDay(), deliveryDay);
   
     }
     
     @Test
     public void testToString() {
    	 
 		String testString ="Shipment [purchaseAmount=" + shipment.getPurchaseAmount()
		+ ", numberOfItems=" + shipment.getNumberOfItems() 
		+ ", deliveryDay=" + shipment.getDeliveryDay() + "]";
 		assertEquals(shipment.toString(),testString);
   
     }
     
  

}
