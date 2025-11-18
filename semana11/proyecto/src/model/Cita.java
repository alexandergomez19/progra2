package model;
import model.Paciente;

import model.Doctor;

public class Cita {
    private Paciente paciente  ;
    private Doctor doctor ;
    private String fecha ;
    private String sede ;

    public Cita(){

    }
    public Cita(Paciente pPaciente, Doctor pDoctor, String pFecha, String pSede){
        this.paciente = pPaciente;
        this.doctor = pDoctor;
        this.fecha = pFecha;
        this.sede = pSede;
    }
    public Paciente getPaciente(){
        return this.paciente;
    }
    public Doctor geDoctor(){
        return this.doctor;
    }
    public String getFecha(){
        return this.fecha;
    }
    public String getSede(){
        return this.sede;
    }

    public void setPaciente(String pPaciente){
        
    }
    public void setDoctor(Doctor pDoctor){
        this.doctor = pDoctor;
    }
    public void setEspecialidad(String pFecha){
        this.fecha = pFecha;
    }
}
