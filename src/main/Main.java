package main;

import controlador.ActorControlador;
import controlador.FilmControlador;
import vista.*;
import modelo.*;

public class Main {

	public static void main(String[] args) {

		//Controladoreak sortu
		ActorControlador actorControlador = new ActorControlador();
		FilmControlador filmControlador = new FilmControlador();
		
		//Modeloak sortu
		ActorModelo actorModelo = new ActorModelo();
		FilmModelo filmModelo = new FilmModelo();
		
		//Lehioak sortu
		Nagusia nagusia = new Nagusia();
		nagusia.setActorControlador(actorControlador);
		nagusia.setFilmControlador(filmControlador);
		
		FormularioActor formularioActor = new FormularioActor(nagusia, true);
		formularioActor.setActorControlador(actorControlador);
		
		ConsultorFilms consultorFilms = new ConsultorFilms(nagusia, true);
		consultorFilms.setFilmControlador(filmControlador);
		
		
		//Modeloak eta lehioak gehitu controleadorari
		actorControlador.setActorModelo(actorModelo);
		actorControlador.setFormularioActor(formularioActor);
		
		filmControlador.setConsultorFilms(consultorFilms);
		filmControlador.setFilmModelo(filmModelo);
		
		nagusia.setVisible(true);
	}

}
