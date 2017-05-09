package vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

import controlador.FilmControlador;
import modelo.Actor;
import modelo.Film;

import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConsultorFilms extends JDialog {

	private final JPanel contentPanel = new JPanel();

	private JTable tableActores;
	private JTextField textFieldAnioEstreno;
	private JTextField textFieldLengua;
	private JTextArea textAreaDescripcion;
	private JComboBox comboBoxFilms;

	private FilmControlador filmControlador;

	public FilmControlador getFilmControlador() {
		return filmControlador;
	}

	public void setFilmControlador(FilmControlador filmControlador) {
		this.filmControlador = filmControlador;
	}

	/**
	 * Create the dialog.
	 * 
	 * @param modal
	 * @param nagusia
	 */
	public ConsultorFilms(Nagusia nagusia, boolean modal) {
		super(nagusia, modal);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);

		comboBoxFilms = new JComboBox();
		comboBoxFilms.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				rellenarCamposVentana();
			}
		});

		comboBoxFilms.setBounds(10, 31, 203, 20);
		contentPanel.add(comboBoxFilms);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(283, 48, 120, 139);
		contentPanel.add(scrollPane);

		tableActores = new JTable();
		scrollPane.setViewportView(tableActores);

		JLabel lblDescripcion = new JLabel("Descripcion:");
		lblDescripcion.setBounds(10, 83, 58, 14);
		contentPanel.add(lblDescripcion);

		JLabel lblAnioEstreno = new JLabel("A\u00F1o Estreno:");
		lblAnioEstreno.setBounds(10, 145, 70, 14);
		contentPanel.add(lblAnioEstreno);

		JLabel lblLengua = new JLabel("Lengua:");
		lblLengua.setBounds(10, 173, 46, 14);
		contentPanel.add(lblLengua);

		textAreaDescripcion = new JTextArea();
		textAreaDescripcion.setBounds(78, 78, 135, 52);
		contentPanel.add(textAreaDescripcion);

		textFieldAnioEstreno = new JTextField();
		textFieldAnioEstreno.setBounds(78, 142, 135, 20);
		contentPanel.add(textFieldAnioEstreno);
		textFieldAnioEstreno.setColumns(10);

		textFieldLengua = new JTextField();
		textFieldLengua.setBounds(78, 170, 135, 20);
		contentPanel.add(textFieldLengua);
		textFieldLengua.setColumns(10);

		JLabel lblFimls = new JLabel("Fimls");
		lblFimls.setBounds(10, 11, 46, 14);
		contentPanel.add(lblFimls);

		JLabel lblActores = new JLabel("Actores");
		lblActores.setBounds(283, 23, 70, 14);
		contentPanel.add(lblActores);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
		}
	}

	protected void rellenarCamposVentana() {
		String comboBoxDatos = (String) comboBoxFilms.getSelectedItem();
		String[] partes = comboBoxDatos.split(":");
		String idFilm = partes[0];
		
		this.filmControlador.rellenarCamposConsultorFilms(idFilm);
	}

	public void rellenarComboPeliculas(ArrayList<Film> peliculas) {
//		DefaultComboBoxModel defaultComboBoxModel = new DefaultComboBoxModel();
		
		for (Film film : peliculas) {
			this.comboBoxFilms.addItem(film.getFilm_id() + ": " + film.getTitle());
		}
		
//		comboBoxFilms.setModel(defaultComboBoxModel);
	}

	public void rellenarCamposFilm(Film film) {
		this.textAreaDescripcion.setText(film.getDescription());
		this.textFieldAnioEstreno.setText(String.valueOf(film.getRelease_year()));
		this.textFieldLengua.setText(String.valueOf(film.getLanguage_id()));
	}

	public void rellenarTablaActores(ArrayList<Actor> actores) {
		//Tabla logikoa sortu
		DefaultTableModel tableModel = new DefaultTableModel();
		
		//Burukoak bete
		Object[] burukoak = {"NOMBRE", "APELLIDO"}; 
		tableModel.setColumnIdentifiers(burukoak);
				
		//tabla bete
		for (Actor actor : actores){
			Object[] lerroa = {actor.getFirst_name(), actor.getLast_name()};
			tableModel.addRow(lerroa);
		}
			
		//tablari formatua eman
		tableActores.setModel(tableModel);
				
		//Alfabetikoki ordenatu taula
		TableRowSorter<DefaultTableModel> modeloOrdenado = new TableRowSorter<DefaultTableModel>(tableModel);
		tableActores.setRowSorter(modeloOrdenado);
	}
}
