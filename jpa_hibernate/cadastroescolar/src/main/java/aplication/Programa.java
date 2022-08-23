package aplication;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dao.AlunoDao;
import dao.CursoDao;
import dao.DisciplinaDao;
import dao.EmpresaDao;
import dao.JPAUTIL;
import dao.PeriodoDao;
import dao.ProfessorDao;
import dao.UnidadeDao;
import model.Aluno;
import model.Curso;
import model.Disciplina;
import model.Empresa;
import model.Periodo;
import model.Professor;
import model.Unidade;

public class Programa {

	public static void main(String[] args) {
		

		//CRIANDO OBJETOS:

	EntityManager em = JPAUTIL.getEntityManager();
		
		
		//OBJETO EMPRESAS
		Empresa empresa4 = new Empresa("Colegio1", "Rua da abóbora Rio de Janeiro");
		
		
		//OBJETO UNIDADES
		Unidade unidade1 = new Unidade(null,"Unidade1", "Zona Leste");
		Unidade unidade2 = new Unidade(null,"Unidade2", "Zona Norte");
		Unidade unidade3 = new Unidade(null,"Unidade3", "Zona Oeste");
		
		//OBJETO ALUNOS
		Aluno aluno1 = new Aluno("111", "Renan","Nova Holanda", "renan@email.com");
		Aluno aluno2 = new Aluno("222", "Maria","Bairro Filadelfia", "maria@email.com");
		Aluno aluno3 = new Aluno("333", "João","Olinda", "joao@email.com");
		
		//OBJETO PROFESSORES
		Professor professor1 = new Professor("aaa","Querido professor 1", "Rua a", "professor1@email.com");
		Professor professor2 = new Professor("aaa","Querido professor 2", "Rua b", "professor2@email.com");		
		Professor professor3 = new Professor("aaa","Querido professor 3", "Rua c", "professor3@email.com");		
				
				
		//OBJETO CURSOS
		Curso curso1 = new Curso("Front-End");
		Curso curso2 = new Curso("Back-End");		
		Curso curso3 = new Curso("Full-Stack");
		
		
		//OBJETO PERÍODOS
		Periodo periodo1 = new Periodo("Primeiro período");
		Periodo periodo2 = new Periodo("Segundo período");
		Periodo periodo3 = new Periodo("Terceiro período");
		
		
		//OBJETO DISCIPLINAS
		Disciplina disciplina1 = new Disciplina("html");
		Disciplina disciplina2 = new Disciplina("css");
		Disciplina disciplina3 = new Disciplina("javaScript");
		Disciplina disciplina4 = new Disciplina("Java");
		Disciplina disciplina5 = new Disciplina("Sql");
		

		//INSTANCIANDO
		
		EmpresaDao empresaDao = new EmpresaDao(em);
		UnidadeDao unidadeDao = new UnidadeDao(em);
		AlunoDao alunoDao = new AlunoDao(em);
		ProfessorDao professorDao = new ProfessorDao(em);
		CursoDao cursoDao = new CursoDao(em);
		PeriodoDao periodoDao = new PeriodoDao(em);
		DisciplinaDao disciplinaDao = new DisciplinaDao(em);
		
		
		em.getTransaction().begin();
		
		
		
		//EFETUANDO CRUD DE EMPRESAS(POPULANDO)
		empresaDao.cadastrar(empresa4);
		empresaDao.consultarTodos();
		empresaDao.remover(empresa4);
		
		
		
		//EFETUANDO CRUD DE UNIDADES(POPULANDO)
		unidadeDao.cadastrar(unidade1);
		unidadeDao.cadastrar(unidade2);
		unidadeDao.cadastrar(unidade3);
		
		unidadeDao.consultarTodos();
		
		unidadeDao.remover(unidade1);
		
		
		
		
		
		//EFETUANDO CRUD DE ALUNOS(POPULANDO)
		alunoDao.cadastrar(aluno1);
		alunoDao.cadastrar(aluno2);
		alunoDao.cadastrar(aluno3);
		
		alunoDao.consultarTodos();
		
		alunoDao.remover(aluno1);
		
		
		//EFETUANDO CRUD DE PROFESSORES(POPULANDO)
		professorDao.cadastrar(professor1);
		professorDao.cadastrar(professor2);
		professorDao.cadastrar(professor3);
		
		professorDao.consultarTodos();
		
		professorDao.remover(professor1);
		
		
		//EFETUANDO CRUD DE CURSOS(POPULANDO)
		cursoDao.cadastrar(curso1);
		cursoDao.cadastrar(curso2);
		cursoDao.cadastrar(curso3);
		
		cursoDao.consultarTodos();
		
		cursoDao.remover(curso1);
		
		
		//EFETUANDO CRUD DE PERÍODOS(POPULANDO)
		periodoDao.cadastrar(periodo1);
		periodoDao.cadastrar(periodo2);
		periodoDao.cadastrar(periodo3);
		
		periodoDao.consultarTodos();
		
		periodoDao.remover(periodo1);
		
		
		//EFETUANDO CRUD DE DISCIPLINAS(POPULANDO)
		disciplinaDao.cadastrar(disciplina1);
		disciplinaDao.cadastrar(disciplina2);
		disciplinaDao.cadastrar(disciplina3);
		disciplinaDao.cadastrar(disciplina4);
		disciplinaDao.cadastrar(disciplina5);
		
		disciplinaDao.consultarTodos();
		
		disciplinaDao.remover(disciplina1);
		
		
		
		
		
	em.getTransaction().commit();	
	em.close();
			
	}

}



//INSERT

//empresa4.setId(null);
//empresa4.setNome("Faculdade");
//empresa4.setRegiao("Zona Sull");
//
//entityManager.getTransaction().begin();
//entityManager.persist(empresa4);
//entityManager.getTransaction().commit();


//FIND

//Empresa empresa = entityManager.find(Empresa.class, 1);
//entityManager.getTransaction().begin();
//entityManager.getTransaction().commit();


//UPDATE

//entityManager.getTransaction().begin();
//empresa1.setNome(empresa1.getNome()+ "Alterado");
//entityManager.getTransaction().commit();

//Empresa empresa = new Empresa();
//empresa.setId(2);
//empresa.setNome("Faculdade alterada");
///entityManager.getTransaction().begin();
//entityManager.merge(empresa);
//entityManager.getTransaction().commit();

//DELETE

//Empresa empresa = entityManager.find(Empresa.class, 1);
//entityManager.getTransaction().begin();
//entityManager.remove(entityManager);
//entityManager.getTransaction().commit();

