package com.verizon.ivapp.junitexamples.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.verizon.ivapp.junitexamples.domain.Note;

@Repository
public class JPANoteRepo implements NoteRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public List<Note> findAll() {
		return this.entityManager.createQuery("SELECT n FROM Note n", Note.class)
				.getResultList();
	}

}
