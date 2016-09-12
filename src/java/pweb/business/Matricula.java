package pweb.business;

import java.util.HashSet;
import java.util.Set;


public class Matricula {
    
    public Matricula() {
    }
    
    //contructor

    public Matricula(String idAlumno, String nombreCurso, int creditosCurso, String cicloCurso) {
        this.idAlumno = idAlumno;        
        this.nombreCurso = nombreCurso;        
        this.creditosCurso = creditosCurso;        
        this.cicloCurso = cicloCurso;
    }
        
    private String idAlumno;    
    private String nombreCurso;
    private int creditosCurso;    
    private String cicloCurso;
    private String turno;

    // alt + insert or ctrl + espacio
    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
                
    public String getCodigoAlumno() {
        return idAlumno;
    }

    public void setCodigoAlumno(String CodigoAlumno) {
        this.idAlumno = CodigoAlumno;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String NombreCurso) {
        this.nombreCurso = NombreCurso;
    }

    public String getCicloCurso() {
        return cicloCurso;
    }

    public void setCicloCurso(String CicloCurso) {
        this.cicloCurso = CicloCurso;
    }

    public int getCreditosCurso() {
        return creditosCurso;
    }

    public void setCreditosCurso(int CreditosCurso) {
        this.creditosCurso = CreditosCurso;
    }
   
    
}
