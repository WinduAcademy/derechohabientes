/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author ayrtonray
 */
public class conOracle {
    Connection connection = null;
    static conOracle instance = null;

    public conOracle() throws Exception{
       String urlOracle = "jdbc:oracle:thin:@localhost:1521:orcl";
       Class.forName("oracle.jdbc.OracleDriver");
       connection=DriverManager.getConnection(urlOracle,"C##_AYRTON1","mister1");  
    }
    
    public static conOracle getIntances() throws Exception{
        if( instance==null){
            instance= new conOracle();
        }
        return instance;
    }
    
    @Override
    protected void finalize()throws Throwable{
        if(connection.isClosed()){
            connection=null;
            connection.close();
        }
    }
    
    public Connection getConnection(){
        return connection;
    }
    
}
