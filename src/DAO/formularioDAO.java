/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Conexion.conOracle;
import To.personaDerechoHabientesTO;
import To.personaHijosTO;
import To.personaTitularTO;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author ayrtonray
 */
public class formularioDAO {

    Connection connection;

    public ResultSet cargarRegistroEmpleador() throws Exception {
        connection = conOracle.getIntances().getConnection();
        Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        ResultSet rs = statement.executeQuery("SELECT p.IDPERSONA, p.IDTIPOPERSONA,p.IDVINCULO,p.IDSITUACION,p.NUMERODOCUMENTO,p.DESSEXO,p.IDDOMICILIO,p.IDTIPODOCUMENTO,p.IDEMPLEADOR,p.IDINCAPACIDAD,p.IDMOTIVO,p.APELLIDOPAT,p.APELLIDOMAT,p.NOMBRE,p.FECHANACIMIENTO,p.NROCARTAMEDICA,p.CERMEDICO FROM PERSONA p , ASOCIADOA  a WHERE p.IDPERSONA = a.IDPERSONA AND a.IDFORMULARIO = 1");
        return rs;
    }
    
     public ResultSet cargarRegistroPersona() throws Exception {
        connection = conOracle.getIntances().getConnection();
        Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        ResultSet rs = statement.executeQuery("SELECT * FROM PERSONA");
        return rs;
    }
     
    public ResultSet cargarTipoDocumento() throws Exception {
        connection = conOracle.getIntances().getConnection();
        Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        ResultSet rs = statement.executeQuery("select * from tipodedocumento");
        return rs;
    }

    public ResultSet cargarTipoDocumentSexo() throws Exception {
        connection = conOracle.getIntances().getConnection();
        Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        ResultSet rs = statement.executeQuery("select * from sexo");
        return rs;
    }

    public ResultSet cargarVinculo() throws Exception {
        connection = conOracle.getIntances().getConnection();
        Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        ResultSet rs = statement.executeQuery("select * from vinculofamiliar");
        return rs;
    }

    public ResultSet cargarIncapacidad() throws Exception {
        connection = conOracle.getIntances().getConnection();
        Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        ResultSet rs = statement.executeQuery("select * from incapacidad");
        return rs;
    }

    public ResultSet cargarMotivodebaja() throws Exception {
        connection = conOracle.getIntances().getConnection();
        Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        ResultSet rs = statement.executeQuery("select * from motivodebaja");
        return rs;
    }

    public ResultSet cargarSituacion() throws Exception {
        connection = conOracle.getIntances().getConnection();
        Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        ResultSet rs = statement.executeQuery("select * from situacion");
        return rs;
    }

    public ResultSet cargarTipoVia() throws Exception {
        connection = conOracle.getIntances().getConnection();
        Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        ResultSet rs = statement.executeQuery("select * from tipodevia");
        return rs;
    }

    public ResultSet cargarTipoZona() throws Exception {
        connection = conOracle.getIntances().getConnection();
        Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        ResultSet rs = statement.executeQuery("select * from tipodezona");
        return rs;
    }
    
      public ResultSet cargarDistrito() throws Exception {
        connection = conOracle.getIntances().getConnection();
        Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        ResultSet rs = statement.executeQuery("select * from distrito");
        return rs;
    }

    public ResultSet cargarRegistroDerecho() throws Exception {
        connection = conOracle.getIntances().getConnection();
        Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        ResultSet rs = statement.executeQuery("select * from vpersonaderecho");
        return rs;
    }

    public ResultSet cargarRegistroTitular() throws Exception {
        connection = conOracle.getIntances().getConnection();
        Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        ResultSet rs = statement.executeQuery("select * from vpersonatitular");
        return rs;
    }

    public ResultSet cargarRegistroHijos() throws Exception {
        connection = conOracle.getIntances().getConnection();
        Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        ResultSet rs = statement.executeQuery("select * from vpersonahijos");
        return rs;
    }

    public void Insertar(personaTitularTO to) throws Exception {
        connection = conOracle.getIntances().getConnection();
        CallableStatement cs = connection.prepareCall("Call sp_insertar_personatitular(?,?,?,?,?,?,?,?,?,?,?,?,?)");
        cs.setInt(1, to.getXIDFORMULARIO());
        cs.setString(2, to.getXDESCFORMULARIO());
        cs.setString(3, to.getXASOCIADOAFIRMA());
        cs.setInt(4, to.getXIDPERSONA());
        cs.setString(5, to.getXAPELLIDOPAT());
        cs.setString(6, to.getXAPELLIDOMAT());
        cs.setString(7, to.getXNOMBRE());
        cs.setInt(8, to.getXIDDOCUMENTO());
        cs.setInt(9, to.getXNUMERODOCUMENTO());
        cs.setString(10, to.getXSEXO());
        cs.setDate(11, to.getXFECHANACIMIENTO());
        cs.setInt(12, to.getXTIPOPERSONA());
        cs.setInt(13, to.getXIDDOMICILIO());
        cs.execute();
    }

    public void Insertar1(personaDerechoHabientesTO to) throws Exception {
        connection = conOracle.getIntances().getConnection();
        CallableStatement cs = connection.prepareCall("Call sp_insertarderechohabiente(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        cs.setInt(1, to.getXTIPOPERSONA());
        cs.setInt(2, to.getXIDFORMULARIO());
        cs.setString(3, to.getXDESCFORMULARIO());
        cs.setString(4, to.getXASOCIADOAFIRMA());
        cs.setInt(5, to.getXIDPERSONA());
        cs.setString(6, to.getXAPELLIDOPAT());
        cs.setString(7, to.getXAPELLIDOMAT());
        cs.setString(8, to.getXNOMBRE());
        cs.setInt(9, to.getXIDDOCUMENTO());
        cs.setInt(10, to.getXNUMERODOCUMENTO());
        cs.setDate(11, to.getXFECHANACIMIENTO());
        cs.setString(12, to.getXSEXO());
        cs.setInt(13, to.getXIDVINCULO());
        cs.setInt(14, to.getXNROCARTAMEDICA());
        cs.setInt(15, to.getXIDINCAPACIDAD());
        cs.setInt(16, to.getXCERMEDICO());
        cs.setInt(17, to.getXIDSITUACION());
        cs.setInt(18, to.getXIDMOTIVO());
        cs.setInt(19, to.getXIDDOMICILIO());
        cs.setInt(20, to.getXIDTIPOVIA());
        cs.setString(21, to.getXNOMBREVIA());
        cs.setInt(22, to.getXNUMEXT());
        cs.setInt(23, to.getXNUMINT());
        cs.setInt(24, to.getXIDTIPOZONA());
        cs.setString(25, to.getXNOMBREZONA());
        cs.setString(26, to.getXREFERENCIA());
        cs.setInt(27, to.getXIDDISTRITO());
        cs.execute();
    }

    public void Insertar2(personaHijosTO to) throws Exception {
        connection = conOracle.getIntances().getConnection();
        CallableStatement cs = connection.prepareCall("Call sp_insertarderechohabiente(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        cs.setInt(1, to.getXTIPOPERSONA());
        cs.setInt(2, to.getXIDFORMULARIO());
        cs.setString(3, to.getXDESCFORMULARIO());
        cs.setString(4, to.getXASOCIADOAFIRMA());
        cs.setInt(5, to.getXIDPERSONA());
        cs.setString(6, to.getXAPELLIDOPAT());
        cs.setString(7, to.getXAPELLIDOMAT());
        cs.setString(8, to.getXNOMBRE());
        cs.setInt(9, to.getXIDDOCUMENTO());
        cs.setInt(10, to.getXNUMERODOCUMENTO());
        cs.setDate(11, to.getXFECHANACIMIENTO());
        cs.setInt(12, to.getXIDINCAPACIDAD());
        cs.setInt(13, to.getXCERMEDICO());
        cs.setInt(14, to.getXIDSITUACION());
        cs.setInt(15, to.getXIDMOTIVO());
        cs.setString(16, to.getXSEXO());
        cs.setInt(17, to.getXIDDOMICILIO());
        cs.setInt(18, to.getXIDTIPOVIA());
        cs.setString(19, to.getXNOMBREVIA());
        cs.setInt(20, to.getXNUMEXT());
        cs.setInt(21, to.getXNUMINT());
        cs.setInt(22, to.getXIDTIPOZONA());
        cs.setString(23, to.getXNOMBREZONA());
        cs.setString(24, to.getXREFERENCIA());
        cs.setInt(25, to.getXIDDISTRITO());
        cs.execute();
    }
}
