package ac.za.cput.kaylin.assignment10.factory.person;

import ac.za.cput.kaylin.assignment10.domain.person.EmployeeRace;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeRaceFactoryTest {

    @Test
    public void getEmployeeGender()
    {
        String empNum = "emp200";
        String raceId = "Col098";

        EmployeeRace emp = EmployeeRaceFactory.getEmployeeRace(empNum,raceId);

        Assert.assertEquals(empNum, emp.getEmpNum());
        System.out.println(emp.getEmpNum() + " " + emp.getRaceId());
    }
}