package entidades;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Relatorio {
	@Id
	@GeneratedValue
	private Integer id;
	@Temporal(TemporalType.DATE)
	@Column(name = "data_de_registro")
	private Date dataregistro;
	
	//variaveis da vitima
	@Column(name = "nome_da_vitima")
	private String vitima_nome;
	@Column(name = "sexo_da_vitima")
	private String vitima_sexo;
	@Temporal(TemporalType.DATE)
	@Column(name = "idade_da_vitima")
	private Date vitima_idade;
	@Column(name = "serie_da_vitima")
	private Integer vitima_serie;
	@Column(name = "endereco_da_vitima")
	private String vitima_Endereco;
	
	//variaveis do agressor
	@Column(name = "nome_do_agressor")
	private String agressor_nome;
	@Column(name = "sexo_do_agressor")
	private String agressor_sexo;
	@Temporal(TemporalType.DATE)
	@Column(name = "idade_do_agressor")
	private Date agressor_idade;
	@Column(name = "parentesco_com_a_vitima")
	private String agressor_parentesco;
	@Column(name = "profissão_do_agressor")
	private String agressor_profissao;
	


	@Column(name = "raca")
	private String raca;
	@Column(name = "genero")
	private String genero;
	@Column(name = "orienteação_sexual")
	private String orientacaosexual;
	@Column(name = "escolaridade")
	private String escolaridade;

	@Column(name = "incidente")
	private String incidente;

	@Column(name = "violação_de_direito")
	private String violacaodireito;

	
	public String toString() {
		return "relatorio de id " + id;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}public String getVitima_nome() {
		return vitima_nome;
	}
	public void setVitima_nome(String vitima_nome) {
		this.vitima_nome = vitima_nome;
	}
	public Date getVitima_idade() {
		return vitima_idade;
	}
	public void setVitima_idade(Date vitima_idade) {
		this.vitima_idade = vitima_idade;
	}
	public Integer getVitima_serie() {
		return vitima_serie;
	}
	public void setVitima_serie(Integer vitima_serie) {
		this.vitima_serie = vitima_serie;
	}
	public String getVitima_Endereco() {
		return vitima_Endereco;
	}
	public void setVitima_Endereco(String vitima_Endereco) {
		this.vitima_Endereco = vitima_Endereco;
	}
	public String getAgressor_nome() {
		return agressor_nome;
	}
	public void setAgressor_nome(String agressor_nome) {
		this.agressor_nome = agressor_nome;
	}
	public Date getAgressor_idade() {
		return agressor_idade;
	}
	public void setAgressor_idade(Date agressor_idade) {
		this.agressor_idade = agressor_idade;
	}
	public String getAgressor_parentesco() {
		return agressor_parentesco;
	}
	public void setAgressor_parentesco(String agressor_parentesco) {
		this.agressor_parentesco = agressor_parentesco;
	}
	public String getAgressor_profissao() {
		return agressor_profissao;
	}
	public void setAgressor_profissao(String agressor_profissao) {
		this.agressor_profissao = agressor_profissao;
	}
	public Date getDataregistro() {
		return dataregistro;
	}
	public void setDataregistro(Date dataregistro) {
		this.dataregistro = dataregistro;
	}
	public String getVitima_sexo() {
		return vitima_sexo;
	}
	public void setVitima_sexo(String vitima_sexo) {
		this.vitima_sexo = vitima_sexo;
	}
	public String getAgressor_sexo() {
		return agressor_sexo;
	}
	public void setAgressor_sexo(String agressor_sexo) {
		this.agressor_sexo = agressor_sexo;
	}
	public String getescolaridade() {
		return escolaridade;
	}
	public void setescolaridade(String escolaridade) {
		this.escolaridade = escolaridade;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getOrientacaosexual() {
		return orientacaosexual;
	}
	public void setOrientacaosexual(String orientacaosexual) {
		this.orientacaosexual = orientacaosexual;
	}
	public String getincidente() {
		return incidente;
	}
	public void setincidente(String incidente) {
		this.incidente = incidente;
	}
	public String getViolacaodireito() {
		return violacaodireito;
	}
	public void setViolacaodireito(String violacaodireito) {
		this.violacaodireito = violacaodireito;
	}
}
