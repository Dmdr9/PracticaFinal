package com.mycompany.cconexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CConexion {
    Connection conex;
    
    //JDBC driver nombre y base de datos URL
         final String JDBC_DRIVER="com.microsoft.sqlserver.jdbc.SQLServerDriver";
         final String DB_URL="jdbc:sqlserver://localhost:1433;databaseName=Northwind;encrypt=true;trustServerCertificate=true";
        
    //Base de datos credenciales
         final String USER="sa";
         final String PASS="1234";
         
         public void conectar() throws  Exception{
             try {
                  Class.forName(JDBC_DRIVER);
                  conex= (Connection) DriverManager.getConnection(DB_URL,USER,PASS);
             } catch (Exception e) {
                 throw e;
             }
         }
         
         public void cerrar() throws SQLException{
             if(conex!=null){
                 if(!conex.isClosed()){
                     conex.close();
                 }
             }
         }

    void conex() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}