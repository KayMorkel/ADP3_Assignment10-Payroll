package ac.za.cput.kaylin.assignment10.repository.demography;

import ac.za.cput.kaylin.assignment10.domain.demography.Gender;
import ac.za.cput.kaylin.assignment10.factory.demography.GenderFactory;
import ac.za.cput.kaylin.assignment10.repository.demography.implementation.GenderRepositoryImplementation;
import org.junit.*;
import org.junit.runners.MethodSorters;

import java.io.IOException;
import java.util.Set;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class GenderRepositoryImplementationTest
{
    private GenderRepository genderRepo;
    private Set<Gender> genders;
    Gender gen;

    @Before
    public void setUp() throws Exception
    {
        this.genderRepo = GenderRepositoryImplementation.getRepository();
    }

    @Test
    public void b_create() throws IOException
    {
        gen = GenderFactory.getEmployee("M356", "Male");
        Gender gen1 = this.genderRepo.create(gen);
        Assert.assertEquals(gen, gen1);
        System.out.println(gen1.getGenderId() + " " + gen1.getGenderDescr());
    }

    @Test
    public void c_read() throws IOException
    {
        String genFind = "F100";

        Gender gen1 = this.genderRepo.read(genFind);

        Assert.assertNotEquals(genFind, gen1);
    }

    @Test
    public void d_update()
    {
        gen = GenderFactory.getEmployee("M356", "Female");
        Gender g = this.genderRepo.update(gen);
        Assert.assertEquals(gen.getGenderId(), g.getGenderId());
        System.out.println(g.getGenderId() + " " + g.getGenderDescr());
    }

    @Test
    public void e_delete()
    {
        String s = "M356";
        this.genderRepo.delete(s);
        genders = this.genderRepo.getAll();
        int size = genders.size();
        Assert.assertEquals(0, size);
    }

    @Test
    public void f_getAll()
    {
        genders = this.genderRepo.getAll();
        Assert.assertEquals(0, genders.size());

        System.out.println("Set size: " + genders.size());
    }
}
