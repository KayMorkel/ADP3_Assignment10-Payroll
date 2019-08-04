package ac.za.cput.kaylin.assignment10.service.person;

import ac.za.cput.kaylin.assignment10.domain.person.EmployeeGender;
import ac.za.cput.kaylin.assignment10.service.GenIService;

import java.util.Set;

public interface EmployeeGenderService extends GenIService<EmployeeGender, String>
{
    Set<EmployeeGender> getAll();
}
