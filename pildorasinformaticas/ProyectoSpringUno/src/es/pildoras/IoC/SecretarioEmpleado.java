package es.pildoras.IoC;

public class SecretarioEmpleado implements Empleados
{

	@Override
	public String getTareas()
	{
		return "Gestionar la agenda de los Jefes";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return null;
	}

}
