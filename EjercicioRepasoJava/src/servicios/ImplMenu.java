package servicios;

public class ImplMenu implements IntzMenu {
	
	@Override
	public void mostrarMenu() {
		// TODO Auto-generated method stub
		System.out.println("\n------- Menú -------");
		System.out.println(" 1 Registrar Empleado ");
		System.out.println(" 2 Modificar Empleado ");
		System.out.println(" 3  Exportar Fichero  ");
		System.out.println(" 4     Cerrar App     ");
	}
}
