package ac.za.cput.kaylin.assignment10.service;

import ac.za.cput.kaylin.assignment10.domain.person.Employee;
import ac.za.cput.kaylin.assignment10.domain.person.EmployeeGender;
import ac.za.cput.kaylin.assignment10.domain.person.EmployeeRace;
import ac.za.cput.kaylin.assignment10.factory.person.EmployeeFactory;
import ac.za.cput.kaylin.assignment10.factory.person.EmployeeGenderFactory;
import ac.za.cput.kaylin.assignment10.factory.person.EmployeeRaceFactory;
import ac.za.cput.kaylin.assignment10.repository.person.EmployeeGenderRepository;
import ac.za.cput.kaylin.assignment10.repository.person.EmployeeRaceRepository;
import ac.za.cput.kaylin.assignment10.repository.person.EmployeeRepository;
import ac.za.cput.kaylin.assignment10.repository.person.implementation.EmployeeGenderRepositoryImplementation;
import ac.za.cput.kaylin.assignment10.repository.person.implementation.EmployeeRaceRepositoryImplementation;
import ac.za.cput.kaylin.assignment10.repository.person.implementation.EmployeeRepositoryImplementation;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class EmpDetailsServiceImplementationTest
{
    private EmployeeRepository repo;
    private EmployeeRaceRepository raceRepo;
    private EmployeeGenderRepository genRepo;
    Employee empl;
    EmployeeRace employeeRace;
    EmployeeGender employeeGender;

    @Before
    public void setUp() throws Exception
    {
        empl = EmployeeFactory.getEmployee("emp4500", "Jack", "Jill");
        employeeRace = EmployeeRaceFactory.getEmployeeRace(empl.getEmpNum(), "Bla89");
        employeeGender = EmployeeGenderFactory.getEmployeeGender(empl.getEmpNum(), "M45");
       // this.repo = EmployeeRepositoryImplementation.getRepository();
        this.repo = EmployeeRepositoryImplementation.getRepository();
        this.raceRepo = EmployeeRaceRepositoryImplementation.getRepository();
        this.genRepo = EmployeeGenderRepositoryImplementation.getRepository();
    }
    @Test
    public void create()
    {
        Employee e = this.repo.create(empl);
        Assert.assertEquals(empl, e);
    }

    @Test
    public void create1()
    {
        EmployeeRace e = this.raceRepo.create(employeeRace);
        Assert.assertEquals(employeeRace, e);
    }

    @Test
    public void create2()
    {
        EmployeeGender e = this.genRepo.create(employeeGender);
        Assert.assertEquals(employeeGender, e);
    }

    @Test
    public void saveEmp()
    {
        System.out.println(empl.getFirstName() + " " + empl.getLastName() + " " + employeeGender.getGenderId() + " " + employeeRace.getRaceId());
        Assert.assertEquals("Jack Jill M45 Bla89", (this.empl.getFirstName() + " "  + this.empl.getLastName() + " "  +  this.employeeGender.getGenderId()+ " "  + this.employeeRace.getRaceId()));
    }

    @Test
    public void read()
    {
        String empNum = "emp4500";

        Employee emp = this.repo.read(empNum);

        Assert.assertNotEquals(empNum, emp);
    }

    @Test
    public void genRead()
    {
        String empNum = "M45";

        EmployeeGender emp = this.genRepo.read(empNum);

        Assert.assertNotEquals(empNum, emp);
    }

    @Test
    public void raceRead()
    {
        String empNum = "Bla89";

        EmployeeRace emp = this.raceRepo.read(empNum);

        Assert.assertNotEquals(empNum, emp);
    }
}