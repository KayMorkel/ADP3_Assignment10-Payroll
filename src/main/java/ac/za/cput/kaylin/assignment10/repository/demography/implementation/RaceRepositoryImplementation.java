package ac.za.cput.kaylin.assignment10.repository.demography.implementation;

import ac.za.cput.kaylin.assignment10.domain.demography.Race;
import ac.za.cput.kaylin.assignment10.factory.demography.RaceFactory;
import ac.za.cput.kaylin.assignment10.repository.demography.RaceRepository;

import java.util.HashSet;
import java.util.Set;

public class RaceRepositoryImplementation implements RaceRepository
{
    //1 - create a repo object
    private static RaceRepositoryImplementation raceRepo = null;
    //2 - create a set of employees object
    private Set<Race> races;

    //3 - create constructor for this repository implementation
    private RaceRepositoryImplementation()
    {
        //this constructor has a Set parameter
        this.races = new HashSet<>();
    }

    //4 - create a get method for repository
    public static RaceRepository getRepository()
    {
        if (raceRepo == null)
            raceRepo = new RaceRepositoryImplementation();

        return raceRepo;
    }

    @Override
    public Race create(Race race) {
        this.races.add(race);
        return race;
    }

    @Override
    public Race read(String s) {
        Race got = null;
        for (Race ra: races){
            if (ra.getRaceId().equals(s)) {
                System.out.println(ra.getRaceId() + " " + ra.getRaceDescr());
                got = RaceFactory.getRace(s, ra.getRaceId());
            }
        }

        return got;
    }

    @Override
    public Race update(Race race) {

        Race employee1 = null;
        for (Race empl: races){
            if (empl.getRaceId().equals(race.getRaceId()))
            {
                races.remove(empl);
                employee1 = RaceFactory.getRace(race.getRaceId(), race.getRaceDescr());
                this.races.add(employee1);
            }}
        return employee1;
    }

    @Override
    public void delete(String s) {
        for (Race r: races)
        {
            if (r.getRaceId().equals(s))
            {
                this.races.remove(r);
                break;
            }
        }
    }

    @Override
    public Set<Race> getAll(){
        return this.races;

    }
}
