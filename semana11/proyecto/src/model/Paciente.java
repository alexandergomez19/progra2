package model;

public class Paciente {
    private String nombre;
    private int edad;
    private String sintoma;

    public Paciente() {
    
    }

    public Paciente(String nombre, int edad, String sintoma) {
        this.nombre = nombre;
        this.edad = edad;
        this.sintoma = sintoma;
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

    public String getSintoma() {
        return sintoma;
    }

    public void setSintoma(String sintoma) {
        this.sintoma = sintoma;
    }
}

