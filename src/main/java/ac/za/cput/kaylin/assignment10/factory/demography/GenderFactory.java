package ac.za.cput.kaylin.assignment10.factory.demography;

import ac.za.cput.kaylin.assignment10.domain.demography.Gender;

public class GenderFactory
{
    public static Gender getEmployee(String id, String descr)
    {
        return new Gender.Builder().genderId(id)
                .genderDescr(descr)
                .build();
    }
}
