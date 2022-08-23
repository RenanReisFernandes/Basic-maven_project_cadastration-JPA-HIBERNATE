package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Empresa;

public class EmpresaDao {
private EntityManager em;




public EmpresaDao(EntityManager em) {
	this.em = em;
}
	

	public void cadastrar(Empresa empresa4) {
		this.em.persist(empresa4);
	}
	
	public void remover(Empresa empresa) {
		empresa = this.em.merge(empresa);
		this.em.remove(empresa);
	}
	
	public List<Empresa> consultarTodos() {
		String query = "select p from Pessoa p";
		return this.em.createQuery(query).getResultList();
	}
	

	
}
