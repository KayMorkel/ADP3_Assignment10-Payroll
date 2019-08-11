package ac.za.cput.kaylin.assignment10.repository.person.implementation;

import ac.za.cput.kaylin.assignment10.domain.person.EmployeeRace;
import ac.za.cput.kaylin.assignment10.factory.person.EmployeeRaceFactory;
import ac.za.cput.kaylin.assignment10.repository.person.EmployeeRaceRepository;

import java.util.HashSet;
import java.util.Set;

public class EmployeeRaceRepositoryImplementation implements EmployeeRaceRepository
{
    //1 - create a repo object
    private static EmployeeRaceRepositoryImplementation empRaceRepo = null;
    //2 - create a set of employees object
    private Set<EmployeeRace> empRace;

    //3 - create constructor for this repository implementation
    private EmployeeRaceRepositoryImplementation()
    {
        //this constructor has a Set parameter
        this.empRace = new HashSet<>();
    }

    //4 - create a get method for repository
    public static EmployeeRaceRepository getRepository()
    {
        if (empRaceRepo == null)
            empRaceRepo = new EmployeeRaceRepositoryImplementation();

        return empRaceRepo;
    }

    //5 - do the crude methods now. (Do this by cntrl enter on the implements section on top
    //      , select "implement methods"
    @Override
    public EmployeeRace create(EmployeeRace employeeRace)
    {
        this.empRace.add(employeeRace);
        return employeeRace;
    }

    @Override
    public EmployeeRace read(String s) {
        EmployeeRace empRaceFind  = null;

        for (EmployeeRace empRacel: empRace){
            if (empRacel.getEmpNum().equals(s)) {
                System.out.println(empRacel.getEmpNum() + " " + empRacel.getRaceId());
                empRaceFind = EmployeeRaceFactory.getEmployeeRace(s, empRacel.getRaceId());
            }
        }

        return empRaceFind;
    }

    @Override
    public EmployeeRace update(EmployeeRace employeeRace) {

        EmployeeRace employee1 = null;
        for (EmployeeRace empl: empRace){
            if (empl.getEmpNum().equals(employeeRace.getEmpNum()))
            {
                empRace.remove(empl);
                employee1 = EmployeeRaceFactory.getEmployeeRace(employeeRace.getEmpNum(), employeeRace.getRaceId());
                this.empRace.add(employee1);
                break;
            }}
        return employee1;
    }

    @Override
    public void delete(String s)
    {
        for (EmployeeRace employ: empRace)
        {
            if (employ.getEmpNum().equals(s))
            {
                this.empRace.remove(employ);
                break;
            }
        }
    }

    @Override
    public Set<EmployeeRace> getAll() {
        return this.empRace;
    }
}
