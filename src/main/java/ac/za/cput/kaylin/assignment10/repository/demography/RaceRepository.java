package ac.za.cput.kaylin.assignment10.repository.demography;

import ac.za.cput.kaylin.assignment10.domain.demography.Race;
import ac.za.cput.kaylin.assignment10.repository.GenIRepository;

import java.util.Set;

public interface RaceRepository extends GenIRepository<Race, String>
{
    Set<Race> getAll();
}