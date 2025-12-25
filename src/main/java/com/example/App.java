package com.example;
import java.lang.Thread.State;
import java.sql.*;
//ResultSet rs = st.executeQuery(query);
//rs.next(); pointing to first row and checks if there is data in the next row or not
//it will return false for an insert query as there is no data to be returned
//for select query it will return true as there is data to be returned
//execute method can be used for any type of query but executeQuery is only for select queries (it returns ResultSet) and execute returns any type of result (boolean)

public class App 
{
    public static void main( String[] args ) throws Exception {

        

        String query = "insert into student values (?, ?, ?)";
        
        Class.forName("org.postgresql.Driver");
        
        Connection con = DriverManager.getConnection(url, uname, pwd);
        System.out.println("Connection Successful");

        PreparedStatement st = con.prepareStatement(query);
        st.setInt(1, sid);
        st.setString(2, sname);
        st.setInt(3, marks);
        st.execute();
        
        con.close();
    }
}
