package ac.za.cput.kaylin.assignment10.service.person.implementation;

import ac.za.cput.kaylin.assignment10.domain.person.EmployeeRace;
import ac.za.cput.kaylin.assignment10.repository.person.EmployeeRaceRepository;
import ac.za.cput.kaylin.assignment10.repository.person.implementation.EmployeeRaceRepositoryImplementation;
import ac.za.cput.kaylin.assignment10.service.person.EmployeeRaceService;

import java.util.Set;

public class EmployeeRaceServiceImplementation implements EmployeeRaceService
{
    //1 - create a service object
    private static EmployeeRaceServiceImplementation service = null;
    //2 - create a repo reference object
    private EmployeeRaceRepository repository;

    //3 - create constructor for this repository implementation
    private EmployeeRaceServiceImplementation()
    {
        //get repository
        this.repository = EmployeeRaceRepositoryImplementation.getRepository();
    }

    //4 - create a get method for service
    public static EmployeeRaceServiceImplementation getService()
    {
        if (service == null)
            service = new EmployeeRaceServiceImplementation();

        return service;
    }

    //CRUD Methods
    @Override
    public EmployeeRace create(EmployeeRace race) {
        return this.repository.create(race);
    }

    @Override
    public EmployeeRace read(String s) {
        return this.repository.read(s);
    }

    @Override
    public EmployeeRace update(EmployeeRace race) {
        return this.repository.update(race);
    }

    @Override
    public void delete(String s)
    {
        this.repository.delete(s);
    }

    @Override
    public Set<EmployeeRace> getAll() {
        return this.repository.getAll();
    }
}
