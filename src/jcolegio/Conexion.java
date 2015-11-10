/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jcolegio;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Balrog
 */
public class Conexion {
    public Connection conect;
    Statement st;
    ResultSet rs;
    public  Conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conect= DriverManager.getConnection("jdbc:mysql://192.168.10.35:3306/canem", "root", "");
            st = conect.createStatement();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ColegioNotas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public ResultSet consul(String StringSql) throws SQLException{
        rs = null;
        rs = st.executeQuery(StringSql); 
        return rs;
    }
    public void ingresar (String StringSql) throws SQLException{
        st.executeUpdate(StringSql);
    }
}