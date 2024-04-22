package com.webservice.filmapp.repository;

import com.webservice.filmapp.model.Film;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmRepository extends JpaRepository<Film, String> {
}
