

public class Paciente implements Comparable<Paciente> {

    private String nombre;
    private String condicion;
    private String codigoEmergencia;

    public Paciente(String nombre, String condicion, String codigoEmergencia){
        this.nombre = nombre;
        this.condicion = condicion;
        this.codigoEmergencia = codigoEmergencia;
    }

    public Paciente(){

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCondicion() {
        return condicion;
    }

    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }

    public String getCodigoEmergencia() {
        return codigoEmergencia;
    }

    public void setCodigoEmergencia(String codigoEmergencia) {
        this.codigoEmergencia = codigoEmergencia;
    }

    public String toString(){
        return this.getNombre() + "/" + this.getCondicion() + "/" + this.getCodigoEmergencia();
    }

    public int compareTo(Paciente P){
        return this.getCodigoEmergencia().compareTo(P.getCodigoEmergencia());
    }
}
