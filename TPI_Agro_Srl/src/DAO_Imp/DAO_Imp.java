package DAO_Imp;

import java.util.LinkedList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import DAO_Interfaces.DAO_Generico;
import Hibernate.HibernateUtil;


public class DAO_Imp <T> implements DAO_Generico<T> {

	private Session session = null;
	
	
	@Override
	public void saveObjeto(T clase) {
		try{
			session = HibernateUtil.getSession();
            if(session != null){ 
                session.beginTransaction();
                session.save(clase);
                session.getTransaction().commit();
                session.close();
            }
        }catch(Exception e){
        	System.out.println("Ocurrio un error: " + e.getMessage());
        }
	}

	@Override
	public void deleteObjeto(T clase) {
		try{
			session = HibernateUtil.getSession();
            if(session != null){
                session.beginTransaction();
                session.delete(clase);
                session.getTransaction().commit();
                session.close();
            } 
        }catch(Exception e){
        	System.out.println("Ocurrio un error: " + e.getMessage());
        }
	}

	@Override
	public void updateObjeto(T clase) {
		 try{
			 session = HibernateUtil.getSession();
	            if(session != null){
	                session.beginTransaction();
	                session.update(clase);
	                session.getTransaction().commit();
	                session.close();
	            } 
	        }catch(Exception e){
	        	System.out.println("Ocurrio un error: " + e.getMessage());
	        }
	}

	@Override
	public List<T> getAll() {
		List<T> result = new LinkedList<T>();
        Query<T> query = null;
        try{
        	session = HibernateUtil.getSession();
            if (session != null){
                session.beginTransaction();
                query = session.createQuery("FROM"+ getClass().getName()+ "e");
                result = query.list();
                session.getTransaction().commit();
                session.close();
            }
        }catch(Exception e){
        	System.out.println("Ocurrio un error: " + e.getMessage());
        }
        return result;
	}

	@Override
	public T getObjeto(int id) {
		T result = null;
        try{
        	session = HibernateUtil.getSession();
            if (session != null){
                session.beginTransaction();
                result = ((DAO_Generico<T>) session).getObjeto(id);
                session.getTransaction().commit();
                session.close();
            }
        }catch(Exception e){
        	System.out.println("Ocurrio un error: " + e.getMessage());
        }
        return result;
	}

	

}
