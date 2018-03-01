package warmStar;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ControllerBasket implements interfaceDAOBascet {

    public ControllerBasket(){

    }


    @Override
    public Basket getById(int id) {
        Basket basket = new Basket();
        try(Connection c =  ConnectionPool.getInstance().getConnection();
            PreparedStatement ps = c.prepareStatement("SELECT * FROM basket WHERE idproduct=?")){
            ps.setInt(1,id);
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
                basket.setId(resultSet.getInt(1));
                basket.setIdUser(resultSet.getInt(2));
                basket.setIdProduct(resultSet.getInt(3));
                basket.setTypeProduct(resultSet.getString(4));
                basket.setModel(resultSet.getString(5));
                basket.setSmodel(resultSet.getString(6));
                basket.setCost(resultSet.getInt(7));
                System.out.println(basket.toString() + "car");
            }
            closeRs(resultSet);
        }catch (SQLException e){
            e.printStackTrace();
        }
        return basket;
    }

    @Override
    public void insert(Basket basket) {
        try(Connection c =  ConnectionPool.getInstance().getConnection()){
            PreparedStatement ps;
            ps = c.prepareStatement("INSERT INTO basket (iduser, idproduct, typeproduct, model, smodel, cost) VALUES(?,?,?,?,?,?)");
            ps.setInt(1,basket.getIdUser());
            ps.setInt(2,basket.getIdProduct());
            ps.setString(3,basket.getTypeProduct());
            ps.setString(4,basket.getModel());
            ps.setString(5,basket.getSmodel());
            ps.setInt(6,basket.getCost());
            ps.executeUpdate();
            ps.close();
            System.out.println(getClass().getName() + "insert work");
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }

    @Override
    public ArrayList<Basket> getAllIDUser(int id) {
        ArrayList<Basket> basketIdUser = new ArrayList<>();
        try(Connection c =  ConnectionPool.getInstance().getConnection();
            PreparedStatement ps = c.prepareStatement("SELECT * FROM basket WHERE iduser=" + "'" + id + "'")){
            ResultSet r = ps.executeQuery();
            while (r.next()){
                Basket basket = new Basket();
                basket.setId(r.getInt("id"));
                basket.setIdUser(r.getInt("iduser"));
                basket.setIdProduct(r.getInt("idproduct"));
                basket.setTypeProduct(r.getString("typeproduct"));
                basket.setModel(r.getString("model"));
                basket.setSmodel(r.getString("smodel"));
                basket.setCost(r.getInt("cost"));
                basketIdUser.add(basket);
            }
            closeRs(r);
        }catch (SQLException ee){
            ee.printStackTrace();
        }
        return basketIdUser;
    }

    @Override
    public void deleteByIdUser(int id, String model, String smodel) {
        try(Connection c =  ConnectionPool.getInstance().getConnection()){
            PreparedStatement ps = c.prepareStatement("DELETE FROM basket WHERE iduser=" + "'" + id + "'" + "AND model=" + "'" + model + "'" + "AND smodel=" + "'" + smodel + "'");
            ps.executeUpdate();
            ps.close();
        }catch (SQLException s){
            s.printStackTrace();
        }
    }

    @Override
    public void deleteAllIDUser(int id) {
        try(Connection c =  ConnectionPool.getInstance().getConnection()){
            PreparedStatement ps = c.prepareStatement("DELETE FROM basket WHERE iduser=?");
            ps.setInt(1,id);
            ps.executeUpdate();
            ps.close();
        }catch (SQLException s){
            s.printStackTrace();
        }
        System.out.println("access");
    }
    private void closeRs(ResultSet resultSet){
        try {
            resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
