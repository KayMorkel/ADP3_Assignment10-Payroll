package ac.za.cput.kaylin.assignment10.service.demography;

import ac.za.cput.kaylin.assignment10.domain.demography.Race;
import ac.za.cput.kaylin.assignment10.service.GenIService;

import java.util.Set;

public interface RaceService extends GenIService<Race, String>
{
    Set<Race> getAll();
}
