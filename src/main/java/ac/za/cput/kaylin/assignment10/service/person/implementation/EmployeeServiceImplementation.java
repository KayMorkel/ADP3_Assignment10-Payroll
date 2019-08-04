package ac.za.cput.kaylin.assignment10.service.person.implementation;

import ac.za.cput.kaylin.assignment10.domain.person.Employee;
import ac.za.cput.kaylin.assignment10.repository.person.EmployeeRepository;
import ac.za.cput.kaylin.assignment10.repository.person.implementation.EmployeeRepositoryImplementation;
import ac.za.cput.kaylin.assignment10.service.person.EmployeeService;

import java.util.Set;

public class EmployeeServiceImplementation implements EmployeeService
{
    //1 - create a service object
    private static EmployeeServiceImplementation service = null;
    //2 - create a repo reference object
    private EmployeeRepository repository;

    //3 - create constructor for this repository implementation
    private EmployeeServiceImplementation()
    {
        //get repository
        this.repository = EmployeeRepositoryImplementation.getRepository();
    }

    //4 - create a get method for service
    public static EmployeeServiceImplementation getService()
    {
        if (service == null)
            service = new EmployeeServiceImplementation();

        return service;
    }

    //CRUD Methods
    @Override
    public Employee create(Employee emp) {
        return this.repository.create(emp);
    }

    @Override
    public Employee read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Employee update(Employee emp) {
        return this.repository.update(emp);
    }

    @Override
    public void delete(String s)
    {
        this.repository.delete(s);
    }

    @Override
    public Set<Employee> getAll() {
        return this.repository.getAll();
    }
}
