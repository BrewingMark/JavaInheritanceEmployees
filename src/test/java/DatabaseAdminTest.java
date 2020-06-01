import Staff.TechStaff.DatabaseAdmin;
import Staff.TechStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    private DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Jim Jones", "AM123456D", 26000.00);
    }

    @Test
    public void hasName(){
        assertEquals("Jim Jones", databaseAdmin.getName());
    }

    @Test
    public void hasNiNumber(){
        assertEquals("AM123456D", databaseAdmin.getNiNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(26000.00, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary(){
        databaseAdmin.raiseSalary(2000.00);
        assertEquals(28000.00, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(260.00, databaseAdmin.payBonus(), 0.01);
    }

}
