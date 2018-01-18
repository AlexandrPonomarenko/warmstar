package warmStar;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ControllerDAOBike implements interfaceDAOBike {
    private String userMySQL = "root";
    private String passwordMySQL = "root";

    public  ControllerDAOBike(){

    }

//    public Connection getConnection()throws ClassNotFoundException, SQLException {
//        Class.forName("com.mysql.cj.jdbc.Driver");
//        return DriverManager.getConnection("jdbc:mysql://localhost:3306/warmstar?autoReconnect=true&useSSL=false&useLegacyDatetimeCode=false&serverTimezone=UTC",
//                userMySQL, passwordMySQL);
//    }

    @Override
    public Bike getById(int id) {
        Bike bike = new Bike();
        try(Connection c = ConnectionPool.getInstance().getConnection();
            PreparedStatement ps = c.prepareStatement("SELECT * FROM bike WHERE id=? ")){
            ps.setInt(1,id);
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
                bike.setId(resultSet.getInt(1));
                bike.setModel(resultSet.getString(2));
                bike.setSmodel(resultSet.getString(3));
                bike.setColor(resultSet.getString(4));
                bike.setPrice(resultSet.getInt(5));
                bike.setType(resultSet.getString(6));
                bike.setDateadd(resultSet.getDate(7));
                bike.setQuantity(resultSet.getInt(8));
                bike.setPath3(resultSet.getString(9));
                bike.setPath2(resultSet.getString(10));
                bike.setPath1(resultSet.getString(11));
                System.out.println(bike.toString() + "bike");
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return bike;
    }

    @Override
    public void insert(Bike bike) {
        try(Connection c =  ConnectionPool.getInstance().getConnection()){
            PreparedStatement ps;
            ps = c.prepareStatement("INSERT INTO bike (model, smodel, color, price, type, dateadd, quantity, path3, path2, path1) VALUES(?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1,bike.getModel());
            ps.setString(2,bike.getSmodel());
            ps.setString(3,bike.getColor());
            ps.setInt(4,bike.getPrice());
            ps.setString(5,bike.getType());
            ps.setDate(6,bike.getDateadd());
            ps.setInt(7,bike.getQuantity());
            ps.setString(8,bike.getPath3());
            ps.setString(9,bike.getPath2());
            ps.setString(10,bike.getPath1());
            ps.executeUpdate();
            ps.close();
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }

    @Override
    public List<Bike> getAll() {
        List<Bike> bikes = new ArrayList<>();
        try(Connection c =  ConnectionPool.getInstance().getConnection();
            PreparedStatement ps = c.prepareStatement("SELECT * FROM bike")){
            ResultSet r = ps.executeQuery();
            while (r.next()){
                Bike bike = new Bike();
                bike.setId(r.getInt("id"));
                bike.setModel(r.getString("model"));
                bike.setSmodel(r.getString("smodel"));
                bike.setColor(r.getString("color"));
                bike.setPrice(r.getInt("price"));
                bike.setType(r.getString("type"));
                bike.setDateadd(r.getDate("dateadd"));
                bike.setQuantity(r.getInt("quantity"));
                bike.setPath3(r.getString("path3"));
                bike.setPath2(r.getString("path2"));
                bike.setPath1(r.getString("path1"));
                bikes.add(bike);
            }
        }catch (SQLException ee){
            ee.printStackTrace();
        }
        return bikes;
    }

    @Override
    public void update(Bike bike) {
        try(Connection c =  ConnectionPool.getInstance().getConnection()){
            PreparedStatement preparedStatement;
            if(bike.getId() > 0){
                preparedStatement = c.prepareStatement("UPDATE bike SET model=?, smodel=?, color=?, price=?,type=?,dateadd=?,quantity=?,path3=?,path2=?,path1=? WHERE id =?");
                preparedStatement.setInt(11,bike.getId());
                preparedStatement.setString(1,bike.getModel());
                preparedStatement.setString(2,bike.getSmodel());
                preparedStatement.setString(3,bike.getColor());
                preparedStatement.setInt(4,bike.getPrice());
                preparedStatement.setString(5,bike.getType());
                preparedStatement.setDate(6,bike.getDateadd());
                preparedStatement.setInt(7,bike.getQuantity());
                preparedStatement.setString(8,bike.getPath3());
                preparedStatement.setString(9,bike.getPath2());
                preparedStatement.setString(10,bike.getPath1());
                preparedStatement.executeUpdate();
                preparedStatement.close();
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }

    @Override
    public void deleteById(int id) {
        try(Connection c =  ConnectionPool.getInstance().getConnection()){
            PreparedStatement ps = c.prepareStatement("DELETE FROM bike WHERE id=?");
            ps.setInt(1,id);
            ps.executeUpdate();
            ps.close();
        }catch (SQLException s){
            s.printStackTrace();
        }
    }

    @Override
    public void deleteAll() {
        try(Connection c =  ConnectionPool.getInstance().getConnection()){
            PreparedStatement ps = c.prepareStatement("DELETE * FROM bike");
            ResultSet rs = ps.executeQuery();
            while (rs.next()){

            }
        }catch (SQLException s){
            s.printStackTrace();
        }
    }
}
