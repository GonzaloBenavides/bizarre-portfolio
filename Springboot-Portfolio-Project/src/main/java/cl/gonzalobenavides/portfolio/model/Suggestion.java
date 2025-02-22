package cl.gonzalobenavides.portfolio.model;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "suggestions")
public class Suggestion implements Serializable{
	private static final long serialVersionUID =1L;


	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "id")
	private Long id;
	
	@Column(name = "created_at")
	private Date createdAt;
	
	@Column(name = "suggestion_value")
	private String suggestionText;

	@ManyToOne // One Visitor - Many Suggestions
	@JoinColumn(name = "id_visitor", nullable = false)
	@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
	private Visitor visitor;
	
	public Suggestion() {
		createdAt = new Date();
	}

	public Long getId() {
		return id;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public String getSuggestionText() {
		return suggestionText;
	}

	public void setSuggestionText(String suggestionText) {
		this.suggestionText = suggestionText;
	}

	public Visitor getVisitor() {
		return visitor;
	}

	public void setVisitor(Visitor visitor) {
		this.visitor = visitor;
	}
}
