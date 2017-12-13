/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package To;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.sql.Date;

/**
 *
 * @author ayrtonray
 */
public class PersonaTO {

    int XTIPOPERSONA;
    int XIDPERSONA;
    String XAPELLIDOPAT;
    String XAPELLIDOMAT;
    String XNOMBRE;
    int XIDDOCUMENTO;
    int XNUMERODOCUMENTO;
    Date XFECHANACIMIENTO;
    String XSEXO;
    int XIDVINCULO;
    int XNROCARTAMEDICA;
    int XIDINCAPACIDAD;
    int XCERMEDICO;
    int XIDSITUACION;
    int XIDMOTIVO;
    int XIDDOMICILIO;
    int XIDDISTRITO;
    int XEMPLEADOR;

    public PersonaTO() {
    }

    public PersonaTO(int XTIPOPERSONA, int XIDPERSONA, String XAPELLIDOPAT, String XAPELLIDOMAT, String XNOMBRE, int XIDDOCUMENTO, int XNUMERODOCUMENTO, Date XFECHANACIMIENTO, String XSEXO, int XIDVINCULO, int XNROCARTAMEDICA, int XIDINCAPACIDAD, int XCERMEDICO, int XIDSITUACION, int XIDMOTIVO, int XIDDOMICILIO, int XIDDISTRITO, int XEMPLEADOR) {
        this.XTIPOPERSONA = XTIPOPERSONA;
        this.XIDPERSONA = XIDPERSONA;
        this.XAPELLIDOPAT = XAPELLIDOPAT;
        this.XAPELLIDOMAT = XAPELLIDOMAT;
        this.XNOMBRE = XNOMBRE;
        this.XIDDOCUMENTO = XIDDOCUMENTO;
        this.XNUMERODOCUMENTO = XNUMERODOCUMENTO;
        this.XFECHANACIMIENTO = XFECHANACIMIENTO;
        this.XSEXO = XSEXO;
        this.XIDVINCULO = XIDVINCULO;
        this.XNROCARTAMEDICA = XNROCARTAMEDICA;
        this.XIDINCAPACIDAD = XIDINCAPACIDAD;
        this.XCERMEDICO = XCERMEDICO;
        this.XIDSITUACION = XIDSITUACION;
        this.XIDMOTIVO = XIDMOTIVO;
        this.XIDDOMICILIO = XIDDOMICILIO;
        this.XIDDISTRITO = XIDDISTRITO;
        this.XEMPLEADOR = XEMPLEADOR;
    }
    
    
    public int getXTIPOPERSONA() {
        return XTIPOPERSONA;
    }

    public void setXTIPOPERSONA(int XTIPOPERSONA) {
        this.XTIPOPERSONA = XTIPOPERSONA;
    }

    public int getXIDPERSONA() {
        return XIDPERSONA;
    }

    public void setXIDPERSONA(int XIDPERSONA) {
        this.XIDPERSONA = XIDPERSONA;
    }

    public String getXAPELLIDOPAT() {
        return XAPELLIDOPAT;
    }

    public void setXAPELLIDOPAT(String XAPELLIDOPAT) {
        this.XAPELLIDOPAT = XAPELLIDOPAT;
    }

    public String getXAPELLIDOMAT() {
        return XAPELLIDOMAT;
    }

    public void setXAPELLIDOMAT(String XAPELLIDOMAT) {
        this.XAPELLIDOMAT = XAPELLIDOMAT;
    }

    public String getXNOMBRE() {
        return XNOMBRE;
    }

    public void setXNOMBRE(String XNOMBRE) {
        this.XNOMBRE = XNOMBRE;
    }

    public int getXIDDOCUMENTO() {
        return XIDDOCUMENTO;
    }

    public void setXIDDOCUMENTO(int XIDDOCUMENTO) {
        this.XIDDOCUMENTO = XIDDOCUMENTO;
    }

    public int getXNUMERODOCUMENTO() {
        return XNUMERODOCUMENTO;
    }

    public void setXNUMERODOCUMENTO(int XNUMERODOCUMENTO) {
        this.XNUMERODOCUMENTO = XNUMERODOCUMENTO;
    }

    public Date getXFECHANACIMIENTO() {
        return XFECHANACIMIENTO;
    }

    public void setXFECHANACIMIENTO(Date XFECHANACIMIENTO) {
        this.XFECHANACIMIENTO = XFECHANACIMIENTO;
    }

    public String getXSEXO() {
        return XSEXO;
    }

    public void setXSEXO(String XSEXO) {
        this.XSEXO = XSEXO;
    }

    public int getXIDVINCULO() {
        return XIDVINCULO;
    }

    public void setXIDVINCULO(int XIDVINCULO) {
        this.XIDVINCULO = XIDVINCULO;
    }

    public int getXNROCARTAMEDICA() {
        return XNROCARTAMEDICA;
    }

    public void setXNROCARTAMEDICA(int XNROCARTAMEDICA) {
        this.XNROCARTAMEDICA = XNROCARTAMEDICA;
    }

    public int getXIDINCAPACIDAD() {
        return XIDINCAPACIDAD;
    }

    public void setXIDINCAPACIDAD(int XIDINCAPACIDAD) {
        this.XIDINCAPACIDAD = XIDINCAPACIDAD;
    }

    public int getXCERMEDICO() {
        return XCERMEDICO;
    }

    public void setXCERMEDICO(int XCERMEDICO) {
        this.XCERMEDICO = XCERMEDICO;
    }

    public int getXIDSITUACION() {
        return XIDSITUACION;
    }

    public void setXIDSITUACION(int XIDSITUACION) {
        this.XIDSITUACION = XIDSITUACION;
    }

    public int getXIDMOTIVO() {
        return XIDMOTIVO;
    }

    public void setXIDMOTIVO(int XIDMOTIVO) {
        this.XIDMOTIVO = XIDMOTIVO;
    }

    public int getXIDDOMICILIO() {
        return XIDDOMICILIO;
    }

    public void setXIDDOMICILIO(int XIDDOMICILIO) {
        this.XIDDOMICILIO = XIDDOMICILIO;
    }

    public int getXIDDISTRITO() {
        return XIDDISTRITO;
    }

    public void setXIDDISTRITO(int XIDDISTRITO) {
        this.XIDDISTRITO = XIDDISTRITO;
    }

    public int getXEMPLEADOR() {
        return XEMPLEADOR;
    }

    public void setXEMPLEADOR(int XEMPLEADOR) {
        this.XEMPLEADOR = XEMPLEADOR;
    }
    
    
}
