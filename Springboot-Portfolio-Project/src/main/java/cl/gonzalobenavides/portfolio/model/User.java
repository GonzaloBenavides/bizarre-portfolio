package cl.gonzalobenavides.portfolio.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name = "users", 
	uniqueConstraints = @UniqueConstraint(columnNames = {"email"}))
public class User extends Visitor{
	private static final long serialVersionUID =1L;
	

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	Long id;
	
	@Column(name = "password", nullable = false)
	String password;

	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "user_role", 
		joinColumns = @JoinColumn(name="user_id", referencedColumnName = "id"), 
		inverseJoinColumns = @JoinColumn(name="role_id", referencedColumnName = "id"),
		uniqueConstraints = {@UniqueConstraint(columnNames = {"user_id", "role_id"})})
	List<Rol> roles;

	public User() {}

	public User(String fullName, String email, String password) {
		this.fullName = fullName;
		this.email = email;
		this.password = password;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Rol> getRoles() {
		return roles;
	}

	public void setRoles(List<Rol> roles) {
		this.roles = roles;
	}
}
