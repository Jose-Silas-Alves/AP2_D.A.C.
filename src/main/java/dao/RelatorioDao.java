package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import entidades.Relatorio;
import util.JPAUtil;

public class RelatorioDao {
	public static void salvar(Relatorio r) {
		EntityManager e = JPAUtil.criarEntityManager();
		e.getTransaction().begin();
		e.persist(r);
		e.getTransaction().commit();
		e.close();
	}
	
	public static void editar(Relatorio r) {
		EntityManager e = JPAUtil.criarEntityManager();
		e.getTransaction().begin();
		e.merge(r);
		e.getTransaction().commit();
		e.close();
	}
	
	
	public static void excluir(Relatorio r) {
		EntityManager e = JPAUtil.criarEntityManager();
		e.getTransaction().begin();
		r = e.find(Relatorio.class, r.getId());
		e.remove(r);
		e.getTransaction().commit();
		e.close();
	}
	
	public static List<Relatorio> listarTodos(){
		EntityManager e = JPAUtil.criarEntityManager();
		Query q = e.createQuery("select r from Relatorio r");
		List<Relatorio> lista = q.getResultList();
		e.close();
		return lista;
	}
	
	public static Relatorio getPorId(Integer id) {
		EntityManager e = JPAUtil.criarEntityManager();
		Relatorio r = e.find(Relatorio.class, id);
		e.close();
		return r;
	}
	
}
