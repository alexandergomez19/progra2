package service;

import java.util.Scanner;

import model.Cita;
import model.Doctor;
import model.Paciente;

public class AppProyect {
    public static void main(String[] args) throws Exception {



        Scanner scan= new Scanner(System.in);
        Paciente paciente = new Paciente();

        System.out.println("Escriba el nombre del paciente: ");
        paciente.setNombre(scan.next());

        System.out.println("Escriba la edad del paciente: ");
        paciente.setEdad(scan.nextInt());
        
        System.out.println("Escriba los sintomas del paciente: ");
        paciente.setSintoma(scan.next());
        
        System.out.println("datos del paciente: \nNombre: "+paciente.getNombre()+"\nEdad: "+ paciente.getEdad()+"\nSintomas: "+paciente.getSintoma());


        Doctor doctor = new Doctor();
        System.out.println("Datos del doctor: \nNombre: ");
        doctor.setNombre(scan.next());

        System.out.println("Datos del doctor: \nNombre: ");
        doctor.setNombre(scan.next());


        Cita cita = new Cita();

        
    }
}
