package ac.za.cput.kaylin.assignment10.factory.demography;

import ac.za.cput.kaylin.assignment10.domain.demography.Gender;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GenderFactoryTest
{

    @Test
    public void getEmployee()
    {
        String id = "M605";
        String descr = "Male";

        Gender gen = GenderFactory.getEmployee(id,descr);

        Assert.assertEquals(id, gen.getGenderId());
        System.out.println(gen.getGenderId() + " " +  gen.getGenderDescr());
    }
}