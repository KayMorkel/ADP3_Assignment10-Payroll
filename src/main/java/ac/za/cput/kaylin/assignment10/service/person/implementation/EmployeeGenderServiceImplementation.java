package ac.za.cput.kaylin.assignment10.service.person.implementation;

import ac.za.cput.kaylin.assignment10.domain.person.Employee;
import ac.za.cput.kaylin.assignment10.domain.person.EmployeeGender;
import ac.za.cput.kaylin.assignment10.repository.person.EmployeeGenderRepository;
import ac.za.cput.kaylin.assignment10.repository.person.implementation.EmployeeGenderRepositoryImplementation;
import ac.za.cput.kaylin.assignment10.service.person.EmployeeGenderService;

import java.util.Set;

public class EmployeeGenderServiceImplementation implements EmployeeGenderService
{
    //1 - create a service object
    private static EmployeeGenderServiceImplementation service = null;
    //2 - create a repo reference object
    private EmployeeGenderRepository repository;

    //3 - create constructor for this repository implementation
    private EmployeeGenderServiceImplementation()
    {
        //get repository
        this.repository = EmployeeGenderRepositoryImplementation.getRepository();
    }

    //4 - create a get method for service
    public static EmployeeGenderServiceImplementation getService()
    {
        if (service == null)
            service = new EmployeeGenderServiceImplementation();

        return service;
    }

    //CRUD Methods
    @Override
    public EmployeeGender create(EmployeeGender gender) {
        return this.repository.create(gender);
    }

    @Override
    public EmployeeGender read(String s) {
        return this.repository.read(s);
    }

    @Override
    public EmployeeGender update(EmployeeGender gender) {
        return this.repository.update(gender);
    }

    @Override
    public void delete(String s)
    {
        this.repository.delete(s);
    }

    @Override
    public Set<EmployeeGender> getAll() {
        return this.repository.getAll();
    }
}
