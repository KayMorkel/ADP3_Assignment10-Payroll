package ac.za.cput.kaylin.assignment10.repository.person.implementation;

import ac.za.cput.kaylin.assignment10.domain.person.Employee;
import ac.za.cput.kaylin.assignment10.factory.person.EmployeeFactory;
import ac.za.cput.kaylin.assignment10.repository.person.EmployeeRepository;

import java.util.HashSet;
import java.util.Set;


public class EmployeeRepositoryImplementation implements EmployeeRepository
{
    //1 - create a repo object
    private static EmployeeRepositoryImplementation empRepo = null;
    //2 - create a set of employees object
    private Set<Employee> emp;

    //3 - create constructor for this repository implementation
    private EmployeeRepositoryImplementation()
    {
        //this constructor has a Set parameter
        this.emp = new HashSet<>();
    }

    //4 - create a get method for repository
    public static EmployeeRepository getRepository()
    {
        if (empRepo == null)
        empRepo = new EmployeeRepositoryImplementation();

        return empRepo;
    }

    //5 - do the crude methods now. (Do this by cntrl enter on the implements section on top
    //      , select "implement methods"
    @Override
    public Employee create(Employee employee) {
        this.emp.add(employee);
        return employee;
    }

    @Override
    public Employee read(String s) {
        Employee empFind  = null;

        for (Employee empl: emp){
            if (empl.getEmpNum().equals(s)) {
                System.out.println(empl.getEmpNum() + " " + empl.getFirstName() + " " + empl.getLastName());
                empFind = EmployeeFactory.getEmployee(s, empl.getFirstName(), empl.getLastName());
            }
        }

        return empFind;
    }

    @Override
    public Employee update(Employee employee)
    {
        Employee employee1 = null;
        for (Employee empl: emp){
        if (empl.getEmpNum().equals(employee.getEmpNum()))
        {
            emp.remove(empl);
            employee1 = EmployeeFactory.getEmployee(employee.getEmpNum(), employee.getFirstName(), employee.getLastName());
            this.emp.add(employee1);
        }}
        return employee1;
    }

    @Override
    public void delete(String s)
    {
        for (Employee employ: emp)
        {
            if (employ.getEmpNum().equals(s))
            {
                this.emp.remove(employ);
                break;
            }
        }
    }

    //6 - do the get all method, to return the list of employee
    @Override
    public Set<Employee> getAll()
    {
        return this.emp;
    }

}
