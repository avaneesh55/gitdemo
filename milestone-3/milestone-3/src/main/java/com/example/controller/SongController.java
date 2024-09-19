package com.example.controller;

import com.example.entity.*;
import com.example.service.SongService;
import com.example.exception.CustomException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/songs")
public class SongController {

    @Autowired
    private SongService songService;

    @PostMapping
    public ResponseEntity<Song> addSong(@RequestBody Song song) {
        Song savedSong = songService.addNewSong(song);
        return ResponseEntity.ok(savedSong);
    }

    @GetMapping("/search/singer/{singer}")
    public ResponseEntity<List<Song>> getSongsBySinger(@PathVariable String singer) {
        List<Song> songs = songService.findSongsSungBy(singer);
        return ResponseEntity.ok(songs);
    }

    @GetMapping("/search/genre/{genre}")
    public ResponseEntity<List<Song>> getSongsByGenre(@PathVariable String genre) {
        List<Song> songs = songService.findSongsOfType(genre);
        return ResponseEntity.ok(songs);
    }
}