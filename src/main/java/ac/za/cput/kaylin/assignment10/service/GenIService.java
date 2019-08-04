package ac.za.cput.kaylin.assignment10.service;

public interface GenIService <T, ID>
{
    T create(T t);
    T read(ID id);
    T update(T t);
    void delete(ID id);
}
