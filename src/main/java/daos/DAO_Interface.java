package daos;

import models.Laptop;

import java.util.List;

public interface DAO_Interface<T> {
    public T findById(int id);
    public List findall();

    Laptop update(Laptop dto);

    public T create(Laptop dto);        //How do I
    public void delete(int id);

}
