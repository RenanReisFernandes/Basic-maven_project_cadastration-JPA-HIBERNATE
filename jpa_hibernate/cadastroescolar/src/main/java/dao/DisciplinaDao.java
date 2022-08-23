package dao;

import java.util.List;

import javax.persistence.EntityManager;

import model.Disciplina;

public class DisciplinaDao {

private EntityManager em;
	
public DisciplinaDao(EntityManager em) {
	this.em = em;
}


	public void cadastrar(Disciplina disciplina1) {
		this.em.persist(disciplina1);
	}
	
	public void remover(Disciplina disciplina1) {
		disciplina1 = this.em.merge(disciplina1);
		this.em.remove(disciplina1);
	}
	
	public List<Disciplina> consultarTodos() {
		String query = "select p from Pessoa p";
		return this.em.createQuery(query).getResultList();
	}
	
}
