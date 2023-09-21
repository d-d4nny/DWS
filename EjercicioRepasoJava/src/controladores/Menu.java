package controladores;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import servicios.ImplMenu;
import servicios.IntzMenu;
import servicios.IntzEmpleado;
import servicios.ImplEmpleado;
import entidades.Empleados;

public class Menu {

	public static final String RUTA_ARCHIVO_LOG = "C:\\logs.txt"; 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Empleados>bdMain = new ArrayList<>();
		
		IntzMenu intM = new ImplMenu();
		IntzEmpleado intE = new ImplEmpleado();
		Scanner scan = new Scanner(System.in);
		boolean cerrarMenu = false;
		int opcion;
		
		try {
			do {
				intM.mostrarMenu();
				System.out.println("Introduce una opcion: ");
				opcion=scan.nextInt();
				
				switch(opcion) {
				case 1:
					intE.registroEmpleado(bdMain);
					break;
				case 2:
					intE.modificarRegistro(bdMain);
					break;
				case 3:
					intE.exportarFichero(bdMain);
					break;
				case 4:
					cerrarMenu=true;
					break;
				default:
					System.err.println("\n**[ERROR] opción elegida no disponible **");
					break;
				}
				
			}while(!cerrarMenu);
		}catch(InputMismatchException e) {
			System.err.println("\n**[ERROR] entrada inválida: por favor ingrese un número entero **");
		} catch(NullPointerException npe) {
			System.err.println("\n**[ERROR] ocurrió una excepción no esperada: " + npe.getMessage() + " **");
		} catch(Exception e) {
			System.err.println("\n**[ERROR] ocurrió una excepción no esperada: " + e.getMessage() + " **");
		}	

	}

}
