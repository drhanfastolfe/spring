package es.pildoras.IoC;

public class Informe implements CreacionInforme
{
	@Override
	public String getInforme()
	{
		return "Esta es la presentación del informe";
	}

}
