package ac.za.cput.kaylin.assignment10.service;

import ac.za.cput.kaylin.assignment10.domain.person.Employee;
import ac.za.cput.kaylin.assignment10.domain.person.EmployeeGender;
import ac.za.cput.kaylin.assignment10.domain.person.EmployeeRace;
import ac.za.cput.kaylin.assignment10.repository.person.EmployeeGenderRepository;
import ac.za.cput.kaylin.assignment10.repository.person.EmployeeRaceRepository;
import ac.za.cput.kaylin.assignment10.repository.person.EmployeeRepository;
import ac.za.cput.kaylin.assignment10.repository.person.implementation.EmployeeGenderRepositoryImplementation;
import ac.za.cput.kaylin.assignment10.repository.person.implementation.EmployeeRaceRepositoryImplementation;
import ac.za.cput.kaylin.assignment10.repository.person.implementation.EmployeeRepositoryImplementation;

public class EmpDetailsServiceImplementation
{
    //1 - create a service object
    private static EmpDetailsServiceImplementation service = null;
    //2 - create a repo reference object
    private EmployeeRepository repository;
    private EmployeeRaceRepository raceRepository;
    private EmployeeGenderRepository genRepository;

    //3 - create constructor for this repository implementation
    private EmpDetailsServiceImplementation()
    {
        //get repository
        this.repository = EmployeeRepositoryImplementation.getRepository();
        this.raceRepository = EmployeeRaceRepositoryImplementation.getRepository();
        this.genRepository = EmployeeGenderRepositoryImplementation.getRepository();
    }

    //4 - create a get method for service
    public static EmpDetailsServiceImplementation getService()
    {
        if (service == null)
            service = new EmpDetailsServiceImplementation();

        return service;
    }

    public Employee create(Employee employee) {
        return this.repository.create(employee);
    }
    public Employee read(String s) {
        return this.repository.read(s);
    }
    public EmployeeGender create(EmployeeGender employeeGender) {
        return this.genRepository.create(employeeGender);
    }
    public EmployeeGender genRead(String a) {return this.genRepository.read(a);
    }
    public EmployeeRace create(EmployeeRace employeeRace) {
        return this.raceRepository.create(employeeRace);
    }
    public EmployeeRace raceRead(String a) {return this.raceRepository.read(a);
}
    
    /*public String saveEmp(String fn, String ln, String gen, String race)
    {
        return fn + " " + ln + " " + gen + " " + race;
    }*/
}
