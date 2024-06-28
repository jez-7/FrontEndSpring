package com.prueba.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.prueba.dao.JugadorDao;
import com.prueba.model.Jugador;

@RestController
public class JugadorController {
	
	
	@GetMapping("/prueba")
	public String jugador() {
		return "Pedro";
	}
	
	@GetMapping("/lista")
	public List<String> lista() {
		return List.of("Messi", "Neymar", "Ronaldo");
	}
	
	@GetMapping("/jugador/{id}")
	public Jugador getJugador(@PathVariable Long id) {
		Jugador jugador = new Jugador();
		jugador.setId(id);
		jugador.setNombre("Leonel");
		jugador.setApellido("Messi");
		jugador.setClub("Inter Miami");
		jugador.setCamiseta(10);
		
		return jugador;
		
	}
 
	@GetMapping("/ListaJugadores")
	public List<Jugador> listaJugadores(){
		List<Jugador> lista = new ArrayList<>();
		
		Jugador jugador1 = new Jugador();
		
		jugador1.setId(1L);
		jugador1.setNombre("Luis");
		jugador1.setApellido("Suarez");
		jugador1.setClub("Inter Miami");
		jugador1.setCamiseta(9);
		
		lista.add(jugador1);
		
        Jugador jugador2 = new Jugador();
		
        jugador2.setId(2L);
        jugador2.setNombre("Julian");
        jugador2.setApellido("Alvarez");
        jugador2.setClub("Manchester City");
        jugador2.setCamiseta(19);
		
		lista.add(jugador2);
		
		return lista;
	}
	
	
	
	
	
	@Autowired
	private JugadorDao jugadorDao;
	
	//INYECCION DE DEPENDENCIAS
	
	@GetMapping("api/jugador")
	public List<Jugador> getJugador() {
		List<Jugador> jugador = jugadorDao.obtenerJugador();
		
		return jugador;
	}
		
		
	
}
		
		
	
		

