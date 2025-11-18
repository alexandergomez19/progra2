package model;

public class Cliente {
    private String nombre;
    private int edad;
    private boolean activo;
    private String residencia;

    public Cliente(){

    }
    public Cliente(String nombre, int edad, boolean activo, String residencia){
        this.nombre = nombre;
        this.edad = edad;
        this.activo = activo;
        this.residencia = residencia;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public boolean isActivo() {
        return activo;
    }
    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    public String getResidencia() {
        return residencia;
    }
    public void setResidencia(String residencia) {
        this.residencia = residencia;
    }
    
    
}


