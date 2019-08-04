package ac.za.cput.kaylin.assignment10.repository.person.implementation;

import ac.za.cput.kaylin.assignment10.domain.person.EmployeeGender;
import ac.za.cput.kaylin.assignment10.domain.person.EmployeeRace;
import ac.za.cput.kaylin.assignment10.factory.person.EmployeeGenderFactory;
import ac.za.cput.kaylin.assignment10.repository.person.EmployeeGenderRepository;

import java.util.HashSet;
import java.util.Set;

public class EmployeeGenderRepositoryImplementation implements EmployeeGenderRepository
{
    //1 - create a repo object
    private static EmployeeGenderRepositoryImplementation empGenRepo = null;
    //2 - create a set of employees object
    private Set<EmployeeGender> empGen;

    //3 - create constructor for this repository implementation
    private EmployeeGenderRepositoryImplementation()
    {
        //this constructor has a Set parameter
        this.empGen = new HashSet<>();
    }

    //4 - create a get method for repository
    public static EmployeeGenderRepository getRepository()
    {
        if (empGenRepo == null)
            empGenRepo = new EmployeeGenderRepositoryImplementation();

        return empGenRepo;
    }

    //5 - do the crude methods now. (Do this by cntrl enter on the implements section on top
    //      , select "implement methods"
    @Override
    public EmployeeGender create(EmployeeGender employeeGender)
    {
        this.empGen.add(employeeGender);
        return employeeGender;
    }

    @Override
    public EmployeeGender read(String s)
    {
        EmployeeGender empGenderFind  = null;

        for (EmployeeGender empGender1: empGen){
            if (empGender1.getEmpNum().equals(s)) {
                System.out.println(empGender1.getEmpNum() + " " + empGender1.getGenderId());
                empGenderFind = EmployeeGenderFactory.getEmployeeGender(s, empGender1.getGenderId());
            }
        }

        return empGenderFind;
    }

    @Override
    public EmployeeGender update(EmployeeGender employeeGender)
    {
        EmployeeGender employee1 = null;
        for (EmployeeGender empl: empGen){
        if (empl.getEmpNum().equals(employeeGender.getEmpNum()))
        {
            empGen.remove(empl);
            employee1 = EmployeeGenderFactory.getEmployeeGender(employeeGender.getEmpNum(), employeeGender.getGenderId());
            this.empGen.add(employee1);
        }}
        return employee1;
    }

    @Override
    public void delete(String s)
    {
        for (EmployeeGender employ: empGen)
        {
            if (employ.getEmpNum().equals(s))
            {
                this.empGen.remove(employ);
                break;
            }
        }

    }

    @Override
    public Set<EmployeeGender> getAll()
    {
        return this.empGen;
    }

}
