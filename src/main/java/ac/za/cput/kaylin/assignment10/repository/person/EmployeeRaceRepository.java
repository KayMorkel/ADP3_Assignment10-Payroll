package ac.za.cput.kaylin.assignment10.repository.person;

import ac.za.cput.kaylin.assignment10.domain.person.EmployeeRace;
import ac.za.cput.kaylin.assignment10.repository.GenIRepository;

import java.util.Set;

public interface EmployeeRaceRepository extends GenIRepository<EmployeeRace, String>
{
    Set<EmployeeRace> getAll();
}
