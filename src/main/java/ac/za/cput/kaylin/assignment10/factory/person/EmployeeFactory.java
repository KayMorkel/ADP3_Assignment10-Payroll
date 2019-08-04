package ac.za.cput.kaylin.assignment10.factory.person;

import ac.za.cput.kaylin.assignment10.domain.person.Employee;

public class EmployeeFactory
{
    public static Employee getEmployee(String empNum, String firstName, String lastName)
    {
        return new Employee.Builder().empNum(empNum)
                .firstName(firstName)
                .lastName(lastName)
                .build();
    }
}
