package controlador;

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JOptionPane;

import modelo.Actor;
import modelo.ActorModelo;
import vista.FormularioActor;
import vista.Nagusia;

public class ActorControlador {

	private ActorModelo actorModelo;
	private FormularioActor formularioActor;

	// Metodoak
	public void abrirVentanaFormularioActor() {
		this.formularioActor.setVisible(true);
	}

	public void insertarNuevoActor(String nombre, String apellido) {
		Actor actor = new Actor();
		actor.setFirst_name(nombre);
		actor.setLast_name(apellido);

		actorModelo.insert(actor);
		JOptionPane.showMessageDialog(formularioActor, nombre + " " + apellido + " gordeta", "Bien", 1);
	}

	// Getters eta Setters
	public FormularioActor getFormularioActor() {
		return formularioActor;
	}

	public void setFormularioActor(FormularioActor formularioActor) {
		this.formularioActor = formularioActor;
	}

	public ActorModelo getActorModelo() {
		return actorModelo;
	}

	public void setActorModelo(ActorModelo actorModelo) {
		this.actorModelo = actorModelo;
	}
}
