package cl.gonzalobenavides.portfolio.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name = "visitor", 
	uniqueConstraints = @UniqueConstraint(columnNames = {"email"}))
public class Visitor implements Serializable{
	private static final long serialVersionUID =1L;
	

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	Long id;
	
	@Column(name = "fullName")
	String fullName;
	
	@Column(name = "email", nullable = false)
	String email;

	public Visitor() {}

	public Visitor(String fullName, String email) {
		this.fullName = fullName;
		this.email = email;
	}

	public Long getId() {
		return id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
