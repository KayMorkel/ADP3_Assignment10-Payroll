package ac.za.cput.kaylin.assignment10.factory.demography;

import ac.za.cput.kaylin.assignment10.domain.demography.Race;

public class RaceFactory
{
    public static Race getRace(String id, String descr)
    {
        return new Race.Builder().raceId(id)
                .raceDescr(descr)
                .build();
    }
}
