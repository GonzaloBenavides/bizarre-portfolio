package cl.gonzalobenavides.portfolio.model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Rol {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "rol", nullable = false)
    String rol;

    public Rol() {}

    public Rol(String rol) {
        this.rol = rol;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getRol() {
        return rol;
    }
    public void setRol(String rol) {
        this.rol = rol;
    }

    
}
