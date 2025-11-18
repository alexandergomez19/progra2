package service;

import java.util.Scanner;
import model.Cliente;
import model.Cuenta;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan =new Scanner(System.in);
        Cliente cliente = new Cliente();
        scan.close();

        System.out.println("Ingrese el nombre: ");
        cliente.setNombre(scan.next());

        System.out.println("Ingrese la edad: ");
        cliente.setEdad(scan.nextInt());

        System.out.println("Esta activo?: ");
        cliente.setActivo(scan.nextBoolean());

        System.out.println("Ingrese la residencia: ");
        cliente.setResidencia(scan.next());

        System.out.println("datos del usuario: \nNombre: "+cliente.getNombre()+"\nEdad: "+cliente.getEdad()+"\nactividad: "+cliente.isActivo()+"\nresidencia: "+cliente.getResidencia());

        Cuenta cuenta = new Cuenta();

        System.out.println();
        cuenta.setNumeroCuenta(scan.nextInt());

        System.out.println();
        cuenta.setSaldo(scan.nextInt());

        System.out.println();
        cuenta.setTieneTarjeta(scan.nextBoolean());

        System.out.println();
        cuenta.setTipoCuenta(scan.next());

        System.out.println("Nombre Cliente: "+cliente.getNombre()+"\nNombre Cliente: "+ );
    }
}
