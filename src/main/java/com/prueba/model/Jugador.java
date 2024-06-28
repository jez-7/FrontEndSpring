package com.prueba.model;

import jakarta.persistence.*;

@Entity
@Table(name="players")
public class Jugador {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="apellido")
	private String apellido;
	
	@Column(name="club")
	private String club;
	
	@Column(name="camiseta")
	private int camiseta;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getClub() {
		return club;
	}
	public void setClub(String club) {
		this.club = club;
	}
	public int getCamiseta() {
		return camiseta;
	}
	public void setCamiseta(int camiseta) {
		this.camiseta = camiseta;
	}
	
	
	

}
