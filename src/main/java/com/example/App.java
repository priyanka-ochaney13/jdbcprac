package com.example;
import java.lang.Thread.State;
import java.sql.*;


public class App 
{
    public static void main( String[] args ) throws Exception {

        String url = "jdbc:postgresql://localhost:5432/demo";
        String uname = "postgres";
        String pwd = "";

        String query = "delete from student where sid=3";
        
        Class.forName("org.postgresql.Driver");
        
        Connection con = DriverManager.getConnection(url, uname, pwd);
        System.out.println("Connection Successful");

        Statement st = con.createStatement();
        //ResultSet rs = st.executeQuery(query);
        //rs.next(); pointing to first row and checks if there is data in the next row or not
        st.execute(query);
        //it will return false for an insert query as there is no data to be returned
        //for select query it will return true as there is data to be returned
        //execute method can be used for any type of query but executeQuery is only for select queries (it returns ResultSet) and execute returns any type of result (boolean)
        con.close();
    }
}
