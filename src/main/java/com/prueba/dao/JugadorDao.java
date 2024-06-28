package com.prueba.dao;

import java.util.List;

import com.prueba.model.Jugador;

import jakarta.transaction.Transactional;

@Transactional
public interface JugadorDao {
	
	List<Jugador> obtenerJugador();

}
