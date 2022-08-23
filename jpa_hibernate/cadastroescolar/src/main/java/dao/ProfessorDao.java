package dao;

import java.util.List;

import javax.persistence.EntityManager;

import model.Professor;

public class ProfessorDao {
	
private EntityManager em;


public ProfessorDao(EntityManager em) {
	this.em = em;
}

	

	public void cadastrar(Professor professor1) {
		this.em.persist(professor1);
	}
	
	public void remover(Professor professor1) {
		professor1 = this.em.merge(professor1);
		this.em.remove(professor1);
	}
	
	public List<Professor> consultarTodos() {
		String query = "select p from Pessoa p";
		return this.em.createQuery(query).getResultList();
	}

}
