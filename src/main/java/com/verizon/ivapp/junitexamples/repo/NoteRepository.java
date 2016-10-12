package com.verizon.ivapp.junitexamples.repo;

import java.util.List;

import com.verizon.ivapp.junitexamples.domain.Note;

public interface NoteRepository {

	List<Note> findAll();

}
