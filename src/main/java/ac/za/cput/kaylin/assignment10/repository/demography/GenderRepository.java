package ac.za.cput.kaylin.assignment10.repository.demography;

import ac.za.cput.kaylin.assignment10.domain.demography.Gender;
import ac.za.cput.kaylin.assignment10.repository.GenIRepository;

import java.util.Set;

public interface GenderRepository extends GenIRepository<Gender, String>
{
    Set<Gender> getAll();
}