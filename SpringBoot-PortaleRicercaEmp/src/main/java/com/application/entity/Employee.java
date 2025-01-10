package com.application.entity;

import java.sql.Date;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "EMPLOYEES")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "employee_id")
	private Long id;

	@Column(name = "first_name")
	private String nome;

	@Column(name = "last_name")
	private String cognome;

	@Column(name = "email")
	private String email;

	@Column(name = "phone_number")
	private String telefono;

	@Column(name = "hire_date")
	private Date dataAssunzione;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "job_id", nullable = false)
	private Job lavoro;

	@Column(name = "salary")
	private int salario;

	@Column(name = "COMMISSION_PCT")
	private Float percComm;

	//PER MAPPARE L'AUTO JOIN
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "manager_id")
	private Employee manager;
	
	@OneToMany(mappedBy = "manager")
    private Set<Employee> subordinates;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "department_id")
	private Department department;
	
	@OneToOne(mappedBy = "manager")
    private Department managedDepartment;

	public String getNome() {
		return (nome != null) ? nome : "";
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

	public Job getLavoro() {
		return lavoro;
	}

	public void setLavoro(Job lavoro) {
		this.lavoro = lavoro;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	public Float getPercComm() {
		return (percComm != null) ? percComm : 0.0f;
	}

	public void setPercComm(Float percComm) {
		this.percComm = percComm;
	}

	public Employee getManager() {
		return (manager != null) ? manager : new Employee();
	}

	public void setManager(Employee manager) {
		this.manager = manager;
	}

	public Set<Employee> getSubordinates() {
		return subordinates;
	}

	public void setSubordinates(Set<Employee> subordinates) {
		this.subordinates = subordinates;
	}

	public Department getDep() {
		return (department != null) ? department : new Department();
	}

	public void setDep(Department department) {
		this.department = department;
	}

	public Long getId() {
		return id;
	}

}
