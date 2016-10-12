/**
 * 
 */
package com.verizon.ivapp.junitexamples;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import com.verizon.ivapp.junitexamples.domain.Note;
import com.verizon.ivapp.junitexamples.repo.JPANoteRepo;
/**
 * @author Anand
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
@ActiveProfiles("test")
public class NoteRepoTest {

	@Autowired
	JPANoteRepo repository;
	@Test
	public void findsAllNotes() {
		List<Note> notes = this.repository.findAll();
		assertThat(notes).hasSize(3);
		for (Note note : notes) {
			System.out.println("AAAAA"+note.getBody());
		}
	}
}
