package iyte.edu.year2019.ceng437.hw01.test;



import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * @author Mert Temiz
 *
 */
@RunWith(Suite.class)
@SuiteClasses({ TestMenu.class, TestShipment.class, TestDecisionTable.class })
public class AllTests {

          //This class is responsible with triggering all other test classes.
}
