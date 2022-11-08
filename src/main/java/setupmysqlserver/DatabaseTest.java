package setupmysqlserver;

import org.junit.jupiter.api.*;

import java.sql.SQLException;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class DatabaseTest {


    static Database db;

    @BeforeAll
    static void initDbc() {
        try {
            db = Database.getInstance();
        } catch (SQLException s) {

        }
    }


}
