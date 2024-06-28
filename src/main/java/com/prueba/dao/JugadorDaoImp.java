package com.prueba.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.prueba.model.Jugador;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;



@Repository
public class JugadorDaoImp implements JugadorDao{
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<Jugador> obtenerJugador() {
		String query="from Jugador";
		return entityManager.createQuery(query).getResultList();
		
	}

}
