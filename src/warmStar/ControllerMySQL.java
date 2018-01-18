package warmStar;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ControllerMySQL implements interfaceDAO{
    private String userMySQL = "root";
    private String passwordMySQL = "root";
    private String url;
    private User user;

    public  ControllerMySQL(){

    }
    public ControllerMySQL(User user){
        this.user = user;
    }

//    public Connection getConnection()throws ClassNotFoundException, SQLException{
//        Class.forName("com.mysql.cj.jdbc.Driver");
//        return DriverManager.getConnection("jdbc:mysql://localhost:3306/warmstar?autoReconnect=true&useSSL=false&useLegacyDatetimeCode=false&serverTimezone=UTC",
//                userMySQL, passwordMySQL);
//    }
    @Override
    public User getById(int id) {
        User u = new User();
        try(Connection c = ConnectionPool.getInstance().getConnection();
            PreparedStatement ps = c.prepareStatement("SELECT * FROM user WHERE id=? ")){
            ps.setInt(1,id);
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
                u.setId(resultSet.getInt(1));
                u.setNickName(resultSet.getString(2));
                u.setFirstName(resultSet.getString(3));
                u.setLastName(resultSet.getString(4));
                u.setEmail(resultSet.getString(5));
                u.setPhoneNamber(resultSet.getString(6));
                u.setAge(resultSet.getInt(7));
                u.setData(resultSet.getDate(8));
                u.setPasswordTwo(resultSet.getString(9));
                u.setPassword(resultSet.getString(10));
//                System.out.println(u.toString() + "trererer");
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
//        catch (ClassNotFoundException e){
//            e.printStackTrace();
//        }
        return u;
    }

    @Override
    public boolean getByLogin(String login) {
        try(Connection c = ConnectionPool.getInstance().getConnection();
            PreparedStatement ps = c.prepareStatement("SELECT nickname FROM user WHERE nickname=" + "'" + login + "'")){
            ResultSet resultSet = ps.executeQuery();
            if (resultSet.next()){
                resultSet.close();
                return true;
            }
            resultSet.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean validationUser(String login, String password) {
        try(Connection c = ConnectionPool.getInstance().getConnection();
            PreparedStatement ps = c.prepareStatement("SELECT nickname, password FROM user WHERE nickname=" + "'" + login + "'" +" AND password="+ "'" + password + "'")){
            ResultSet resultSet = ps.executeQuery();
            if (resultSet.next()){
                resultSet.close();
                System.out.println("TRUE");
                return true;
            }
            System.out.println("FALSE");
            resultSet.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public int getIdUser(String user) {
        int id;
        int numero = 0;
        String sql = "SELECT id FROM user WHERE nickname=" + "'" + user + "'";
        try(Connection c = ConnectionPool.getInstance().getConnection();
            PreparedStatement ps = c.prepareStatement(sql)){
            ResultSet resultSet = ps.executeQuery();
            if (resultSet.next()){
                id = resultSet.getInt(1);
                resultSet.close();
                return id;
            }
            resultSet.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
        return -1;
    }

    @Override
    public void insert(User user) {
        try(Connection c = ConnectionPool.getInstance().getConnection()){
            PreparedStatement ps;
            ps = c.prepareStatement("INSERT INTO user (nickname, firsname, lastname, email, phonenumber, age, date, repit_password, password) VALUES(?,?,?,?,?,?,?,?,?)");
            ps.setString(1,user.getNickName());
            ps.setString(2,user.getFirstName());
            ps.setString(3,user.getLastName());
            ps.setString(4,user.getEmail());
            ps.setString(5,user.getPhoneNamber());
            ps.setInt(6,user.getAge());
            ps.setDate(7,user.getData());
            ps.setString(8,user.getPasswordTwo());
            ps.setString(9,user.getPassword());
            ps.executeUpdate();
            ps.close();
            System.out.println("OTRABOTAL");
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }

    @Override
    public List<User> getAll() {
        List<User> users = new ArrayList<>();
        try(Connection c = ConnectionPool.getInstance().getConnection();
            PreparedStatement ps = c.prepareStatement("SELECT * FROM user")){
            ResultSet r = ps.executeQuery();
            while (r.next()){
                User u = new User();
                u.setId(r.getInt("id"));
                u.setNickName(r.getString("nickname"));
                u.setFirstName(r.getString("firsname"));
                u.setLastName(r.getString("lastname"));
                u.setEmail(r.getString("email"));
                u.setPhoneNamber(r.getString("phonenumber"));
                u.setAge(r.getInt("age"));
                u.setData(r.getDate("date"));
                u.setPasswordTwo(r.getString("repit_password"));
                u.setPassword(r.getString("password"));
                users.add(u);
            }
        }catch (SQLException ee){
            ee.printStackTrace();
        }
        return users;
    }

    @Override
    public void update(User user) {
        try(Connection c = ConnectionPool.getInstance().getConnection()){
            PreparedStatement preparedStatement;
            if(user.getId() > 0){
                preparedStatement = c.prepareStatement("UPDATE user SET nickname=?, firsname=?, lastname=?,email=?,phonenumber=?,age=?,date=?, repit_password=?,password=? WHERE id =?");
                preparedStatement.setInt(8,user.getId());
                preparedStatement.setString(1,user.getNickName());
                preparedStatement.setString(2,user.getFirstName());
                preparedStatement.setString(3,user.getLastName());
                preparedStatement.setString(4,user.getEmail());
                preparedStatement.setString(5,user.getPhoneNamber());
                preparedStatement.setInt(6,user.getAge());
                preparedStatement.setDate(7,user.getData());
                preparedStatement.setString(8,user.getPasswordTwo());
                preparedStatement.setString(9,user.getPassword());
                preparedStatement.executeUpdate();
                preparedStatement.close();
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }

    @Override
    public void deleteById(int id) {
        try(Connection c = ConnectionPool.getInstance().getConnection()){
            PreparedStatement ps = c.prepareStatement("DELETE FROM user WHERE id=?");
            ps.setInt(1,id);
            ps.executeUpdate();
            ps.close();
        }catch (SQLException s){
            s.printStackTrace();
        }
    }

    @Override
    public void deleteAll() {
        try(Connection c = ConnectionPool.getInstance().getConnection();){
            PreparedStatement ps = c.prepareStatement("DELETE * FROM user");
            ResultSet rs = ps.executeQuery();
            while (rs.next()){

            }
        }catch (SQLException s){
            s.printStackTrace();
        }
    }

}
