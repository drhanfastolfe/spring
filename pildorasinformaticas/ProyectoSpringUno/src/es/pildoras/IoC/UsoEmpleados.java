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
		
		Empleados Juan = contexto.getBean("miEmpleado", Empleados.class);
		
		System.out.println(Juan.getTareas());
		
		contexto.close();
	}

}
