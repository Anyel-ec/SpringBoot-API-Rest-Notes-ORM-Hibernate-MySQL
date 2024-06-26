package top.anyel.hibernate.controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import top.anyel.hibernate.exceptions.ResourceNotFoundException;
import top.anyel.hibernate.models.NoteAppd;
import top.anyel.hibernate.repositories.NoteAppdRepository;

import java.util.List;


@RestController
@RequestMapping("/api")
public class NodeAppdController {

    @Autowired
    NoteAppdRepository noteRepository;
    // Get All Notes
    @GetMapping("/notes")
    public List<NoteAppd> getAllNotes() {
        return noteRepository.findAll();
    }
    // Create a new Note
    @PostMapping("/notes")
    public NoteAppd createNote(@Valid @RequestBody NoteAppd note) {
        return noteRepository.save(note);
    }
    // Get a Single Note
    @GetMapping("/notes/{id}")
    public NoteAppd getNoteById(@PathVariable(value = "id") Long noteId) {
        return noteRepository.findById(noteId)
                .orElseThrow(() -> new ResourceNotFoundException("Note", "id", noteId));
    }

    @PutMapping("/notes/{id}")
    public NoteAppd updateNote(@PathVariable(value = "id") Long noteId,
                           @Valid @RequestBody NoteAppd noteDetails) {
        NoteAppd note = noteRepository.findById(noteId)
                .orElseThrow(() -> new ResourceNotFoundException("Note", "id", noteId));
        note.setTitle(noteDetails.getTitle());
        note.setContent(noteDetails.getContent());
        NoteAppd updatedNote = noteRepository.save(note);
        return updatedNote;
    }
    // Delete a Note
    @DeleteMapping("/notes/{id}")
    public ResponseEntity<?> deleteNote(@PathVariable(value = "id") Long noteId) {
        NoteAppd note = noteRepository.findById(noteId)
                .orElseThrow(() -> new ResourceNotFoundException("Note", "id", noteId));
        noteRepository.delete(note);
        return ResponseEntity.ok().build();
    }

}
