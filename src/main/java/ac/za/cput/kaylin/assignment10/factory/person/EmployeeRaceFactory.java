package ac.za.cput.kaylin.assignment10.factory.person;

import ac.za.cput.kaylin.assignment10.domain.person.EmployeeRace;

public class EmployeeRaceFactory
{
    public static EmployeeRace getEmployeeRace(String empNum, String raceId)
    {
        return new EmployeeRace.Builder().empNum(empNum)
                .raceId(raceId)
                .build();
    }
}
