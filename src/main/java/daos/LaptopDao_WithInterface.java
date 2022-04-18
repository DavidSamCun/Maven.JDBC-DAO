package daos;

import models.Laptop;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LaptopDao_WithInterface implements DAO_Interface {

    public ConnectionFactory connectionFactory = new ConnectionFactory();
    String table = "laptop"; ;


    public Laptop findById(int id) {

                Connection connection = connectionFactory.getConnection();
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("Select * From " + table +" Where id = " + id);

            if(rs.next()){
                Laptop laptop = extractUserFromResultSet(rs);

                return laptop;
            }
        }
        catch (SQLException ex){
            ex.printStackTrace();
        }


        return null;
    }

    public List findall() {
        Connection connection = connectionFactory.getConnection();

        try{
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("Select * From " + table);

            Set laptops = new HashSet();

            while(rs.next())
            {
                Laptop laptop = extractUserFromResultSet(rs);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
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

    private Laptop extractUserFromResultSet(ResultSet rs) throws SQLException {
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
