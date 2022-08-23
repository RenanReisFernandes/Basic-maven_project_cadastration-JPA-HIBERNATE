package dao;

import java.util.List;

import javax.persistence.EntityManager;

import model.Unidade;

public class UnidadeDao {
	



private EntityManager em;


public UnidadeDao(EntityManager em) {
	this.em = em;
}

	

	public void cadastrar(Unidade unidade1) {
		this.em.persist(unidade1);
	}
	
	public void remover(Unidade unidade1) {
		unidade1 = this.em.merge(unidade1);
		this.em.remove(unidade1);
	}
	
	public List<Unidade> consultarTodos() {
		String query = "select p from Pessoa p";
		return this.em.createQuery(query).getResultList();
	}
	


}
