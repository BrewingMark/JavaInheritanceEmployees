import Staff.Management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    private Director director;

    @Before
    public void before(){
        director = new Director("Joan McDonald", "RV123456C",
                45000.00, "Finance", 85000.00);
    }

    @Test
    public void hasName(){
        assertEquals("Joan McDonald", director.getName());
    }

    @Test
    public void hasNiNumber(){
        assertEquals("RV123456C", director.getNiNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(45000.00, director.getSalary(), 0.01);
    }

    @Test
    public void hasDeptName(){
        assertEquals("Finance", director.getDeptName());
    }

    @Test
    public void hasBudget(){
        assertEquals(85000.00, director.getBudget(), 0.01);
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(2000.00);
        assertEquals(47000.00, director.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(900.00, director.payBonus(), 0.01);
    }

}
