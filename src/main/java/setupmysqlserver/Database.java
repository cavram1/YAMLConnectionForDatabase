package setupmysqlserver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {

    static {
        try {
            String d = "com.mysql.jdbc.Driver";

            Class.forName(d);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    public Database(){
    }


    private static Connection connection = null;

    public synchronized static Connection getInstance () {
        if (connection == null) {
            try {
                // erzeuge neue Verbinung zur Datenbank
                connection = DriverManager.getConnection("jdbc:mysql://localhost:5306/webshop?useSSL=false", "webshop", "webshop");
            } catch (SQLException throwables) {
            }
        }
        return connection;
    }

}

