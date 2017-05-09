package controlador;

import java.util.ArrayList;

import modelo.Film;
import modelo.FilmModelo;
import vista.ConsultorFilms;

public class FilmControlador {

	private FilmModelo filmModelo;
	private ConsultorFilms consultorFilms;

	// Metodoak

	// Getters eta Setters
	public FilmModelo getFilmModelo() {
		return filmModelo;
	}

	public void setFilmModelo(FilmModelo filmModelo) {
		this.filmModelo = filmModelo;
	}

	public ConsultorFilms getConsultorFilms() {
		return consultorFilms;
	}

	public void setConsultorFilms(ConsultorFilms consultorFilms) {
		this.consultorFilms = consultorFilms;
	}

	public void abrirVentanaConsultorFilms() {
		ArrayList peliculas = filmModelo.select();
		consultorFilms.rellenarComboPeliculas(peliculas);

		this.consultorFilms.setVisible(true);
	}

	public void rellenarCamposConsultorFilms(String idFilm) {
		Film film = filmModelo.select(idFilm);
		ArrayList actores = filmModelo.select(Integer.parseInt(idFilm));
		
		this.consultorFilms.rellenarTablaActores(actores);
		this.consultorFilms.rellenarCamposFilm(film);
	}

}