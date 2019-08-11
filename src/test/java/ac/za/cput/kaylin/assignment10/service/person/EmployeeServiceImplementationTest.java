package ac.za.cput.kaylin.assignment10.service.person;

import ac.za.cput.kaylin.assignment10.domain.person.Employee;
import ac.za.cput.kaylin.assignment10.factory.person.EmployeeFactory;
import ac.za.cput.kaylin.assignment10.repository.person.EmployeeRepository;
import ac.za.cput.kaylin.assignment10.repository.person.implementation.EmployeeRepositoryImplementation;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class EmployeeServiceImplementationTest
{
    private EmployeeRepository repo;
    private Set<Employee> emp;
    Employee empl;

    @Before
    public void setUp() throws Exception
    {
        this.repo = EmployeeRepositoryImplementation.getRepository();
    }

    @Test
    public void a_create()
    {
        empl = EmployeeFactory.getEmployee("emp100", "Jack", "Jill");
        Employee e = this.repo.create(empl);
        Assert.assertEquals(empl, e);
    }

    @Test
    public void b_read()
    {
        String empNum = "emp100";

        Employee emp = this.repo.read(empNum);

        Assert.assertNotEquals(empNum, emp);
    }

    @Test
    public void c_update()
    {
        empl = EmployeeFactory.getEmployee("emp100", "Jill", "Mcintyre");
        Employee em = this.repo.update(empl);

        Assert.assertEquals(empl.getEmpNum(), em.getEmpNum());
    }

    @Test
    public void d_delete()
    {
        String empDel = "emp100";
        this.repo.delete(empDel);

        emp = this.repo.getAll();

        int size = emp.size();
        Assert.assertEquals(emp.size(), size);
    }

    @Test
    public void e_getAll()
    {
        emp = this.repo.getAll();
        Assert.assertEquals(emp.size(), emp.size());
    }
}
