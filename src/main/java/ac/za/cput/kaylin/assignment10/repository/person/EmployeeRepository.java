package ac.za.cput.kaylin.assignment10.repository.person;

import ac.za.cput.kaylin.assignment10.domain.person.Employee;
import ac.za.cput.kaylin.assignment10.repository.GenIRepository;

import java.util.Set;

public interface EmployeeRepository extends GenIRepository<Employee, String>
{
    Set<Employee> getAll();
}
