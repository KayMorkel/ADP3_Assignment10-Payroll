package ac.za.cput.kaylin.assignment10.repository.person;

import ac.za.cput.kaylin.assignment10.domain.person.EmployeeRace;
import ac.za.cput.kaylin.assignment10.factory.person.EmployeeRaceFactory;
import ac.za.cput.kaylin.assignment10.repository.person.implementation.EmployeeRaceRepositoryImplementation;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class EmployeeRaceRepositoryImplementationTest
{
    private EmployeeRaceRepository empRaceRepo;
    private Set<EmployeeRace> emp;
    EmployeeRace empRacel;

    @Before
    public void setUp() throws Exception
    {
        this.empRaceRepo = EmployeeRaceRepositoryImplementation.getRepository();
    }

    @Test
    public void a_create()
    {
        empRacel = EmployeeRaceFactory.getEmployeeRace("emp100", "Bla809");
        EmployeeRace e = this.empRaceRepo.create(empRacel);
        Assert.assertEquals(empRacel, e);
    }

    @Test
    public void b_read()
    {
        String empNum = "emp100";

        EmployeeRace emp = this.empRaceRepo.read(empNum);

        Assert.assertNotEquals(empNum, emp);
    }

    @Test
    public void c_update()
    {
        empRacel = EmployeeRaceFactory.getEmployeeRace("emp100", "Bla809");
        EmployeeRace em = this.empRaceRepo.update(empRacel);

        Assert.assertEquals(empRacel.getEmpNum(), em.getEmpNum());
    }

    @Test
    public void d_delete()
    {
        String empDel = "emp100";
        this.empRaceRepo.delete(empDel);

        emp = this.empRaceRepo.getAll();

        int size = emp.size();
        Assert.assertEquals(0, size);
    }

    @Test
    public void e_getAll()
    {
        emp = this.empRaceRepo.getAll();
        Assert.assertEquals(0, emp.size());
    }
}
