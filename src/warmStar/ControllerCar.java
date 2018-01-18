package warmStar;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ControllerCar implements interfaceDAOCar {
    private String userMySQL = "root";
    private String passwordMySQL = "root";

    public  ControllerCar(){

    }

//    public Connection getConnection()throws ClassNotFoundException, SQLException {
//        Class.forName("com.mysql.cj.jdbc.Driver");
//        return DriverManager.getConnection("jdbc:mysql://localhost:3306/warmstar?autoReconnect=true&useSSL=false&useLegacyDatetimeCode=false&serverTimezone=UTC",
//                userMySQL, passwordMySQL);
//    }



    @Override
    public Car getById(int id) {
        Car car = new Car();
        try(Connection c =  ConnectionPool.getInstance().getConnection();
            PreparedStatement ps = c.prepareStatement("SELECT * FROM car WHERE id=? ")){
            ps.setInt(1,id);
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
                car.setId(resultSet.getInt(1));
                car.setModel(resultSet.getString(2));
                car.setSmodel(resultSet.getString(3));
                car.setColor(resultSet.getString(4));
                car.setPrice(resultSet.getInt(5));
                car.setType(resultSet.getString(6));
                car.setDateadd(resultSet.getDate(7));
                car.setQuantity(resultSet.getInt(8));
                car.setPath3(resultSet.getString(9));
                car.setPath2(resultSet.getString(10));
                car.setPath1(resultSet.getString(11));
                System.out.println(car.toString() + "car");
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return car;
    }

    @Override
    public void insert(Car car) {
        try(Connection c =  ConnectionPool.getInstance().getConnection()){
            PreparedStatement ps;
            ps = c.prepareStatement("INSERT INTO car (model, smodel, color, price, type, dateadd, quantity, path3, path2, path1) VALUES(?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1,car.getModel());
            ps.setString(2,car.getSmodel());
            ps.setString(3,car.getColor());
            ps.setInt(4,car.getPrice());
            ps.setString(5,car.getType());
            ps.setDate(6,car.getDateadd());
            ps.setInt(7,car.getQuantity());
            ps.setString(8,car.getPath3());
            ps.setString(9,car.getPath2());
            ps.setString(10,car.getPath1());
            ps.executeUpdate();
            ps.close();
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }

    @Override
    public List<Car> getAll() {
        List<Car> cars = new ArrayList<>();
        try(Connection c =  ConnectionPool.getInstance().getConnection();
            PreparedStatement ps = c.prepareStatement("SELECT * FROM car")){
            ResultSet r = ps.executeQuery();
            while (r.next()){
                Car car = new Car();
                car.setId(r.getInt("id"));
                car.setModel(r.getString("model"));
                car.setSmodel(r.getString("smodel"));
                car.setColor(r.getString("color"));
                car.setPrice(r.getInt("price"));
                car.setType(r.getString("type"));
                car.setDateadd(r.getDate("dateadd"));
                car.setQuantity(r.getInt("quantity"));
                car.setPath3(r.getString("path3"));
                car.setPath2(r.getString("path2"));
                car.setPath1(r.getString("path1"));
                cars.add(car);
            }
        }catch (SQLException ee){
            ee.printStackTrace();
        }
        return cars;
    }

    @Override
    public void update(Car car) {
        try(Connection c =  ConnectionPool.getInstance().getConnection()){
            PreparedStatement preparedStatement;
            if(car.getId() > 0){
                preparedStatement = c.prepareStatement("UPDATE car SET model=?, smodel=?, color=?, price=?,type=?,dateadd=?,quantity=?,path3=?,path2=?,path1=? WHERE id =?");
                preparedStatement.setInt(11,car.getId());
                preparedStatement.setString(1,car.getModel());
                preparedStatement.setString(2,car.getSmodel());
                preparedStatement.setString(3,car.getColor());
                preparedStatement.setInt(4,car.getPrice());
                preparedStatement.setString(5,car.getType());
                preparedStatement.setDate(6,car.getDateadd());
                preparedStatement.setInt(7,car.getQuantity());
                preparedStatement.setString(8,car.getPath3());
                preparedStatement.setString(9,car.getPath2());
                preparedStatement.setString(10,car.getPath1());
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
            PreparedStatement ps = c.prepareStatement("DELETE FROM car WHERE id=?");
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
            PreparedStatement ps = c.prepareStatement("DELETE * FROM car");
            ResultSet rs = ps.executeQuery();
            while (rs.next()){

            }
        }catch (SQLException s){
            s.printStackTrace();
        }
    }
}
