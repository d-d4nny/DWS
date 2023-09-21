package servicios;

import java.util.List;
import entidades.Empleados;

public interface IntzEmpleado {

	void exportarFichero(List<Empleados>bdMain);
	
	void registroEmpleado(List<Empleados>bdMain);
	
	void modificarRegistro(List<Empleados>bdMain);
}
