package ac.za.cput.kaylin.assignment10.service.demography;

import ac.za.cput.kaylin.assignment10.domain.demography.Gender;
import ac.za.cput.kaylin.assignment10.service.GenIService;

import java.util.Set;

public interface GenderService extends GenIService<Gender, String>
{
    Set<Gender> getAll();
}
