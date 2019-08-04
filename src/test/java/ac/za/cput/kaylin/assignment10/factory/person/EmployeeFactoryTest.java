package ac.za.cput.kaylin.assignment10.factory.person;

import ac.za.cput.kaylin.assignment10.domain.person.Employee;
import ac.za.cput.kaylin.assignment10.factory.person.EmployeeFactory;
import org.junit.Assert;
import org.junit.Test;

public class EmployeeFactoryTest
{
    @Test
    public void getEmployee()
    {
        String empNum = "emp200";
        String firstName = "Paul";
        String lastName = "Lehman";

        Employee emp = EmployeeFactory.getEmployee(empNum,firstName,lastName);

        Assert.assertEquals(empNum, emp.getEmpNum());
        System.out.println(emp.getEmpNum() + " " + emp.getFirstName() + " " +  emp.getLastName());
    }
}