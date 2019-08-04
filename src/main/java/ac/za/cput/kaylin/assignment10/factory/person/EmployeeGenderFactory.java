package ac.za.cput.kaylin.assignment10.factory.person;

import ac.za.cput.kaylin.assignment10.domain.person.EmployeeGender;

public class EmployeeGenderFactory
{
    public static EmployeeGender getEmployeeGender(String empNum, String genderId)
    {
        return new EmployeeGender.Builder().empNum(empNum)
                .genderId(genderId)
                .build();
    }
}
