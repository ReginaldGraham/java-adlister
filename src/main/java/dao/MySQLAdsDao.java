package dao;

import com.mysql.cj.jdbc.Driver;
import models.Ad;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class MySQLAdsDao implements Ads {
    private Connection connection;

    public MySQLAdsDao(Config config){
        try {
            DriverManager.registerDriver(new Driver());
        this.connection=DriverManager.getConnection(
                config.getUrl(),
                config.getUser(),
                config.getPassword()
        );
        } catch (SQLException e) {
            throw new RuntimeException(e);
//            e.printStackTrace();
        }
    }
    @Override
    public List<Ad> all() {
        List<Ad> ads = new ArrayList<>();
        String query = "SELECT * FROM ads";
        try {
            Statement statement = connection.createStatement();
            ResultSet rs=statement.executeQuery(query);
            while (rs.next()){
                Ad ad=new Ad(
                        rs.getLong("id"),
                        rs.getLong("user_id"),
                        rs.getString("title"),
                        rs.getString("description")
                );
                ads.add(ad);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return ads;
    }

    @Override
    public Long insert(Ad ad) {
        Long lastInsertedId =0L;
        try {
            Statement statement = connection.createStatement();
            String insertQuery= String.format("INSERT INTO ads (user_id, title, description) VALUES (%d, '%s', '%s')",
            ad.getUserId(), ad.getTitle(), ad.getDescription());
            statement.executeUpdate(insertQuery, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = statement.getGeneratedKeys();
            rs.next();
            lastInsertedId=rs.getLong(1);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return lastInsertedId;
    }

//    public static void main(String[] args) {
//        MySQLAdsDao mySQLAdsDao=new MySQLAdsDao(new Config());
//        Ad adtoinsert=new Ad(
//             1,
//             "Test Insert Ad",
//                "Test Insert Ad Description"
//        );
//        System.out.println(mySQLAdsDao.insert(adtoinsert));
//
//    }
}
