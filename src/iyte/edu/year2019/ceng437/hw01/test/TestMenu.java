package iyte.edu.year2019.ceng437.hw01.test;





import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collection;


import org.junit.Before;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import iyte.edu.year2019.ceng437.hw01.DeliveryDay;
import iyte.edu.year2019.ceng437.hw01.Menu;


import org.junit.contrib.java.lang.system.*;
import org.junit.runner.RunWith;

/**
 * @author Mert Temiz
 *
 */
@RunWith(Parameterized.class) 
public class TestMenu {

	private Menu menu;
	private String testPurchaseAmount;
	private String testNumberOfItems;
	private String testDeliveryDay;
	private static DeliveryDay testEnumDeliveryDay;
	
	public TestMenu(String testPurchaseAmount, String testNumberOfItems, String testDeliveryDay) 
	{
		this.testPurchaseAmount=testPurchaseAmount;
		this.testNumberOfItems=testNumberOfItems;
		this.testDeliveryDay=testDeliveryDay;
	}
	
	// Function below returns the list elements by assigning them to TestMenu constructor
	// as arguments so that i can test more than one case with this function.
	@Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
       	 	
       	 	//random tests and boundary tests below
        	{"10","1","1"},
        	{"40","2","2"},
        	{"90","4","3"},
        	{"110","7","4"},
        	{"160","8","10"},
        	{"210","9","1"},
        	{"220","20","2"},
        	{"310","25","2"},
        	{"410","30","3"},
        	
        	
        	{"149","1","1"},
        	{"149","1","2"},
        	{"149","1","3"},
        	
        	{"149","4","1"},
        	{"149","4","2"},
        	{"149","4","3"},
        	
        	{"149","5","1"},
        	{"149","5","2"},
        	{"149","5","3"},
        	
        	{"150","1","1"},
        	{"150","1","2"},
        	{"150","1","3"},
        	
        	{"150","4","1"},
        	{"150","4","2"},
        	{"150","4","3"},
        	
        	{"150","5","1"},
        	{"150","5","2"},
        	{"150","5","3"},
        	
        	{"151","1","1"},
        	{"151","1","2"},
        	{"151","1","3"},
        	
        	{"151","4","1"},
        	{"151","4","2"},
        	{"151","4","3"},
        	
        	{"151","5","1"},
        	{"151","5","2"},
        	{"151","5","3"},
        	
        	//default value test for DeliveryDay switch-case(x>3)
        	{"151","5","5"},
        	{"151","5","6"},
        	{"151","5","7"},
        	
        	
      
        	
       	 	 
        	});
        }

    /*this rule implemented for creating fake user inputs while testing.
     * IMPORTANT:I've used an external jar which is located in 'external' directory of my project.
     * */
	@Rule
	public final TextFromStandardInputStream systemInMock = 
				 TextFromStandardInputStream.emptyStandardInputStream();
     
	//This method runs before test methods.So, i created Menu object here.
     @Before
     public void setUp() throws Exception {
    	 
    	menu= new Menu();
    	
     }
     
	@Test
     public void testReadPurchaseAmount() throws Exception {
    	 systemInMock.provideLines(testPurchaseAmount); //takes testPurchaseAmount as user input
    	 if(menu.readPurchaseAmount()<=0) 
    	 {
    		throw new IndexOutOfBoundsException();
    	 }
    	 System.out.println(testPurchaseAmount);
     }
	
	@Test
    public void testNumberOfItems() throws Exception {
   	 systemInMock.provideLines(testNumberOfItems); //takes testNumberOfItems as user input.
   	 if(menu.readNumberOfItems()<=0) 
   	 {
   		throw new IndexOutOfBoundsException();
   	 }
   	 System.out.println(testNumberOfItems);
    }
	
	
	@Test
    public void testDeliveryDay() throws Exception {
	 //if testDeliveryDay is less than 1 it continues to ask user until it is >=1. So i started my test from 1.
   	 //Also when DeliveryDay index is choosen more than 3, the program takes delivery as IN_A_WEEK as default 
	if(testDeliveryDay == "1")
   		 testEnumDeliveryDay = DeliveryDay.NEXT_DAY;
   	 else if(testDeliveryDay == "2")
  		 testEnumDeliveryDay = DeliveryDay.IN_TWO_DAYS;
   	 else if(testDeliveryDay == "3")
  		 testEnumDeliveryDay = DeliveryDay.IN_A_WEEK;
   	 else if(Integer.parseInt(testDeliveryDay)>3)
 		 testEnumDeliveryDay = DeliveryDay.IN_A_WEEK;
   	 
   	 systemInMock.provideLines(testDeliveryDay); //takes testDeliveyrDay as user input
   	 assertTrue(menu.readDeliveryDay().equals(testEnumDeliveryDay));
   	 System.out.println(testDeliveryDay);
   
    }
	
	
	
     
   

}
