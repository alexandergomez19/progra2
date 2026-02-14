package service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		int opcion=Integer.parseInt(JOptionPane.showInputDialog("num ejercicio: "));
		
		switch(opcion){
		case 1:
			String numImpares ="";
			int num1 =Integer.parseInt(JOptionPane.showInputDialog("ingrese el primer numero"));
			int num2 =Integer.parseInt(JOptionPane.showInputDialog("ingrese el segundo numero"));
			
			for(int i=num1+1;i<num2;i++) {

				if (i%2!=0) {
					JOptionPane.showMessageDialog(null, "el numero "+numImpares+ " es impar");
					numImpares=numImpares+i+" ";
					
				}
				
				;
				
			}
			break;
		case 2:
			String inverso="";
			String nombre= JOptionPane.showInputDialog("ingrese su nombre completo");
			
			for(int i = nombre.length() - 1 ;i >= 0 ; i--) {
				inverso += nombre.charAt(i)+ "" ;
				if (nombre.charAt(i) == ' ') {
					inverso= inverso+ "\n";
				}
			}
			JOptionPane.showMessageDialog(null, inverso);
			break;
		case 3:
			
			Double numero1= Double.parseDouble(JOptionPane.showInputDialog("ingrese el primer numero"));
			Double numero2= Double.parseDouble(JOptionPane.showInputDialog("ingrese el primer numero"));
			String resultado="";
			
			if(numero1 <numero2) {
				while(numero1!=numero2) {
					numero1= numero1 + 0.25;
					numero2=numero2 - 0.25;
					JOptionPane.showMessageDialog(null,"num1 "+numero1+"num2 "+numero2);
					
							
				}
			}else {
				while(numero1!=numero2) {
					numero1= numero1 - 0.25;
					numero2=numero2 + 0.25;
					JOptionPane.showMessageDialog(null,"num1 "+numero1+"num2 "+numero2);
					
							
				}
			}
		case 4:
			
			LocalDate hoy = LocalDate.now();
			for(int i=1;i<=7; i++ ) {
				JOptionPane.showMessageDialog(null, hoy.plusDays(i
						));
			}
			break;
		case 5:
			String nom = JOptionPane.showInputDialog("ingrese su nombre");
			int edad = Integer.parseInt(JOptionPane.showInputDialog("ingrese su edad"));
			
			try {
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				String fechaNacimiento = JOptionPane.showInputDialog("ingrese su fecha de nacimiento (dd/MM/yyyy");
				Date fecha = sdf.parse(fechaNacimiento);
			JOptionPane.showMessageDialog(null," nombre "+nom+" edad "+edad+" fecha "+fechaNacimiento);
			
			}catch(ParseException pe) {
				JOptionPane.showMessageDialog(null," errror al ingresar la fecha");
			}
			
		}

	}

}
	
