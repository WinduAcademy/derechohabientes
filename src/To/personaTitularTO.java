/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package To;

import java.sql.Date;

/**
 *
 * @author ayrtonray
 */
public class personaTitularTO {
    int XIDFORMULARIO;
    String XDESCFORMULARIO;  
    String XASOCIADOAFIRMA; 
    int XIDPERSONA;  
    String XAPELLIDOPAT; 
    String XAPELLIDOMAT; 
    String XNOMBRE; 
    int XIDDOCUMENTO; 
    int XNUMERODOCUMENTO; 
    String XSEXO;
    Date XFECHANACIMIENTO; 
    int XTIPOPERSONA;  
    int XIDDOMICILIO; 

    public personaTitularTO() {
    }

    public int getXIDFORMULARIO() {
        return XIDFORMULARIO;
    }

    public String getXDESCFORMULARIO() {
        return XDESCFORMULARIO;
    }

    public String getXASOCIADOAFIRMA() {
        return XASOCIADOAFIRMA;
    }

    public int getXIDPERSONA() {
        return XIDPERSONA;
    }

    public String getXAPELLIDOPAT() {
        return XAPELLIDOPAT;
    }

    public String getXAPELLIDOMAT() {
        return XAPELLIDOMAT;
    }

    public String getXNOMBRE() {
        return XNOMBRE;
    }

    public int getXIDDOCUMENTO() {
        return XIDDOCUMENTO;
    }

    public int getXNUMERODOCUMENTO() {
        return XNUMERODOCUMENTO;
    }

    public String getXSEXO() {
        return XSEXO;
    }

    public Date getXFECHANACIMIENTO() {
        return XFECHANACIMIENTO;
    }

    public int getXTIPOPERSONA() {
        return XTIPOPERSONA;
    }

    public int getXIDDOMICILIO() {
        return XIDDOMICILIO;
    }

    public void setXIDFORMULARIO(int XIDFORMULARIO) {
        this.XIDFORMULARIO = XIDFORMULARIO;
    }

    public void setXDESCFORMULARIO(String XDESCFORMULARIO) {
        this.XDESCFORMULARIO = XDESCFORMULARIO;
    }

    public void setXASOCIADOAFIRMA(String XASOCIADOAFIRMA) {
        this.XASOCIADOAFIRMA = XASOCIADOAFIRMA;
    }

    public void setXIDPERSONA(int XIDPERSONA) {
        this.XIDPERSONA = XIDPERSONA;
    }

    public void setXAPELLIDOPAT(String XAPELLIDOPAT) {
        this.XAPELLIDOPAT = XAPELLIDOPAT;
    }

    public void setXAPELLIDOMAT(String XAPELLIDOMAT) {
        this.XAPELLIDOMAT = XAPELLIDOMAT;
    }

    public void setXNOMBRE(String XNOMBRE) {
        this.XNOMBRE = XNOMBRE;
    }

    public void setXIDDOCUMENTO(int XIDDOCUMENTO) {
        this.XIDDOCUMENTO = XIDDOCUMENTO;
    }

    public void setXNUMERODOCUMENTO(int XNUMERODOCUMENTO) {
        this.XNUMERODOCUMENTO = XNUMERODOCUMENTO;
    }

    public void setXSEXO(String XSEXO) {
        this.XSEXO = XSEXO;
    }

    public void setXFECHANACIMIENTO(Date XFECHANACIMIENTO) {
        this.XFECHANACIMIENTO = XFECHANACIMIENTO;
    }

    public void setXTIPOPERSONA(int XTIPOPERSONA) {
        this.XTIPOPERSONA = XTIPOPERSONA;
    }

    public void setXIDDOMICILIO(int XIDDOMICILIO) {
        this.XIDDOMICILIO = XIDDOMICILIO;
    }
    
    
}
