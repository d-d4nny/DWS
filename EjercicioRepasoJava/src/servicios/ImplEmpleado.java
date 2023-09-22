package servicios;	


import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;


import entidades.Empleados;

public class ImplEmpleado implements IntzEmpleado{
	
	private int contadorIdEmpleado = 0;

	public void exportarFichero(List<Empleados> bdMain) {
	    	
		FileWriter fichero = null;
        PrintWriter pw = null;  
        Scanner scan = new Scanner(System.in);

        try {
            fichero = new FileWriter("./Empleados.txt");
            pw = new PrintWriter(fichero);

            System.out.println("Seleccione una opción:");
            System.out.println("1. Listar todos los registros.");
            System.out.println("2. Imprimir un registro específico por número de empleado.");
            int opcion = scan.nextInt();

            switch (opcion) {
                case 1:
                    if (bdMain.isEmpty()) {
                        System.out.println("No hay empleados registrados.");
                    } else {
                        System.out.println("Lista de empleados:");
                        for (Empleados empleado : bdMain) {
                            pw.println(empleado);
                        }
                    }
                    break;

                case 2:
                    System.out.println("Introduzca el número de empleado:");
                    int numeroEmpleado = scan.nextInt();
                    boolean encontrado = false;

                    for (Empleados empleado : bdMain) {
                        if (empleado.getNumEmpleado() == numeroEmpleado) {
                            pw.println(empleado);
                            encontrado = true;
                            break;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("No se encontró un empleado con ese número.");
                    }
                    break;

                default:
                    System.out.println("Opción no válida.");
                    break;
            }

        } catch (IOException ioe) {
            System.out.print("[ERROR] - FICHERO NO ENCONTRADO: " + fichero + "\n" + ioe);
        } finally {
            try {
                if (fichero != null)
                    fichero.close();
            } catch (IOException ioe2) {
                System.out.print("[ERROR] - ERROR AL CERRAR FICHERO: " + fichero + "\n" + ioe2);
            }
        }
	}
	
	public void registroEmpleado(List<Empleados>bdMain){
		
		int numEmpleado, numSeguridadSocial, numCuentaCorriente;
		String nombre, apellidos, dni, titulacion, fechaNacimiento;
				
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Introduzca su Nombre: ");
		nombre=scan.nextLine();
		System.out.println("Introduzca sus Apellidos: ");
		apellidos=scan.nextLine();
		System.out.println("Introduzca su DNI: ");
		dni=scan.nextLine();
		System.out.println("Introduzca su Fecha de Nacimiento: ");
		fechaNacimiento=scan.nextLine();
		System.out.println("Introduzca su Titulacion mas alta: ");
		titulacion=scan.nextLine();
		System.out.println("Introduzca su Numero de la Seguridad Social: ");
		numSeguridadSocial=scan.nextInt();
		System.out.println("Introduzca su Numero de la Cuenta Corriente: ");
		numCuentaCorriente=scan.nextInt();
		
		System.out.println("\nEmpleado Registrado.");
		
		contadorIdEmpleado++;
		numEmpleado = contadorIdEmpleado;
		
		bdMain.add(new Empleados(numEmpleado,nombre,apellidos,dni,fechaNacimiento,titulacion,numSeguridadSocial,numCuentaCorriente));
	}
	
	public void modificarRegistro(List<Empleados>bdMain){
		
		Scanner scan = new Scanner(System.in);
		int opcion;
		
		System.out.println("Introduzca el Id del Empleado a modificar: ");
		int buscaId = scan.nextInt();
		boolean idEncontrado = false;
		
		for(Empleados empleado : bdMain) {
			if(empleado.getNumEmpleado() == buscaId) {
				idEncontrado = true;
				
				System.out.println("Empleado encontrado. ¿Qué campo deseas modificar?");
                System.out.println("1. Nombre");
                System.out.println("2. Apellidos");
                System.out.println("3. DNI");
                System.out.println("4. Fecha de Nacimiento");
                System.out.println("5. Titulacion");
                System.out.println("6. Numero de la Seguridad Social");
                System.out.println("7. Numero de la Cuenta Corriente");

                opcion = scan.nextInt();
                scan.nextLine();
                
                switch(opcion) {
                case 1:
                    System.out.print("Introduce el nuevo nombre: ");
                    String nuevoNombre = scan.nextLine();
                    empleado.setNombre(nuevoNombre);
                    break;
                case 2:
                    System.out.print("Introduce los nuevos apellidos: ");
                    String nuevosApellidos = scan.nextLine();
                    empleado.setApellidos(nuevosApellidos);
                    break;
                case 3:
                    System.out.print("Introduce el nuevo DNI: ");
                    String nuevoDNI = scan.nextLine();
                    empleado.setDni(nuevoDNI);
                    break;
                case 4:
                    System.out.print("Introduce la nueva fecha de nacimiento: ");
                    String nuevaFechaNacimiento = scan.nextLine();
                    empleado.setNombre(nuevaFechaNacimiento);
                    break;
                case 5:
                    System.out.print("Introduce la nueva titulacion: ");
                    String nuevaTitulacion = scan.nextLine();
                    empleado.setApellidos(nuevaTitulacion);
                    break;
                case 6:
                    System.out.print("Introduce el nuevo numero de la seguridad social: ");
                    String nuevoNumSeguridadSocial = scan.nextLine();
                    empleado.setDni(nuevoNumSeguridadSocial);
                    break;
                case 7:
                    System.out.print("Introduce el nuevo numero de la cuenta corriente: ");
                    String nuevoNumCuentaCorriente = scan.nextLine();
                    empleado.setNombre(nuevoNumCuentaCorriente);
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
                }
                
                bdMain.set(bdMain.indexOf(empleado), empleado);
                System.out.println("Empleado modificado correctamente.");
                break;
			}
		}
		
		if(!idEncontrado) {
			System.out.println("No se ha encontrado ningun empleado con ese Id");
		}
	}

}
