import com.mysql.jdbc.Driver;

import java.sql.*;


public class JDBCExample {
    public static void main(String[] args) throws SQLException {
        try {
            DriverManager.registerDriver(new Driver());

            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/codeup_test_db?allowPublicKeyRetrieval=true&useSSL=false",
                    "root",
                    "codeup"
            );

            Statement stmt = connection.createStatement();

            String query = " select * from albums;";
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()){
                String artist = rs.getString("artist");
                if (artist.equals("Nirvana")){
                    System.out.println(rs.getString("name_"));
                }
            }

//            if(rs.next()){
//                System.out.println(rs.getString("artist"));
//            }
        }catch (SQLException e){
            throw new RuntimeException();
        }

    }
}
