package daos;

import models.Laptop;

import java.util.Set;

public interface LaptopDaoInterface {
    Laptop getLaptop();
    Set<Laptop> getAllLaptops();
    Laptop getLaptopByMakeAndModel();
    boolean insertLaptop();
    boolean updateLaptop();
    boolean deleteLaptop();

}
