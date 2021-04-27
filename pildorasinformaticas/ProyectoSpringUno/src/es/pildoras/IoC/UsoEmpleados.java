package es.pildoras.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados
{
	public static void main(String[] args)
	{
		// Creación de objetos de tipo Empleado
		
		// Empleados empleado1 = new DirectorEmpleado();
		
		// Uso de los objetos creados
		
		// System.out.println(empleado1.getTareas());
		
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("application-context.xml");
		
		/*
		Empleados juan = contexto.getBean("miEmpleado", Empleados.class);
		
		System.out.println(juan.getTareas());
		
		System.out.println(juan.getInforme());
		*/
		
		/*
		SecretarioEmpleado maria = contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		SecretarioEmpleado pablo = contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		
		System.out.println(maria.getTareas());
		System.out.println(maria.getInforme());
		
		System.out.println("Email María: " + maria.getEmail());
		System.out.println("Empresa: " + maria.getNombreEmpresa());
		System.out.println("Email Pablo: " + pablo.getEmail());
		*/
		
		DirectorEmpleado juan = contexto.getBean("miEmpleado", DirectorEmpleado.class);
		System.out.println(juan.getEmail());
		System.out.println(juan.getNombreEmpresa());
		
		contexto.close();
		
		
	}

}
