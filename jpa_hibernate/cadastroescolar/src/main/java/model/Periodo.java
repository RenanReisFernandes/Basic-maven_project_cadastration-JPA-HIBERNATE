package model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name ="Períodos")
public class Periodo implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "Periodo_do_curso")
	private String periodocurso;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	private Curso curso;
	
	@OneToMany(cascade = CascadeType.PERSIST)
	private List<Disciplina> disciplinas;
	

	public Periodo() {}


	public Periodo(String periodocurso) {
		
		this.periodocurso = periodocurso;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getPeriodocurso() {
		return periodocurso;
	}


	public void setPeriodocurso(String periodocurso) {
		this.periodocurso = periodocurso;
	}


	public Curso getCurso() {
		return curso;
	}


	public void setCurso(Curso curso) {
		this.curso = curso;
	}


	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}


	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}


	@Override
	public String toString() {
		return "Periodo [id=" + id + ", periodocurso=" + periodocurso + ", curso=" + curso + ", disciplinas="
				+ disciplinas + "]";
	}


	
}
