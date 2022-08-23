package dao;

import java.util.List;

import javax.persistence.EntityManager;

import model.Aluno;
import model.Curso;

public class CursoDao {

private EntityManager em;
	

public CursoDao(EntityManager em) {
	this.em = em;
}


	public void cadastrar(Curso curso1) {
		this.em.persist(curso1);
	}
	
	public void remover(Curso curso1) {
		curso1 = this.em.merge(curso1);
		this.em.remove(curso1);
	}
	
	public List<Curso> consultarTodos() {
		String query = "select p from Pessoa p";
		return this.em.createQuery(query).getResultList();
	}
	
}
