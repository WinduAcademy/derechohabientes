/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import GUI.formulario6052;
import java.sql.Connection;

/**
 *
 * @author ayrtonray
 */
public class test {
    public static void main(String[] args){
        try{
            Connection connection = conOracle.getIntances().getConnection();
            System.out.println("Conecto (y)");
            new formulario6052().setVisible(true);
        }catch(Exception e){
            System.out.println("Error --!");
        }
         
    }
}
