import java.sql.*;

public class SoloModel {
    Connection conn;

    {
        try {
            conn = DriverManager.getConnection(
                        "jdbc:mysql://"+DatabaseLoginData.DBURL + ":" + DatabaseLoginData.port + "/" + DatabaseLoginData.DBname +
                                "? allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        DatabaseLoginData.user, DatabaseLoginData.password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    String getStory(int id) {
        String body = "error";
        try {
            Statement stmt = conn.createStatement();
            String strSelect = "select body from story where id = " + id;
            ResultSet rset = stmt.executeQuery(strSelect);
            body = rset.getString("body");

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return body;
    }
}
