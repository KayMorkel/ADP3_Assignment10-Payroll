package ac.za.cput.kaylin.assignment10.repository.demography;

import ac.za.cput.kaylin.assignment10.domain.demography.Race;
import ac.za.cput.kaylin.assignment10.factory.demography.RaceFactory;
import ac.za.cput.kaylin.assignment10.repository.demography.implementation.RaceRepositoryImplementation;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RaceRepositoryImplementationTest
{
    private RaceRepository raceRepo;
    private Set<Race> races;
    Race race;

    @Before
    public void setUp() throws Exception
    {
        this.raceRepo = RaceRepositoryImplementation.getRepository();
    }

    @Test
    public void a_create()
    {
        race = RaceFactory.getRace("Whi56", "White");
        Race race1 = this.raceRepo.create(race);
        Assert.assertEquals(race, race1);
        System.out.println(race1.getRaceId() + " " + race1.getRaceDescr());
    }

    @Test
    public void b_read()
    {
        String raceFind = "Col356";

        Race race1 = this.raceRepo.read(raceFind);

        Assert.assertNotEquals(raceFind, race1);
    }

    @Test
    public void c_update()
    {
        race = RaceFactory.getRace("Whi56", "Whit");
        Race r = this.raceRepo.update(race);
        Assert.assertEquals(race.getRaceId(), r.getRaceId());
        System.out.println(race.getRaceId() + " " + r.getRaceDescr());
    }

    @Test
    public void d_delete()
    {
        String s = "Whi56";
        this.raceRepo.delete(s);
        races = this.raceRepo.getAll();
        int size = races.size();
        Assert.assertEquals(0, size);
    }

    @Test
    public void e_getAll()
    {
        races = this.raceRepo.getAll();
        Assert.assertEquals(0, races.size());

        System.out.println("Set size: " + races.size());
    }
}