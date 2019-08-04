package ac.za.cput.kaylin.assignment10.repository.person;

import ac.za.cput.kaylin.assignment10.domain.person.Employee;
import ac.za.cput.kaylin.assignment10.factory.person.EmployeeFactory;
import ac.za.cput.kaylin.assignment10.repository.person.implementation.EmployeeRepositoryImplementation;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class EmployeeRepositoryImplementationTest
{
    //@Autowired
    private EmployeeRepository empRepository;
    private Set<Employee> emp;
    Employee empl;

    @Before
    public void setUp() throws Exception
    {
        this.empRepository = EmployeeRepositoryImplementation.getRepository();
    }

    @Test
    public void a_create()
    {
        empl = EmployeeFactory.getEmployee("emp100", "Jack", "Jill");
        Employee e = this.empRepository.create(empl);
        Assert.assertEquals(empl, e);
    }

    @Test
    public void b_read()
    {
        String empNum = "emp100";

        Employee emp = this.empRepository.read(empNum);

        Assert.assertNotEquals(empNum, emp);
    }

    @Test
    public void c_update()
    {
        empl = EmployeeFactory.getEmployee("emp100", "Jill", "Mcintyre");
        Employee em = this.empRepository.update(empl);

        Assert.assertEquals(empl.getEmpNum(), em.getEmpNum());
        System.out.println(empl.getEmpNum() + " " + empl.getFirstName() + " " + em.getEmpNum() + " " + em.getFirstName());
    }

    @Test
    public void d_delete()
    {
        String empDel = "emp100";
        this.empRepository.delete(empDel);

        emp = this.empRepository.getAll();

        int size = emp.size();
        Assert.assertEquals(0, size);
    }

    @Test
    public void e_getAll()
    {
        emp = this.empRepository.getAll();
        Assert.assertEquals(0, emp.size());
    }
}