package service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		File archivo = new File("userpass.txt");
		
		 if (!archivo.exists()) {
			 archivo.createNewFile();
		 }
		 String menu= "1. Leer archivo con delimitador\n2. leer simple";
		 int opcion= Integer.parseInt(JOptionPane.showInputDialog(menu));
		 
		 switch(opcion) {
		 case 1:
			 FileReader fr = new FileReader(archivo);
			 BufferedReader br = new BufferedReader(fr);
			 String lineaArchivo=br.readLine();
			 String cadena="";
			 int i;
			 while (lineaArchivo !=null) {
				 i=0;
				 do {
					 while (i<lineaArchivo.length() && lineaArchivo.charAt(i) != '|')
						 cadena= cadena+ lineaArchivo.charAt(i);
					 i++;
				 }while(i<lineaArchivo.length());
			 }
			 break;
		 case 2:
			 FileReader fr2 = new FileReader(archivo);
			 BufferedReader br2 = new BufferedReader(fr2);
			 String contenido=br2.readLine();
			 while (contenido!=null) {
				 contenido=br2.readLine();
				 
			 }
			 break;
		 case 3:
			 FileWriter fw= new FileWriter(archivo,true);
			 BufferedWriter bw = new BufferedWriter(fw);
			 
			 break;
		 }
		 
		 
		 
		 }catch(IOException ioe) {
			 JOptionPane.showMessageDialog(null, ioe.getMessage());
		 }
	}

}
