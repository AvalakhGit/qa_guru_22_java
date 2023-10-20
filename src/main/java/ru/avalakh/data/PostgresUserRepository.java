package ru.avalakh.data;


import ru.avalakh.domain.User;

import java.util.Optional;
import java.util.Properties;
import java.sql.*;

public class PostgresUserRepository implements UserRepository{
    static Properties properties=new Properties();
    @Override
    public Optional<User> findByUsername(String username) {
        properties.setProperty("user","postgres");
        properties.setProperty("password", "secret");

        try {
            String url = "jdbc:postgresql://192.168.50.101:32782/postgres";
            Connection conn = DriverManager.getConnection(url, properties);
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from users u where username ='"+username+"'");
            if(rs.next()){
                return Optional.of(
                        new User(
                                rs.getString(2),
                                rs.getString(3)
                        )
                );
            } else {
                return Optional.empty();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
