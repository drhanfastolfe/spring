package es.pildoras.IoC;

public class DirectorEmpleado implements Empleados
{
	// Creación de campo tipo CreacionInforme (interfaz)
	
	private CreacionInforme informeNuevo;
	
	private String email;
	
	private String nombreEmpresa;
	
	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public String getNombreEmpresa()
	{
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa)
	{
		this.nombreEmpresa = nombreEmpresa;
	}
	
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
