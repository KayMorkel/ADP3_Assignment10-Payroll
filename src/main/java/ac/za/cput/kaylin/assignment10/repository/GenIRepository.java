package ac.za.cput.kaylin.assignment10.repository;

public interface GenIRepository<T, ID>
{
    T create(T t);
    T read(ID id);
    T update(T t);
    void delete(ID id);
}
