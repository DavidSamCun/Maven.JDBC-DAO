package daos;

import models.Laptop;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class LaptopDao_WithInterface implements DAO_Interface {

    public ConnectionFactory connectionFactory = new ConnectionFactory();
    String db;


    public Laptop findById(int id) {

                Connection connection = connectionFactory.getConnection();
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("Select * From " + db +" Where id = " + id);

            if(rs.next()){
                Laptop laptop = new Laptop();

                laptop.setId(rs.getInt("id"));
                laptop.setMake(rs.getString("make"));
                laptop.setModel(rs.getString("model"));
                laptop.setColor(rs.getString("color"));
                laptop.setYear(rs.getInt("year"));
                laptop.setPrice(rs.getInt("price"));

                return laptop;
            }
        }
        catch (SQLException ex){
            ex.printStackTrace();
        }


        return null;
    }

    public List findall() {
        return null;
    }

    public Object update(Object dto) {
        return null;
    }

    public Object create(Object dto) {
        return null;
    }

    public void delete(int id) {

    }
}
