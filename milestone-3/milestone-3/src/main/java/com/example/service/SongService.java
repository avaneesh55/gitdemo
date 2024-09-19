package com.example.service;

import com.example.entity.Song;
import com.example.repo.SongRepository;
import com.example.exception.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongService {

    @Autowired
    private SongRepository songRepository;

    public Song addNewSong(Song song) {
        return songRepository.save(song);
    }

    public List<Song> findSongsSungBy(String singer) {
        List<Song> songs = songRepository.findByLeadSinger(singer);
        if (songs.isEmpty()) {
            throw new CustomException("No song found");
        }
        return songs;
    }

    public List<Song> findSongsOfType(String genre) {
        List<Song> songs = songRepository.findByGenre(genre);
        if (songs.isEmpty()) {
            throw new CustomException("No song found");
        }
        return songs;
    }
}