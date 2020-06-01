import Staff.TechStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    private Developer developer;

    @Before
    public void before(){
        developer = new Developer("Jim Mcjim", "AN123456M", 25000.00);
    }

    @Test
    public void hasName(){
        assertEquals("Jim Mcjim", developer.getName());
    }

    @Test
    public void hasNiNumber(){
        assertEquals("AN123456M", developer.getNiNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(25000.00, developer.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(2000.00);
        assertEquals(27000.00, developer.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(250.00, developer.payBonus(), 0.01);
    }

}
