package com.example.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.example.models.Alumnos;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Hacemos el sessionFactory
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Alumnos.class).buildSessionFactory();
		// Abrimos la sesion
		Session session = sessionFactory.openSession();
		System.out.print("Abriendo Sesion");

		try {
			// Declaramos el objeto Alumno
			Alumnos alumno = new Alumnos("Javier", "Mena-Bernal", "Carranza");
			// Iniciamos la transaccion
			session.beginTransaction();
			System.out.print("Empezando transaccion");
			// session.save(customer1); // deprecated method
			// Guardamos la transaccion
			session.persist(alumno);
			// Enviamos la transaccion
			System.out.print("Enviando transaccion");
			session.getTransaction().commit();

			System.out.println("Se ha añadido correctamente");
			System.out.println(alumno);
			// Cerramos la sesion
			System.out.print("Cerrando Sesion");
			session.close();

		} finally {
			// TODO: handle finally clause
			sessionFactory.close();
		}
	}

}
