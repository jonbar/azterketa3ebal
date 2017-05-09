package vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.ActorControlador;
import modelo.Actor;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FormularioActor extends JDialog {

	private final JPanel contentPanel = new JPanel();

	private JTextField textNombre;
	private JTextField textApellido;
	private ActorControlador actorControlador;

	public ActorControlador getActorControlador() {
		return actorControlador;
	}

	public void setActorControlador(ActorControlador actorControlador) {
		this.actorControlador = actorControlador;
	}

	/**
	 * Create the dialog.
	 * 
	 * @param modal
	 * @param nagusia
	 */
	public FormularioActor(Nagusia nagusia, boolean modal) {
		super(nagusia, modal);
		setTitle("Formulario Actor");

		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNombre = new JLabel("Nombre");
			lblNombre.setBounds(22, 35, 46, 14);
			contentPanel.add(lblNombre);
		}

		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(22, 72, 46, 14);
		contentPanel.add(lblApellido);

		textNombre = new JTextField();
		textNombre.setBounds(78, 32, 86, 20);
		contentPanel.add(textNombre);
		textNombre.setColumns(10);

		textApellido = new JTextField();
		textApellido.setBounds(78, 69, 86, 20);
		contentPanel.add(textApellido);
		textApellido.setColumns(10);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton gaurdarButton = new JButton("Guardar");
				gaurdarButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						crearNuevoActor();
						limpiarTextFields();
					}
				});
				gaurdarButton.setActionCommand("Guardar");
				buttonPane.add(gaurdarButton);
				getRootPane().setDefaultButton(gaurdarButton);
			}
		}
	}

	protected void crearNuevoActor() {
		// textfieldeko string-ak atera
		String nombre = textNombre.getText();
		String apellido = textApellido.getText();

		actorControlador.insertarNuevoActor(nombre, apellido);
	}

	protected void limpiarTextFields() {
		textNombre.setText("");
		textApellido.setText("");
	}
}
