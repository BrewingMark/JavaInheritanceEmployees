import Staff.Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    private Manager manager;

    @Before
    public void before(){
        manager = new Manager("Hayley Smith", "JN123456C", 28000.00, "Accounts");
    }

    @Test
    public void hasName(){
        assertEquals("Hayley Smith", manager.getName());
    }

    @Test
    public void hasNiNumber(){
        assertEquals("JN123456C", manager.getNiNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(28000.00, manager.getSalary(), 0.01);
    }

    @Test
    public void hasDeptName(){
        assertEquals("Accounts", manager.getDeptName());
    }

    @Test
    public void canChangeDeptName(){
        manager.setDeptName("Sales");
        assertEquals("Sales", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(2000.00);
        assertEquals(30000.00, manager.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(280.00, manager.payBonus(), 0.01);
    }

    @Test
    public void canChangeName(){
        manager.setName("Tori Williams");
        assertEquals("Tori Williams", manager.getName());
    }

    @Test
    public void cantChangeNameToNull(){
        manager.setName(null);
        assertEquals("Hayley Smith", manager.getName());
    }

    @Test
    public void cantChangeNameIfEmptyl(){
        manager.setName("");
        assertEquals("Hayley Smith", manager.getName());
    }

    @Test
    public void cantHaveNegativeSalaryIncrease(){
        manager.raiseSalary(-1000.00);
        assertEquals(28000.00, manager.getSalary(), 0.01);
    }

}
