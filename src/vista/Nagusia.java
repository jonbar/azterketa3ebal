package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.ActorControlador;
import controlador.FilmControlador;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Nagusia extends JFrame {

	private JPanel contentPane;
	private ActorControlador actorControlador;
	private FilmControlador filmControlador;

	public ActorControlador getActorControlador() {
		return actorControlador;
	}

	public void setActorControlador(ActorControlador actorControlador) {
		this.actorControlador = actorControlador;
	}

	public FilmControlador getFilmControlador() {
		return filmControlador;
	}

	public void setFilmControlador(FilmControlador filmControlador) {
		this.filmControlador = filmControlador;
	}

	/**
	 * Create the frame.
	 */
	public Nagusia() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnInsertarActor = new JButton("Insertar Actor");
		btnInsertarActor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				actorControlador.abrirVentanaFormularioActor();
			}
		});
		btnInsertarActor.setBounds(90, 57, 137, 23);
		contentPane.add(btnInsertarActor);
		
		JButton btnConsultarFilms = new JButton("Consultar Films");
		btnConsultarFilms.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				filmControlador.abrirVentanaConsultorFilms();
			}
		});
		btnConsultarFilms.setBounds(90, 113, 137, 23);
		contentPane.add(btnConsultarFilms);
	}
	
}
