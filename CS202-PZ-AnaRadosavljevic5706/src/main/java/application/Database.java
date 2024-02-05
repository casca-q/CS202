package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {

    /*
    u bazi nakon pravljenja user and password
    dodeljene su privilegije

    GRANT ALL PRIVILEGES ON it250_anaradosavjevic5706pz.* TO 'ana'@'localhost';

    i
    FLUSH PRIVILEGES;

    sacuvano
     */

        private static final String URL = "jdbc:mysql://localhost:3306/it250_anaradosavjevic5706pz";

        private static final String USER = "ana";
        private static final String PASSWORD = "rizopas";

        public static Connection getConnection() throws SQLException {
                return DriverManager.getConnection(URL, USER, PASSWORD);
        }
}


