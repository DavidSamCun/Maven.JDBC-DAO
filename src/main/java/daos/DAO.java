package daos;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public abstract class DAO<T> {

    public ConnectionFactory connectionFactory = new ConnectionFactory();
    String db;



    public T findById(int id) throws SQLException {
//        Connection connection = connectionFactory.getConnection();
//        try {
//            Statement stmt = connection.createStatement();
//            ResultSet rs = stmt.executeQuery("Select * From " + db +" Where id = " + id);
//
//        if(rs.next()){
//
//        }
//        }
//        catch (SQLException ex){
//            ex.printStackTrace();
//        }
//

      return null;
    }

    public List<T> findAll(){
        List<T> output = new ArrayList<T>();

        return output;
    }

    public T update(T dto){

        return null;
    }

    public T create(T dto){

        return null;
    }

    public void delete(int id){

    }

}
