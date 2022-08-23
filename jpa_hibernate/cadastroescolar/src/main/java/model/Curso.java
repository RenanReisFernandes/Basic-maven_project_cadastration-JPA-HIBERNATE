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
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Cursos")
public class Curso implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name ="Nome_Curso")
	private String nome;
	
	@ManyToMany(cascade = CascadeType.PERSIST)
	private List<Periodo> periodos;
	
	@ManyToMany(cascade = CascadeType.PERSIST)
	private List<Unidade> unidades;
	
	@ManyToMany(mappedBy = "cursos", cascade = CascadeType.PERSIST)
	private List<Disciplina> disciplinas;
	

	public Curso() {}


	public Curso(String nome) {
		
		this.nome = nome;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public List<Periodo> getPeriodos() {
		return periodos;
	}


	public void setPeriodos(List<Periodo> periodos) {
		this.periodos = periodos;
	}


	public List<Unidade> getUnidades() {
		return unidades;
	}


	public void setUnidades(List<Unidade> unidades) {
		this.unidades = unidades;
	}


	@Override
	public String toString() {
		return "Curso [id=" + id + ", nome=" + nome + ", periodos=" + periodos + ", unidades=" + unidades + "]";
	}

	
	
}
