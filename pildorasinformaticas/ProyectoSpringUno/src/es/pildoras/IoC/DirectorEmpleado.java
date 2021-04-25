package es.pildoras.IoC;

public class DirectorEmpleado implements Empleados
{
	// Creación de campo tipo CreacionInforme (interfaz)
	
	private CreacionInforme informeNuevo;
	
	// Creación de constructor que inyecta la dependencia
	
	public DirectorEmpleado(CreacionInforme informeNuevo)
	{
		this.informeNuevo = informeNuevo;
	}
	
	@Override
	public String getTareas()
	{
		return "Gestionar la plantilla de la empresa";
	}

	@Override
	public String getInforme()
	{
		return "Informe creado por el Director: " + informeNuevo.getInforme();
	}

}
