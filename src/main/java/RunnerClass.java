import daos.LaptopDao_WithInterface;
import models.Laptop;

import java.sql.Connection;

public class RunnerClass {

    public static void main(String[] args) {
        ConnectionFactory2 connectionFactory = new ConnectionFactory2();
        Connection connection = connectionFactory.getConnection();

        LaptopDao_WithInterface test = new LaptopDao_WithInterface();

        Laptop getTest = test.findById(3);
        System.out.println(getTest.getCost());

        Laptop postTest = new Laptop();
        postTest.setMake("Acer");
        postTest.setModel("Predetor");
        postTest.setYear(2018);
        postTest.setColor("Black");
        postTest.setCost(820);

        test.create(postTest);

        //test.delete(6); works


    }


}
