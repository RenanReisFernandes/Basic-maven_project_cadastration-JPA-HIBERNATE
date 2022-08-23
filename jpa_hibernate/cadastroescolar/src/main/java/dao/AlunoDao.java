package dao;

import java.util.List;

import javax.persistence.EntityManager;

import model.Aluno;

public class AlunoDao {
	
private EntityManager em;
	
public AlunoDao(EntityManager em) {
	this.em = em;
}


	public void cadastrar(Aluno aluno1) {
		this.em.persist(aluno1);
	}
	
	public void remover(Aluno aluno1) {
		aluno1 = this.em.merge(aluno1);
		this.em.remove(aluno1);
	}
	
	public List<Aluno> consultarTodos() {
		String query = "select p from Pessoa p";
		return this.em.createQuery(query).getResultList();
	}

}
