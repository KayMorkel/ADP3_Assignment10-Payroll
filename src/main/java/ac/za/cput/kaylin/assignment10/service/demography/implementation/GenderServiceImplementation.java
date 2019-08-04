package ac.za.cput.kaylin.assignment10.service.demography.implementation;

import ac.za.cput.kaylin.assignment10.domain.demography.Gender;
import ac.za.cput.kaylin.assignment10.repository.demography.GenderRepository;
import ac.za.cput.kaylin.assignment10.repository.demography.implementation.GenderRepositoryImplementation;
import ac.za.cput.kaylin.assignment10.service.demography.GenderService;

import java.util.HashSet;
import java.util.Set;

public class GenderServiceImplementation implements GenderService
{
    //1 - create a service object
    private static GenderServiceImplementation service = null;
    //2 - create a repo reference object
    private GenderRepository repository;

    //3 - create constructor for this repository implementation
    private GenderServiceImplementation()
    {
        //get repository
        this.repository = GenderRepositoryImplementation.getRepository();
    }

    //4 - create a get method for service
    public static GenderServiceImplementation getService()
    {
        if (service == null)
            service = new GenderServiceImplementation();

        return service;
    }

    //CRUD Methods
    @Override
    public Gender create(Gender gender) {
        return this.repository.create(gender);
    }

    @Override
    public Gender read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Gender update(Gender gender) {
        return this.repository.update(gender);
    }

    @Override
    public void delete(String s)
    {
        this.repository.delete(s);
    }

    @Override
    public Set<Gender> getAll() {
        return this.repository.getAll();
    }
}
