package ac.za.cput.kaylin.assignment10.service.person;

import ac.za.cput.kaylin.assignment10.domain.person.EmployeeRace;
import ac.za.cput.kaylin.assignment10.service.GenIService;

import java.util.Set;

public interface EmployeeRaceService extends GenIService<EmployeeRace, String>
{
    Set<EmployeeRace> getAll();
}
