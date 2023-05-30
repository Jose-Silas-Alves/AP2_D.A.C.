package dao;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import entidades.Login;
import util.JPAUtil;

public class LoginDao {
	public static void salvar(Login l) {
		l.setDatacadastro(new Date());
		EntityManager em = JPAUtil.criarEntityManager();
		em.getTransaction().begin();
		em.persist(l);
		em.getTransaction().commit();
		em.close();
	}
	
	public static void logar(Login l) {
		EntityManager em = JPAUtil.criarEntityManager();
		em.getTransaction().begin();
		em.getTransaction().commit();
		em.close();
	}
	
	public static void editar(Login l) {
		EntityManager em = JPAUtil.criarEntityManager();
		em.getTransaction().begin();
		em.merge(l);
		em.getTransaction().commit();
		em.close();
	}
	
	
	public static void excluir(Login l) {
		EntityManager em = JPAUtil.criarEntityManager();
		em.getTransaction().begin();
		l = em.find(Login.class, l.getId());
		em.remove(l);
		em.getTransaction().commit();
		em.close();
	}
	
	public static List<Login> listarTodos(){
		EntityManager em = JPAUtil.criarEntityManager();
		Query q = em.createQuery("select l from Login l");
		List<Login> lista = q.getResultList();
		em.close();
		return lista;
	}
	
	public static Login getPorId(Integer id) {
		EntityManager em = JPAUtil.criarEntityManager();
		Login l = em.find(Login.class, id);
		em.close();
		return l;
	}

}
