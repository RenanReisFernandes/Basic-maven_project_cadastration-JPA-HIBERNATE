package dao;

import java.util.List;

import javax.persistence.EntityManager;

import model.Aluno;
import model.Disciplina;
import model.Periodo;

public class PeriodoDao {

private EntityManager em;
	

public PeriodoDao(EntityManager em) {
	this.em = em;
}


	public void cadastrar(Periodo periodo1) {
		this.em.persist(periodo1);
	}
	
	public void remover(Periodo periodo1) {
		periodo1 = this.em.merge(periodo1);
		this.em.remove(periodo1);
	}
	
	public List<Periodo> consultarTodos() {
		String query = "select p from Pessoa p";
		return this.em.createQuery(query).getResultList();
	}
	
}
