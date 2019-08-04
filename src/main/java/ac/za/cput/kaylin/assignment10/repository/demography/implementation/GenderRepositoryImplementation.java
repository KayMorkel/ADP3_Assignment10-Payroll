package ac.za.cput.kaylin.assignment10.repository.demography.implementation;

import ac.za.cput.kaylin.assignment10.domain.demography.Gender;
import ac.za.cput.kaylin.assignment10.factory.demography.GenderFactory;
import ac.za.cput.kaylin.assignment10.repository.demography.GenderRepository;

import java.util.HashSet;
import java.util.Set;

public class GenderRepositoryImplementation implements GenderRepository
{
    //1 - create a repo object
    private static GenderRepositoryImplementation empRepo = null;
    //2 - create a set of gender object
    private Set<Gender> gen;

    //3 - create constructor for this repository implementation
    private GenderRepositoryImplementation()
    {
        //this constructor has a Set parameter
        this.gen = new HashSet<>();
    }

    //4 - create a get method for repository
    public static GenderRepository getRepository()
    {
        if (empRepo == null)
            empRepo = new GenderRepositoryImplementation();

        return empRepo;
    }

    @Override
    public Gender create(Gender gender)
    {
        this.gen.add(gender);
        return gender;
    }

    @Override
    public Gender read(String s)
    {
        Gender got = null;
        for (Gender gend: gen){
            if (gend.getGenderId().equals(s)) {
                System.out.println(gend.getGenderId() + " " + gend.getGenderDescr());
                got = GenderFactory.getEmployee(s, gend.getGenderId());
            }
        }

        return got;
    }

    @Override
    public Gender update(Gender gender) {

        Gender employee1 = null;
        for (Gender empl: gen){
            if (empl.getGenderId().equals(gender.getGenderId()))
            {
                gen.remove(empl);
                employee1 = GenderFactory.getEmployee(gender.getGenderId(), gender.getGenderDescr());
                this.gen.add(employee1);
            }}
        return employee1;
    }

    @Override
    public void delete(String s)
    {
        for (Gender g: gen)
        {
            if (g.getGenderId().equals(s))
            {
                this.gen.remove(g);
                break;
            }
        }
    }

    @Override
    public Set<Gender> getAll() {
        return this.gen;
    }
}
