package ac.za.cput.kaylin.assignment10.service.person;

import ac.za.cput.kaylin.assignment10.domain.person.EmployeeGender;
import ac.za.cput.kaylin.assignment10.factory.person.EmployeeGenderFactory;
import ac.za.cput.kaylin.assignment10.repository.person.EmployeeGenderRepository;
import ac.za.cput.kaylin.assignment10.repository.person.implementation.EmployeeGenderRepositoryImplementation;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class EmployeeGenderServiceImplementationTest
{
    private EmployeeGenderRepository empGenRepo;
    private Set<EmployeeGender> empGen;
    EmployeeGender empGenl;

    @Before
    public void setUp() throws Exception
    {
        this.empGenRepo = EmployeeGenderRepositoryImplementation.getRepository();
    }

    @Test
    public void a_create()
    {
        empGenl = EmployeeGenderFactory.getEmployeeGender("emp100", "M345");
        EmployeeGender e = this.empGenRepo.create(empGenl);
        Assert.assertEquals(empGenl, e);
    }

    @Test
    public void b_read()
    {
        String empNum = "emp100";

        EmployeeGender emp = this.empGenRepo.read(empNum);

        Assert.assertNotEquals(empNum, emp);
    }

    @Test
    public void c_update()
    {
        empGenl = EmployeeGenderFactory.getEmployeeGender("emp100", "F906");
        EmployeeGender em = this.empGenRepo.update(empGenl);

        Assert.assertEquals(empGenl.getEmpNum(), em.getEmpNum());
    }

    @Test
    public void d_delete()
    {
        String empDel = "emp100";
        this.empGenRepo.delete(empDel);

        empGen = this.empGenRepo.getAll();

        int size = empGen.size();
        Assert.assertEquals(empGen.size(), size);
    }

    @Test
    public void e_getAll()
    {
        empGen = this.empGenRepo.getAll();
        Assert.assertEquals(empGen.size(), empGen.size());
    }
}
