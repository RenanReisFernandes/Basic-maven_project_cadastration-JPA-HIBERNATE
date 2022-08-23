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
import javax.persistence.Table;

@Entity
@Table(name ="Professores")
public class Professor implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "Matricula")
	private String matricula;
	
	@Column(name ="Nome")
	private String nome;
	
	@Column(name ="Endereco")
	private String endereco;
	
	@Column(name ="Email")
	private String amail;
	
	@ManyToMany(mappedBy = "professores")
	private List<Unidade> unidades;
	
	
	public Professor() {}


	public Professor(String matricula, String nome, String endereco, String amail) {
	
		this.matricula = matricula;
		this.nome = nome;
		this.endereco = endereco;
		this.amail = amail;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
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


	public String getAmail() {
		return amail;
	}


	public void setAmail(String amail) {
		this.amail = amail;
	}


	public List<Unidade> getUnidades() {
		return unidades;
	}


	public void setUnidades(List<Unidade> unidades) {
		this.unidades = unidades;
	}


	@Override
	public String toString() {
		return "Professor [id=" + id + ", matricula=" + matricula + ", nome=" + nome + ", endereco=" + endereco
				+ ", amail=" + amail + ", unidades=" + unidades + "]";
	}


	
}
