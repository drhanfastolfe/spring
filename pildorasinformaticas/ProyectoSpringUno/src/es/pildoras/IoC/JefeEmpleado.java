package es.pildoras.IoC;

public class JefeEmpleado implements Empleados
{

	private CreacionInforme informeNuevo;
	
	public JefeEmpleado(CreacionInforme informeNuevo)
	{
		this.informeNuevo = informeNuevo;
	}
	
	public String getTareas()
	{
		return "Gestiono tareas de empleados";
	}

	@Override
	public String getInforme()
	{
		return "Informe creado por el Jefe: " + informeNuevo.getInforme();
	}
}