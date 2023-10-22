package ru.avalakh.data;

import ru.avalakh.domain.Note;

import java.sql.*;
import java.util.*;

public class DataBaseNotesRepository implements NoteRepository{
    static Properties properties=new Properties();
    @Override
    public List<Note> findAllByUsername(String username) {
        properties.setProperty("user","postgres");
        properties.setProperty("password", "secret");
        List<Note> store = null;// = new ArrayList();
        try {
            String url = "jdbc:postgresql://192.168.50.101:32782/postgres";
            Connection conn = DriverManager.getConnection(url, properties);
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from notes n where username ='"+username+"'");

            if(rs.next()){
                do {
                    store.add(new Note(rs.getString(1),rs.getString(2)));
                } while(rs.next());
                return store;

            } else {
                return Collections.emptyList();
            }
//            st.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void save(Note note) {
        if(note.noteToString() != null && !note.noteToString().isEmpty()){
        properties.setProperty("user","postgres");
        properties.setProperty("password", "secret");
        try {
            String url = "jdbc:postgresql://192.168.50.101:32782/postgres";
            Connection conn = DriverManager.getConnection(url, properties);
            PreparedStatement st = conn.prepareStatement("INSERT INTO public.notes (username,\"noteText\") VALUES ('"+note.username()+"','"+note.noteToString()+"')");
            int rowAdded = st.executeUpdate();
            System.out.println("Added " + rowAdded + " note to DB!");
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        }
    }
}
