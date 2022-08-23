package model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name ="Unidades")
public class Unidade implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name ="Numero_da_unidade")
	private Integer numerounidade;
	
	@Column(name ="Nome_da_unidade")
	private String nome;
	
	@Column(name ="Endereco_da_unidade")
	private String endereco;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "empresa_id")
	private Empresa empresa;
	
	@ManyToMany(cascade = CascadeType.PERSIST)
	@JoinTable(name = "unidade_do_aluno")
	private List<Aluno> alunos;
	
	@ManyToMany(cascade = CascadeType.PERSIST)
	@JoinTable(name = "unidade_do_professor")
	private List<Professor> professores;
	
	@ManyToMany(cascade = CascadeType.PERSIST)
	@JoinTable(name = "unidade_do_curso")
	private List<Curso> cursos;
	
		
	public Unidade() {}


	public Unidade(Integer numerounidade, String nome, String endereco) {
		super();
		this.numerounidade = numerounidade;
		this.nome = nome;
		this.endereco = endereco;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Integer getNumerounidade() {
		return numerounidade;
	}


	public void setNumerounidade(Integer numerounidade) {
		this.numerounidade = numerounidade;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public Empresa getEmpresa() {
		return empresa;
	}


	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}


	public List<Aluno> getAlunos() {
		return alunos;
	}


	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}


	public List<Professor> getProfessores() {
		return professores;
	}


	public void setProfessores(List<Professor> professores) {
		this.professores = professores;
	}


	public List<Curso> getCursos() {
		return cursos;
	}


	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}


	@Override
	public String toString() {
		return "Unidade [id=" + id + ", numerounidade=" + numerounidade + ", nome=" + nome + ", endereco=" + endereco
				+ ", empresa=" + empresa + ", alunos=" + alunos + ", professores=" + professores + ", cursos=" + cursos
				+ "]";
	}


	
	
	}
