package ac.za.cput.kaylin.assignment10.service.demography.implementation;

import ac.za.cput.kaylin.assignment10.domain.demography.Race;
import ac.za.cput.kaylin.assignment10.repository.demography.RaceRepository;
import ac.za.cput.kaylin.assignment10.repository.demography.implementation.GenderRepositoryImplementation;
import ac.za.cput.kaylin.assignment10.repository.demography.implementation.RaceRepositoryImplementation;
import ac.za.cput.kaylin.assignment10.service.demography.RaceService;

import java.util.Set;

public class RaceServiceImplementation implements RaceService
{
    //1 - create a service object
    private static RaceServiceImplementation service = null;
    //2 - create a repo reference object
    private RaceRepository repository;

    //3 - create constructor for this repository implementation
    private RaceServiceImplementation()
    {
        //get repository
        this.repository = RaceRepositoryImplementation.getRepository();
    }

    //4 - create a get method for service
    public static RaceServiceImplementation getService()
    {
        if (service == null)
            service = new RaceServiceImplementation();

        return service;
    }

    //CRUD Methods
    @Override
    public Race create(Race race) {
        return this.repository.create(race);
    }

    @Override
    public Race read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Race update(Race race) {
        return this.repository.update(race);
    }

    @Override
    public void delete(String s)
    {
        this.repository.delete(s);
    }

    @Override
    public Set<Race> getAll() {
        return this.repository.getAll();
    }
}
