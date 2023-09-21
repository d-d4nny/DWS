package entidades;


public class Empleados {
	private int numEmpleado;
	private String nombre;
	private String apellidos;
	private String dni;
	private String fechaNacimiento;
	private String titulacion;
	private int numSeguridadSocial;
	private int numCuentaCorriente;
	
	
	public Empleados(int numEmpleado, String nombre, String apellidos, String dni, String fechaNacimiento, String titulacion, int numSeguridadSocial, int numCuentaCorriente) {
		this.numEmpleado = numEmpleado;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.fechaNacimiento = fechaNacimiento;
		this.titulacion = titulacion;
		this.numSeguridadSocial = numSeguridadSocial;
		this.numCuentaCorriente = numCuentaCorriente;
	}
		
	public int getNumEmpleado() {
		return numEmpleado;
	}
	
	public void setNumEmpleado(int numEmpleado) {
		this.numEmpleado = numEmpleado;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellidos() {
		return apellidos;
	}
	
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	public String getDni() {
		return dni;
	}
	
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public String getTitulacion() {
		return titulacion;
	}
	
	public void setTitulacion(String titulacion) {
		this.titulacion = titulacion;
	}
	
	public int getNumSeguridadSocial() {
		return numSeguridadSocial;
	}
	
	public void setNumSeguridadSocial(int numSeguridadSocial) {
		this.numSeguridadSocial = numSeguridadSocial;
	}
	
	public int getNumCuentaCorriente() {
		return numCuentaCorriente;
	}
	
	public void setNumCuentaCorriente(int numCuentaCorriente) {
		this.numCuentaCorriente = numCuentaCorriente;
	}
	
	 @Override
	 public String toString() {
		    return "Empleado ID: " + numEmpleado +
		            ", Nombre: " + nombre +
		            ", Apellidos: " + apellidos +
		            ", DNI: " + dni +
		            ", Fecha de Nacimiento: " + fechaNacimiento +
		            ", Titulación: " + titulacion +
		            ", Número de Seguridad Social: " + numSeguridadSocial +
		            ", Número de Cuenta Corriente: " + numCuentaCorriente;
		}
	
}
