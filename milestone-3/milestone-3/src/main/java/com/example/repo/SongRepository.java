package com.example.repo;


import com.example.entity.Song;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SongRepository extends JpaRepository<Song, Integer> {
    List<Song> findByLeadSinger(String leadSinger);
    List<Song> findByGenre(String genre);
}