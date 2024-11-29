package com.ejemplo.model;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ejemplo.util.HibernateUtil;

public class ProductoDAO {

	public void agregar(Producto producto) {
		Transaction transaction = null;

		// Abrir una nueva sesión de hibernate
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {

			transaction = session.beginTransaction();
			// inserta registro en la tabla
			session.persist(producto);
			// Guarda cambios
			transaction.commit();

		} catch (Exception ex) {

		}
	}

	public List<Producto> listar() {
		// Abrir una nueva sesión de hibernate
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {

			return session.createQuery("from Producto", Producto.class).list();

		} catch (Exception ex) {
			return null;
		}

	}

}
