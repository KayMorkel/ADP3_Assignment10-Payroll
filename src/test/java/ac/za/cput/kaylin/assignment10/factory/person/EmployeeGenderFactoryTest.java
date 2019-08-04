package ac.za.cput.kaylin.assignment10.factory.person;

import ac.za.cput.kaylin.assignment10.domain.person.EmployeeGender;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeGenderFactoryTest
{

    @Test
    public void getEmployeeGender()
    {
        String empNum = "emp200";
        String genderId = "M345";

        EmployeeGender emp = EmployeeGenderFactory.getEmployeeGender(empNum,genderId);

        Assert.assertEquals(empNum, emp.getEmpNum());
        System.out.println(emp.getEmpNum() + " " + emp.getGenderId());
    }
}