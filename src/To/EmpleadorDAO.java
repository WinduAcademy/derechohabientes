/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package To;

/**
 *
 * @author ayrtonray
 */
public class EmpleadorDAO {
    int IDEMPLEADOR; 
    String APELLIDOPATEMP; 
    String APELLIDOMATEMP;    
    String NOMBREEMP; 
   

    public EmpleadorDAO() {
    }

    public int getIDEMPLEADOR() {
        return IDEMPLEADOR;
    }

    public void setIDEMPLEADOR(int IDEMPLEADOR) {
        this.IDEMPLEADOR = IDEMPLEADOR;
    }

    public String getAPELLIDOPATEMP() {
        return APELLIDOPATEMP;
    }

    public void setAPELLIDOPATEMP(String APELLIDOPATEMP) {
        this.APELLIDOPATEMP = APELLIDOPATEMP;
    }

    public String getAPELLIDOMATEMP() {
        return APELLIDOMATEMP;
    }

    public void setAPELLIDOMATEMP(String APELLIDOMATEMP) {
        this.APELLIDOMATEMP = APELLIDOMATEMP;
    }

    public String getNOMBREEMP() {
        return NOMBREEMP;
    }

    public void setNOMBREEMP(String NOMBREEMP) {
        this.NOMBREEMP = NOMBREEMP;
    }
  
}
