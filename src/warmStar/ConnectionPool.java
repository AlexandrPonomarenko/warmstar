package warmStar;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class ConnectionPool {
    private static ConnectionPool instance = null;

    private ConnectionPool(){
        //private constructor
    }


    public static ConnectionPool getInstance(){
        if (instance == null)
            instance = new ConnectionPool();
        return instance;
    }

    public Connection getConnection(){
        Context ctx;
        Connection c = null;
        try {
            ctx = new InitialContext();
            Context context = (Context)ctx.lookup("java:/comp/env");
            DataSource ds = (DataSource)context.lookup("jdbc/mypool");
            c = ds.getConnection();
        } catch (NamingException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return c;
    }

}
