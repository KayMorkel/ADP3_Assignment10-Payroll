package ac.za.cput.kaylin.assignment10.repository.person;

import ac.za.cput.kaylin.assignment10.domain.person.EmployeeGender;
import ac.za.cput.kaylin.assignment10.repository.GenIRepository;

import java.util.Set;

public interface EmployeeGenderRepository extends GenIRepository<EmployeeGender, String>
{
    Set<EmployeeGender> getAll();
}
