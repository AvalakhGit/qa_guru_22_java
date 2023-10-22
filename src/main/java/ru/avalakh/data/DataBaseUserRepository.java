package ru.avalakh.data;


import ru.avalakh.domain.User;

import java.util.Optional;
import java.util.Properties;
import java.sql.*;

public class DataBaseUserRepository implements UserRepository{
    static Properties properties=new Properties();
    @Override
    public Optional<User> findByUsername(String username) {
        properties.setProperty("user","postgres");
        properties.setProperty("password", "secret");

        try {
            String url = "jdbc:postgresql://192.168.50.101:32782/postgres";
            Connection conn = DriverManager.getConnection(url, properties);
            PreparedStatement st = conn.prepareStatement("select * from public.users u where username ='"+username+"'");
            ResultSet rs = st.executeQuery();
            if(rs.next()){
                return Optional.of(
                        new User(
                                rs.getString(1),
                                rs.getString(2)
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
