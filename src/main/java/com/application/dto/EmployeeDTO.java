package com.application.dto;

import java.sql.Date;

public class EmployeeDTO {

	private Long id;
	private String nome;
	private String cognome;
	private String email;
	private String telefono;
	private Date dataAssunzione;
	private String nomeLavoro;
	private int salario;
	private double percComm;
	private String nomeManager;
	private Long idDip;
	
	public EmployeeDTO() {
		super();
	}

	public EmployeeDTO(Long id, String nome, String cognome, String email, String telefono, Date dataAssunzione,
			String nomeLavoro, int salario, double percComm, String nomeManager, Long idDip) {
		super();
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
		this.telefono = telefono;
		this.dataAssunzione = dataAssunzione;
		this.nomeLavoro = nomeLavoro;
		this.salario = salario;
		this.percComm = percComm;
		this.nomeManager = nomeManager;
		this.idDip = idDip;
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

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Date getDataAssunzione() {
		return dataAssunzione;
	}

	public void setDataAssunzione(Date dataAssunzione) {
		this.dataAssunzione = dataAssunzione;
	}

	public String getNomeLavoro() {
		return nomeLavoro;
	}

	public void setNomeLavoro(String nomeLavoro) {
		this.nomeLavoro = nomeLavoro;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	public double getPercComm() {
		return percComm;
	}

	public void setPercComm(double percComm) {
		this.percComm = percComm;
	}

	public String getNomeManager() {
		return nomeManager;
	}

	public void setNomeManager(String nomeManager) {
		this.nomeManager = nomeManager;
	}

	public Long getIdDip() {
		return idDip;
	}

	public void setIdDip(Long idDip) {
		this.idDip = idDip;
	}

}
