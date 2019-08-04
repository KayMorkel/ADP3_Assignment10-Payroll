package ac.za.cput.kaylin.assignment10.service.person;

import ac.za.cput.kaylin.assignment10.domain.person.Employee;
import ac.za.cput.kaylin.assignment10.service.GenIService;

import java.util.Set;

public interface EmployeeService extends GenIService<Employee, String>
{
    Set<Employee> getAll();
}
