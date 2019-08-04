package ac.za.cput.kaylin.assignment10.factory.demography;

import ac.za.cput.kaylin.assignment10.domain.demography.Race;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RaceFactoryTest
{
    @Test
    public void getEmployee()
    {
        String id = "Col234";
        String descr = "Coloured";

        Race race = RaceFactory.getRace(id, descr);

        Assert.assertEquals(id, race.getRaceId());
        System.out.println(race.getRaceId() + " " + race.getRaceDescr());

    }
}